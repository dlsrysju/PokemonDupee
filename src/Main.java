import javax.swing.*;

/**
 * Main Driver of the Program
 */
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                Creatures creatures = new Creatures();
                GameController gameController = new GameController();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
