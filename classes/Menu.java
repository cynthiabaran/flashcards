package classes; /**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

public class Menu {

    Menu(){ // TODO: define constructor(s) for this class
    }

    public void Quit() { //TODO: Define what exactly means to quit menu.

    }

    public Game chooseGameType(String mode) {
        Game gameType = new Game();
        if (mode == "1" || mode.toUpperCase().equals("VERSUS")) {
            gameType = new Versus();
        }
        if (mode == "2" || mode.toUpperCase().equals("TIMEATTACK")) {
            gameType = new TimeAttack(180); // example of max time
        }
        if (mode == "3" || mode.toUpperCase().equals("SANDBOX")) {
            gameType = new Sandbox();
        }
        return gameType;
    }
}
