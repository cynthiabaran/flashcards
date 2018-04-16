public class GameHandler {
    public static void main(String [] args) {
        Card test = new Card("conteúdo", "Qual a diferença entre uma classe e objeto em Java?", "Uma classe é uma coleção de definições de atributos e métodos que todos os objetos instanciados daquela classe possuem.");
        test.saveCardToFile();
        test.printCard();
    }
}
