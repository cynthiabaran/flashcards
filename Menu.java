package flashcards;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

/** Class Menu
 *
 * Menu area for before and after game.
 * Menu features.
 * 
 */

public class Menu {

	Menu(){ // TODO: define constructor(s) for this class
  }
  
	public void Quit() { //TODO: Define what exactly means to quit menu.
		
	}
	
	public Game chooseGameType(String mode) {
		if (mode == "1" || mode.toUpperCase() == "VERSUS") {
			return new Versus();
		}
		if (mode == "2" || mode.toUpperCase() == "TIMEATTACK") {
			return new TimeAttack();
		}
		if (mode == "3" || mode.toUpperCase() == "SANDBOX") {
			return new Sandbox();
		}
	}
}
