package classes;
/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

import java.text.Collator;

import classes.Card;

/** Class classes.Question
 *
 * Specific Flashcard type
 * Questions and answers flashcards
 *
 */

public class Question extends Card { // classes.Question is a specific card type
    // parameters
    private String answer;

    //contructors

    Question(String cardType, String title, String content, String answer) {
        super(cardType, title, content);
        this.answer = answer;
    }

    // methods
    public boolean tryAnswer(String _try) {
        // the strings should be compared in all lower (or all upper) case
    	final Collator instance = Collator.getInstance();

        // This strategy mean it'll ignore the accents
        instance.setStrength(Collator.NO_DECOMPOSITION);
        String lowAnswer = new String(answer);
        String lowTry = new String(_try);

        lowAnswer.toLowerCase();
        lowTry.toLowerCase();

        if(instance.compare(lowAnswer, lowTry) == 0){
            return true;
        }
        return false;
    }
}