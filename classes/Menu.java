package classes; 
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

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

    public Game makeMenu() {
        showSplash();

        Game type = null;

        do {
            showChoices();
            String mode = scanf.next();
            type = chooseGameType(mode);
        } while (type == null);

        return type;
    }

    public void showSplash() {
        String saidaSplash =
        "****************************************\n" +
        "******** Welcome to Flashcards *********\n" +
        "****************************************\n";

        System.out.println(saidaSplash);
    }

    public void showChoices() {
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

    public void Quit() { //TODO: Define what exactly means to quit menu.

    }

    public Game chooseGameType(String mode) {
        Game gameType = new Game();
        boolean validType = false;
        if (mode == "1" || mode.toUpperCase().equals("VERSUS")) {
            gameType = new Versus();
            validType = true;
        }
        if (mode == "2" || mode.toUpperCase().equals("TIMEATTACK") || mode.toUpperCase().equals("TIME ATTACK")) {
            gameType = new TimeAttack(180); // example of max time
            validType = true;
        }
        if (mode == "3" || mode.toUpperCase().equals("SANDBOX")) {
            gameType = new Sandbox(new Player());
            validType = true;
        }
        if (validType) {
            return gameType;
        } else {
            return null;
        }
    }
}
