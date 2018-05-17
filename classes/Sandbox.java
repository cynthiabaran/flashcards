package classes;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import java.util.Scanner;

import classes.Game;

/** Class classes.Sandbox
 *
 * classes.Sandbox game type, the player
 * can play for how long he wants
 * and quit whenever he wants
 */

public class Sandbox extends Game { // classes.Sandbox is a specific classes.Game type
    // parameters
    private float timeElapsed;

    // constructors
    Sandbox(Player p1) {
    	super(p1);
    }

    public void start() throws InterruptedException{
    	Scanner scanf = new Scanner(System.in);
    	String input = "";
    	System.out.println("Type 'quit' to quit");
    	while(true){
    		Card card = super.getRandomCard();
//    		There is no answer so we just show
    		if(card.getCardType().equals("content")){
    			System.out.println(card.getTitle());
    			System.out.println("Enter anything to show the content:");
    			input = scanf.next();
    			if(input.toLowerCase().equals("quit")){
        			break;
        		};
    			System.out.println(card.getContent());
    			System.out.println("Next card will be shown in a second.");
    			Thread.sleep(1000);
    		}else if (card instanceof Question){
    			Question question = (Question) card;
    			System.out.println("Answer the question: " + question.getTitle());
    			input = scanf.next();
    			if(input.toLowerCase().equals("quit")){
        			break;
        		};
    			if(question.tryAnswer(input)){
    				//Right answer ;D
    				System.out.println("Right answer!");
    			}else{
    				//Wrong answer :c
    				System.out.println("Wrong answer!");
    			}
    			System.out.println("Next card will be shown in a second.");
    			Thread.sleep(1000);
    		}
    	}
    	scanf.close();
    }
    // methods
    /* earnPoints (static from classes.TimeAttack) */
}