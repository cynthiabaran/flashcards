package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */
import java.util.Random;
import java.io.File;

/** Class classes.Game
 *
 * rules the game, superclass to all
 * game types classes.
 *
 */

public class Game {

    private Player p1;
    private ArrayList<Card> deck;

    public Game() {
		this.p1 = new Player();
		this.deck = new ArrayList<Card>();
	}
    
    public Game(Player p1) {
		this.p1 = p1;
		this.deck = new ArrayList<Card>();
	}
    
	public boolean gameOver() {
        return false;
    }

    public void nextTurn() {

    }

    public void populateDeck(String cardType){
        String folderPath = "./data/"+ cardType;
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
    
//    Print entire deck
    public void showDeck(){
    	System.out.println("Deck: ");
    	for(Card card : deck){
    		card.printCard();
    	}
    }
//    Return random card from deck
    public Card getRandomCard(){
    	Random randomGenerator = new Random();
    	int index = randomGenerator.nextInt(deck.size());
        Card card = deck.get(index);
        return card;
    }
}