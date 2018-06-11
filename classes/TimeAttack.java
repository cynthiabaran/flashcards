package classes;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import java.util.Scanner;
import java.util.*;

import classes.Card;
import classes.Game;
import classes.Player;

/** Class classes.TimeAttack
 *
 * Time attack game type,
 * the player has a maximum time to crack
 * all the cards (usually Q&A);
 *
 */

public class TimeAttack extends Game { // classes.TimeAttack is a specific classes.Game type
    // parameters
    private final long MAX_TIME;
    private float timeElapsed;
    private Timer timer;
    private boolean endOfGame;

    // constructors
    TimeAttack(long time) { // default constructor
        MAX_TIME = time;
        timeElapsed = 0;
        endOfGame = false;
    }
    // TODO: define constructor(s) for this class

    // methods
    public void showPoints(Player p, float points) {
        System.out.println("Points: " + p.getPlayerPoints());
    }

    public static void earnPoints(Player p, Card cards) {
        p.setPlayerPoints(p.getPlayerPoints() + 1);
    }

    public static void losePoints(Player p) {
        p.setPlayerPoints(p.getPlayerPoints() - 1);
    }

    public void start() throws InterruptedException{
    	Scanner scanf = new Scanner(System.in);
    	String input = "";
    	System.out.println("Starting in:");
    	for(int cd = 3;cd > 0; cd--){
    		System.out.println(cd + "...");
    		Thread.sleep(1000);
    	}
    	timer = new Timer();
    	timer.schedule(new endOfGameTask(), MAX_TIME*1000);
    	while(!endOfGame){
    		//get a random question
    		Card card = super.getRandomCard("question");
//    		player tries to answer
			Question question = (Question) card;
			System.out.println("Answer the question: " + question.getTitle());
			input = scanf.next();
			if(question.tryAnswer(input)){
				//Right answer ;D
				System.out.println("Right answer!");
				//Resets the timer
				timer.cancel();
				timer = new Timer();
				timer.schedule(new endOfGameTask(), MAX_TIME*1000);
			}else{
				//Wrong answer :c
				System.out.println("Wrong answer!");
			}
    	}
    	scanf.close();
    }
    //intern class to end the game
    class endOfGameTask extends TimerTask {
        public void run() {
            System.out.println("Time's up!");
            timer.cancel();
            endOfGame = true;
        }
    }
}