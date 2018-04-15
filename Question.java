package flashcards;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

/** Class Question
 * 
 * Specific Flashcard type
 * Questions and answers flashcards
 * 
 */

public class Question extends Flashcard{ // Question is a specific card type
    // parameters
    private String question;
    private String answer;

    //contructors
    Question() { // default constructor
        // TODO: discuss valid contructors for this class
    }

    Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    // methods
    public boolean tryAnswer(String _try) {
        // the strings should be compared in all lower (or all upper) case
        String lowAnswer = new String(answer);
        String lowTry = new String(_try);

        lowAnswer.toLowerCase();
        lowTry.toLowerCase();

        for (int i = 0; i < lowAnswer.length(); i++) {

        }
    }
}