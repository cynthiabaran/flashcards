package classes;

import java.io.Serializable;
import java.io.*;

/**
 * @author Grupo das Bananas loucas da aldeia do mato
 */

/** Class Flashcard
 * 
 * Cards class, superclass to all types of flashcards
 * 
 */

public class Card implements Serializable {
    // parameters

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    private int cardNumber;
    private String cardType; // possible change to enum here
    private String content;
    private String title;
    public static int CARD_NUMBER=0;

    public static int generateNewCardNumber() {
        CARD_NUMBER++;
        return CARD_NUMBER;
    }
    public Card(String cardType, String title, String content) {
        this.cardNumber = generateNewCardNumber();
        this.cardType = cardType;
        this.content = content;
        this.title = title;
    }

    public void saveCardToFile() {
        try {
            String filePath = "./data/"+getCardType()+"/card_"+getCardNumber()+".ser";
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in "+filePath+"\n");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static Card loadCardFromFile(String filePath) {
        Card c = null;
        try {
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            c = (Card) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException ce) {
            System.out.println("classes.Card class not found");
            ce.printStackTrace();
        }
        return c;
    }

    public void printCard(){
        System.out.println("Card "+this.getCardNumber()+" is a "+getCardType()+" card.");
        System.out.println("Title: "+this.getTitle());
        System.out.println("Content: "+this.getContent());
    }
}