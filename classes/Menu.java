package classes; 
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import java.io.IOException;
import java.util.Scanner;

/** Class Menu
 * @brief Makes the splash Menu of the app, where the user choose
 * which type of game he'll play, return the Game type object
 */
public class Menu {

    private Scanner scanf;

    Menu(){
        scanf = new Scanner(System.in);
    }

    /**
     * Show the initial menu of the game
     * @return the game type selected by the user in the menu
     */
    public Game makeMenu() {
        showSplash();

        GameType type = null;

        do {
            showChoices();
            String mode = scanf.next();
            try {
                int k = Integer.parseInt(mode);
                try {
                    type = GameType.gatGameType(k);
                } catch (IOException e) {
                    System.out.println(e.getMessage() + "\n");
                }
            } catch (NumberFormatException e) {
                try {
                    type = GameType.getGameType(mode);
                } catch (IOException e2) {
                    System.out.println(e2.getMessage() + "\n");
                }
            }
        } while (type == null);

        return GameFactory.getGame(type);
    }

    /**
     * Shows the initial game Splash in the Console
     */
    private void showSplash() {
        String saidaSplash =
        "****************************************\n" +
        "******** Welcome to Flashcards *********\n" +
        "****************************************\n";

        System.out.println(saidaSplash);
    }

    /**
     * Shows the game type choices for the user in the console
     */
    private void showChoices() {
        String saidaMenu =
        "Please choose your game type:\n" +
        "Type the number or the name to choose\n" +
            "\t1: Versus\n" +
                "\t\tPlay against another player locally, the one to hit 10 first wins\n\n" + // TODO: define the number of correct answers to win, 10 was arbitrary
            "\t2: Time Attack\n" +
                "\t\tPlay against time to see how much answers you can get right before the time ends\n\n" +
            "\t3: Sandbox\n" +
                "\t\tJust try to answer the questions on each card as long as you'd like\n\n";
        
        System.out.print(saidaMenu);
    }

    @Deprecated
    public void Quit() { // Define what exactly means to quit menu.

    }
}
