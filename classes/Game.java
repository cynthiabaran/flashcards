package classes;

import java.util.ArrayList;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

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

    }
}