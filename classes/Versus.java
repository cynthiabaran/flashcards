package classes;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import classes.Game;
import classes.Player;

import java.util.Scanner;

/** Class classes.Versus
 *
 *
 */

public class Versus extends Game { // classes.Versus is a specific classes.Game type

    private Player p2;
    private int p1Points=0;
    private int p2Points=0;
    private int counter=0;

    public void start() throws InterruptedException{
        Scanner scanf = new Scanner(System.in);
        String input = "";

        System.out.println("Type 'quit' to quit\n");
        while(true){
            counter++;
            System.out.println("## Scoreboard ##");
            System.out.println("Player 1's points:"+String.valueOf(p1Points));
            System.out.println("Player 2's points:"+String.valueOf(p2Points)+"\n");


            if (p1Points==10) {
                System.out.println("Player 1 wins");
                break;
            } else if (p2Points==10) {
                System.out.println("Player 2 wins!");
                break;
            }

            if (counter%2==1) {
                System.out.println("==> Player 1's turn\n");
            } else {
                System.out.println("==> Player 2's turn\n");
            }

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
                    if (counter%2==1) {
                        p1Points++;
                        System.out.println("Player 1 -> +1 point\n");
                    } else {
                        p2Points++;
                        System.out.println("Player 2 -> +1 point\n");
                    }

                }else{
                    //Wrong answer :c
                    System.out.println("Wrong answer!");
                }
                System.out.println("\nNext card will be shown in a second.\n");
                Thread.sleep(1000);
            }
        }
        scanf.close();
    }
}