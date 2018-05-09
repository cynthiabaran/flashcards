package classes; 
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

public class Menu {

    Scanner

    Menu(){ // TODO: define constructor(s) for this class
        showSplash();
        showMenu();
    }

    public void showSplash() {
        String saidaSplash =
        "****************************************\n" +
        "******** Welcome to Flashcards *********\n" +
        "****************************************\n";

        System.out.println(saidaSplash);
    }

    public void showMenu() {
        String saidaMenu =
        "Please choose your game type:\n" +
        "Type the number or the game type name to choose\n" +
            "\t1: Versus\n" +
                "\t\tPlay against another player locally, the one to hit 10 first wins\n\n" +
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
        if (mode == "1" || mode.toUpperCase().equals("VERSUS")) {
            gameType = new Versus();
        }
        if (mode == "2" || mode.toUpperCase().equals("TIMEATTACK") || mode.toUpperCase().equals("TIME ATTACK")) {
            gameType = new TimeAttack(180); // example of max time
        }
        if (mode == "3" || mode.toUpperCase().equals("SANDBOX")) {
            gameType = new Sandbox();
        }
        return gameType;
    }
}
