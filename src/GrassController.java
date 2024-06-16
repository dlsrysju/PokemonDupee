import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Attributes of the WaterController class:
 * - {@code menuGUI} - GUI component for the game menu.
 * - {@code starterCreature} - The Creatures instance representing the player's starter creature.
 * - {@code inventory} - The Inventory instance managing player items.
 * - {@code changeActiveGUI} - GUI component for changing the active item in the inventory.
 * - {@code inventoryGUI} - GUI component for displaying and interacting with the inventory.
 * - {@code errorGUI} - GUI component for displaying errors related to the inventory.
 *
 * Author: De los Reyes, Carl Justin B.
 */
public class GrassController {
    private MenuGUI menuGUI;
    private Creatures starterCreature;
    private Inventory inventory;
    private InventoryGUI inventoryGUI;
    private ErrorInventoryGUI errorGUI;
    /**
     * Constructor for the GrassController class. Initializes the GrassController with the required GUI components
     * and game elements.
     *
     * @param start The Start instance representing the starting point of the game.
     * @param gameView The GameGUI instance representing the main graphical interface of the game.
     * @param grassGUI The grassGUI instance representing the graphical interface for the Grass phase.
     */
    public GrassController(Start start, GameGUI gameView, GrassGUI grassGUI) {
    this.menuGUI = new MenuGUI();
    this.inventory = new Inventory();
    this.starterCreature = new Creatures();
    this.inventoryGUI =  new InventoryGUI();
        this.errorGUI = new ErrorInventoryGUI();
        /**
         * Listener for chosing brownisaur as starter creature
         */
      grassGUI.brownisaurActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                String name = "Brownisaur";
                String type = "Grass";
                String family = "Family D";
                int level = 1;
                String filename = "/images/bulbasaur.png";

                Creatures newCreature = new Creatures(name, type, family, level, filename);
                inventory.addCreature(newCreature);
                inventory.setActiveCreature(newCreature);
                inventoryGUI.setCreaturename(name);
                inventoryGUI.setCreatureFamily(family);
                inventoryGUI.setCreatureType(type);
                inventoryGUI.setCreatureLevel(Integer.toString(level));
                inventoryGUI.setCreatureIcon(filename);

                inventoryGUI.setNames3creature(name);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setActiveIcon(filename);

                grassGUI.dispose();
                menuGUI.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });
        /**
         * Listener for choosing Frubat as starter creature
         */
                grassGUI.frubatActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                String name = "Frubat";
                String type = "Grass";
                String family = "Family E";
                int level = 1;
                String filename = "/images/frubat.png";

                Creatures newCreature = new Creatures(name, type, family, level, filename);
                inventory.addCreature(newCreature);
                inventory.setActiveCreature(newCreature);

                inventoryGUI.setCreaturename(name);
                inventoryGUI.setCreatureFamily(family);
                inventoryGUI.setCreatureType(type);
                inventoryGUI.setCreatureLevel(Integer.toString(level));
                inventoryGUI.setCreatureIcon(filename);

                inventoryGUI.setNames3creature(name);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setActiveIcon(filename);

                grassGUI.dispose();
                menuGUI.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });
        /**
         * Listener for choosing Malts as starter creature
         */
        grassGUI.maltsActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                String name = "Malts";
                String type = "Grass";
                String family = "Family F";
                int level = 1;
                String filename = "/images/malts.png";

                Creatures newCreature = new Creatures(name, type, family, level, filename);
                inventory.addCreature(newCreature);

                inventory.setActiveCreature(newCreature);
                inventoryGUI.setCreaturename(name);
                inventoryGUI.setCreatureFamily(family);
                inventoryGUI.setCreatureType(type);
                inventoryGUI.setCreatureLevel(Integer.toString(level));
                inventoryGUI.setCreatureIcon(filename);

                inventoryGUI.setNames3creature(name);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setActiveIcon(filename);

                grassGUI.dispose();
                menuGUI.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });
        /**
         * Listener for choosing back option
         */
        grassGUI.backgrassActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grassGUI.dispose();
                gameView.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });

    }

}
