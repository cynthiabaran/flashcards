package classes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import com.sun.java.util.jar.pack.Package.File;

/** Class classes.Game
 *
 * rules the game, superclass to all
 * game types classes.
 *
 */

public class Game {

    private Player p1;
    private ArrayList<Card> deck;

    public boolean gameOver() {
        return false;
    }

    public void nextTurn() {

    }

    public void populateDeck(String cardType) {
        String folderPath = "./data/"+getCardType();
        java.io.File folder = new File(folder);
        for (File fileEntry : folder.listFiles()) {
            FileInputStream fileIn = new FileInputStream(fileEntry);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Card c = (Card) in.readObject();
            deck.add(c);
            in.close();
            fileIn.close();
        }
    }
}