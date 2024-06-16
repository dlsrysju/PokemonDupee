import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Attributes of the MenuController class:
 * - {@code inventoryGUI} - GUI for managing the player's inventory.
 * - {@code errorGUI} - GUI component for displaying errors related to menu actions.
 * - {@code exploreGUI} - GUI for exploring different areas in the game.
 * - {@code evolveGUI} - GUI for evolving creatures in the inventory.
 * - {@code changeActiveGUI} - GUI for changing the active item in the inventory.
 */
public class MenuController {
    private InventoryGUI inventoryGUI;
    private ErrorInventoryGUI errorGUI;
    private ExploreAreaGUI exploreGUI;
    private  EvolveGUI evolveGUI;
    private ChangeActiveGUI changeActiveGUI;
    /**
     * Constructor for the MenuController class.
     *
     * @param start           The Start instance for managing the game's starting screen.
     * @param gameView        The GameGUI instance representing the main game view.
     * @param menuGUI         The MenuGUI instance for managing the game menu.
     * @param inventoryGUI    The InventoryGUI instance for managing the player's inventory.
     * @param inventory       The Inventory instance containing player items.
     */
    public MenuController(Start start, GameGUI gameView, MenuGUI menuGUI,InventoryGUI inventoryGUI, Inventory inventory) {
        this.inventoryGUI = new InventoryGUI();
        this.errorGUI = new ErrorInventoryGUI();
        this.exploreGUI = new ExploreAreaGUI();
        this.evolveGUI = new EvolveGUI();
        this.changeActiveGUI = new ChangeActiveGUI();

        // Explore Action Listener
        menuGUI.exploreActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create ExploreController to handle exploration actions
                ExploreController exploreController = new ExploreController(menuGUI, inventory, inventoryGUI, exploreGUI, changeActiveGUI);
                exploreGUI.setVisible(true);
                menuGUI.dispose();
                errorGUI.setVisible(false);
            }
        });

        // View Inventory Action Listener
        menuGUI.viewinventoryActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create InventoryController to manage inventory-related actions
                InventoryController inventoryController = new InventoryController(menuGUI, inventoryGUI, inventory, changeActiveGUI);
                menuGUI.dispose();
                inventoryGUI.setVisible(true);
                errorGUI.setVisible(false);
            }
        });

        // Evolve Action Listener
        menuGUI.evolveActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create EvolveController to handle creature evolution actions
                EvolveController evolveController = new EvolveController(inventory, inventoryGUI, menuGUI, evolveGUI, changeActiveGUI);
                menuGUI.dispose();
                evolveGUI.setVisible(true);
                errorGUI.setVisible(false);
            }
        });

        // Exit Action Listener
        menuGUI.exitActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the game and return to the starting screen
                menuGUI.dispose();
                start.setVisible(true);
                errorGUI.setVisible(false);
            }
        });
    }
}