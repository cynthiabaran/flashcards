package flashcards;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

/** Class TimeAttack
 *
 * Time attack game type,
 * the player has a maximum time to crack
 * all the cards (usually Q&A);
 * 
 */

public class TimeAttack extends Game { // TimeAttack is a specific Game type
    // parameters
    private final float MAX_TIME;
    private float timeElapsed;

    // constructors
    TimeAttack() { // default constructor
    }
    // TODO: define constructor(s) for this class

    // methods
    public float showPoints(float points) {

    }

    public static float earnPoints(Player p, Flashcard cards) {

    }

    public static float losePoints(Player p) {

    }
}