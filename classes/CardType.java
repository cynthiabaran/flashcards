package classes;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

/** Class classes.Question
 *
 * Enumeration for Flahscard types
 *
 */

public enum CardType {
    QUESTION, CONTENT;

    public String toString() {
        switch (this) {
            case QUESTION:
                return "question";
            case CONTENT:
                return "content";
            default:
                return "invalid";
        }
    }

    public static CardType parseCardType(String type) {
        if (type.compareToIgnoreCase("question") == 0) {
            return QUESTION;
        } else if (type.compareToIgnoreCase("content") == 0) {
            return CONTENT;
        } else {
            return null;
        }
    }
}