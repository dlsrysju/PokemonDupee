import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The GameController class manages the overall flow and interactions in the game.
 * It controls the transitions between different game phases such as Start, Fire, Water, and Grass.
 */
public class GameController {

    // Game components
    private Start start;
    private GameGUI gameView;
    private FireGUI fireGUI;
    private WaterGUI waterGUI;
    private GrassGUI grassGUI;
    private Inventory inventory;

    /**
     * Constructor for the GameController class. Initializes the GameController with the required game components.
     */
    public GameController() {
        // Initialize game components
        this.start = new Start();
        this.gameView = new GameGUI();
        this.fireGUI = new FireGUI();
        this.waterGUI = new WaterGUI();
        this.grassGUI = new GrassGUI();
        this.inventory = new Inventory();
        inventory.getUserCreatures().clear(); // Clear user creatures at the start

        // Show the Start GUI
        start.setVisible(true);

        // Start button ActionListener
        this.start.playActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start.dispose();
                gameView.setVisible(true);
                fireGUI.setVisible(false);
                grassGUI.setVisible(false);
            }
        });

        // Fire Type button ActionListener
        this.gameView.FireTypeActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FireController fireController = new FireController(start, gameView, fireGUI);
                gameView.dispose();
                fireGUI.setVisible(true);
                gameView.setVisible(false);
                grassGUI.setVisible(false);
                waterGUI.setVisible(false);
            }
        });

        // Grass Type button ActionListener
        this.gameView.GrassTypeActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GrassController grassController = new GrassController(start, gameView, grassGUI);
                gameView.dispose();
                grassGUI.setVisible(true);
                gameView.setVisible(false);
                fireGUI.setVisible(false);
            }
        });

        // Water Type button ActionListener
        this.gameView.WaterTypeActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WaterController waterController = new WaterController(start, gameView, waterGUI);
                gameView.dispose();
                waterGUI.setVisible(true);
                gameView.setVisible(false);
                fireGUI.setVisible(false);
            }
        });
    }
}
