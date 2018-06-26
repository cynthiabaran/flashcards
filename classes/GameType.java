package classes;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import java.io.IOException;

/** Class classes.GameType
 *
 * Enum to choose game types in the factory pattern
 *
 */

public enum GameType {
    VERSUS, TIMEATTACK, SANDBOX;

    @Override
    public String toString() {
        switch(this) {
            case VERSUS:
                return "Versus";
            case TIMEATTACK:
                return "Time Attack";
            case SANDBOX:
                return "Sandbox";
            default:
                return "Inválido";
        }
    }

    public static GameType gatGameType(int x) throws IOException {
        switch (x) {
            case 1:
                return VERSUS;
            case 2:
                return TIMEATTACK;
            case 3:
                return SANDBOX;
            default:
                throw new IOException("Invalid game type! Please type 1, 2 or 3 only.");
        }
    }

    public static GameType getGameType(String type) throws IOException {
        if (type.compareToIgnoreCase("versus") == 0) {
            return VERSUS;
        } else if (type.compareToIgnoreCase("time attack") == 0 || type.compareToIgnoreCase("timeattack") == 0) {
            return TIMEATTACK;
        } else if (type.compareToIgnoreCase("sandbox") == 0) {
            return SANDBOX;
        } else {
            throw new IOException("Invalid game type!");
        }
    }
}