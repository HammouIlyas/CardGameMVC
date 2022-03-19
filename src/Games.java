import Controller.GameController;
import Modele.Deck;
import View.View;

public class Games {
    public static void main(String[] args) {
        GameController gc = new GameController(new Deck(), new View());
        gc.run();
    }
}
