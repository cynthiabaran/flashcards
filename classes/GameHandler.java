package classes;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import classes.Card;

public class GameHandler {
    public static void main(String [] args) {
    	
    	
        Card card1 = new Card("content", "Qual a diferen�a entre uma classe e objeto em Java?", "Uma classe � uma cole��o de defini��es de atributos e m�todos que todos os objetos instanciados daquela classe possuem.");
        card1.saveCardToFile();
        card1 = Card.loadCardFromFile("./data/content/card_1.ser");
//        card1.printCard();
        Card card2 = new Card("content", "Como o avi�o avoa se ele n�o bate as asa?", "Vroom");
        card2.saveCardToFile();
        card2 = Card.loadCardFromFile("./data/content/card_2.ser");
//        card2.printCard();
        Card question1 = new Question("2+2?", "Math", "4");
        question1.saveCardToFile();
        question1 = Card.loadCardFromFile("./data/question/card_3.ser");
        Card question2 = new Question("Qual o melhor sabor de Corote?", "Misc", "P�ssego");
        question2.saveCardToFile();
        question2 = Card.loadCardFromFile("./data/question/card_3.ser");
        
    	
    	// Player player = new Player("Steve");
    	Menu menu = new Menu();
    	Game game = menu.makeMenu();
    	game.populateDeck();
    	game.showDeck();
    	try {
			game.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}



    }
}
