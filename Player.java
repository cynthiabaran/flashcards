package flashcards;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

/** Class Player
 * 
 * Player description class
 * 
 */

public class Player {
	// parameters
    private String name;
    private int healthPoints;
    private static final int MAX_HEALTH = 100; // TODO: choose MAX_HEALTH value
    private float playerPoints;
    //private Flashcards hand; // TODO: player's card hand (valid?)

    // constructors
    Player () { // default constructor
        // TODO: discuss which could be valid constructor for this class
    }

    Player (String name) { // parameters constructor
        this.name = name;
        this.healthPoints = MAX_HEALTH; 
        this.playerPoints = 0;
    }

    public void playCard() {
        // TODO: implement the playCard method
    }

    public void gainLife (int hp) {
        healthPoints += hp
    }

    public boolean loseLife (int hp) { // returns if the player loses or not
        healthPoints -= hp;
        if (healthPoints <= 0)
            return true;
        else
            return false;
    }
}
