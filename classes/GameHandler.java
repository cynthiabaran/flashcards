package classes;

import classes.Card;

public class GameHandler {
    public static void main(String [] args) {
    	
    	
        Card card1 = new Card("content", "Qual a diferença entre uma classe e objeto em Java?", "Uma classe é uma coleção de definições de atributos e métodos que todos os objetos instanciados daquela classe possuem.");
        card1.saveCardToFile();
        card1 = Card.loadCardFromFile("./data/content/card_1.ser");
//        card1.printCard();
        Card card2 = new Card("content", "Como o avião avoa se ele não bate as asa?", "Vroom");
        card2.saveCardToFile();
        card2 = Card.loadCardFromFile("./data/content/card_2.ser");
//        card2.printCard();
        Card question1 = new Question("question", "2+2?", "Math", "4");
        question1.saveCardToFile();
        question1 = Card.loadCardFromFile("./data/question/card_3.ser");
        Card question2 = new Question("question", "Qual o melhor sabor de Corote?", "Misc", "Pêssego");
        question2.saveCardToFile();
        question2 = Card.loadCardFromFile("./data/question/card_3.ser");
        
    	
    	Player player = new Player("Steve");
    	Menu menu = new Menu();
    	Game game = menu.makeMenu();
    	game.populateDeck("content");
    	game.populateDeck("question");
    	game.showDeck();
    	try {
			game.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}



    }
}
