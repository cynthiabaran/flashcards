package classes;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */


/** Class classes.GameFactory
 *
 * instantiate Game objects through Factory pattern
 *
 */

public class GameFactory {
    public static Game getGame(GameType type) {
        switch(type) {
            case VERSUS:
                return new Versus();
            case TIMEATTACK:
                return new TimeAttack();
            case SANDBOX:
                return new Sandbox();
            default:
                return null;
        }
    }

    public static Game getGame(int ind) {
        switch(ind) {
            case 1:
                return new Versus();
            case 2:
                return new TimeAttack();
            case 3:
                return new Sandbox();
            default:
                return null;
        }
    }
}