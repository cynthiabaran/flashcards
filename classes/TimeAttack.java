package classes; /**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import classes.Card;
import classes.Game;
import classes.Player;

/** Class classes.TimeAttack
 *
 * Time attack game type,
 * the player has a maximum time to crack
 * all the cards (usually Q&A);
 *
 */

public class TimeAttack extends Game { // classes.TimeAttack is a specific classes.Game type
    // parameters
    private final float MAX_TIME;
    private float timeElapsed;

    // constructors
    TimeAttack(float time) { // default constructor
        MAX_TIME = time;
        timeElapsed = 0;
    }
    // TODO: define constructor(s) for this class

    // methods
    public void showPoints(Player p, float points) {
        System.out.println("Points: " + p.getPlayerPoints());
    }

    public static void earnPoints(Player p, Card cards) {
        p.setPlayerPoints(p.getPlayerPoints() + 1);
    }

    public static void losePoints(Player p) {
        p.setPlayerPoints(p.getPlayerPoints() - 1);
    }
}