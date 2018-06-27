package classes;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

/**
 * Content
 */
public class Content extends Card {

    Content(String title, String content) {
        super(title, content);
        cardType = CardType.CONTENT;
    }
    
}