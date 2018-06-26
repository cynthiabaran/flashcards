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