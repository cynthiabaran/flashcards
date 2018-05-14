package classes;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

public class Player {
    // parameters
    private String name;
    private int healthPoints;
    private static final int MAX_HEALTH = 100; // TODO: choose MAX_HEALTH value
    private float playerPoints;
    //private Flashcards hand; // TODO: player's card hand (valid?)

    // constructors
    public Player () { // default constructor	
        // TODO: discuss which could be valid constructor for this class
    }
    Player (String name) { // parameters constructor
        this.name = name;
        this.healthPoints = MAX_HEALTH;
        this.playerPoints = 0;
    }

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public static int getMaxHealth() {
        return MAX_HEALTH;
    }

    public float getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(float playerPoints) {
        this.playerPoints = playerPoints;
    }

    public void playCard() {
        // TODO: implement the playCard method
    }

    public void gainLife (int hp) {
        healthPoints += hp;
    }

    public boolean loseLife (int hp) { // returns if the player loses or not
        healthPoints -= hp;
        if (healthPoints <= 0)
            return true;
        else
            return false;
    }
}
