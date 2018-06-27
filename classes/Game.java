package classes;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import java.io.FileInputStream;
import java.lang.Exception;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;

/** Class classes.Game
 *
 * rules the game, superclass to all
 * game types classes.
 *
 */

public abstract class Game {

    protected Player p1;
    protected ArrayList<Card> deck;

    protected Game() {
		this.p1 = new Player();
		this.deck = new ArrayList<Card>();
	}
    
    protected Game(Player p1) {
		this.p1 = p1;
		this.deck = new ArrayList<Card>();
	}
    
    public abstract void start() throws InterruptedException;
    
	public boolean gameOver() {
        return false;
    }

    public void nextTurn() {

	}

	/**
	 * Populates the deck with a card type
	 */
    protected void populateDeck(CardType cardType){
        String folderPath = "./data/"+ cardType.toString();
        File folder = new File(folderPath);
        for (File fileEntry : folder.listFiles()) {
			try {
				FileInputStream fileIn;
				fileIn = new FileInputStream(fileEntry);
				ObjectInputStream in = new ObjectInputStream(fileIn);
	            Card c = (Card) in.readObject();
//	            System.out.println("Title " + c.getTitle());
	            deck.add(c);
	            in.close();
	            fileIn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
	}
	
	/**
	 * Should be implemented to each game type, to know which card to populate the deck with
	 * Implement by calling super.populateDeck(cardType) with the cardtype you want for that game.
	 */
	public abstract void populateDeck();
    
//    Print entire deck
    public void showDeck(){
    	System.out.println("Deck: ");
    	for(Card card : deck){
    		card.printCard();
    	}
    }
//    Return random card from specified type
// For each game type functions with different card types
    public Card getRandomCard(CardType type){
    	Card card;
    	Random randomGenerator = new Random();
    	do{
	    	int index = randomGenerator.nextInt(deck.size());
	        card = deck.get(index);
    	}while(!card.getCardType().equals(type));
        return card;
    }
//  Return random card from deck
    public Card getRandomCard(){
    	Random randomGenerator = new Random();
    	int index = randomGenerator.nextInt(deck.size());
        Card card = deck.get(index);
        return card;
    }
}