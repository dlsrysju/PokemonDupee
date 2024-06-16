import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 * Attributes of the FireController class:
 * - {@code menuGUI} - GUI component for the game menu.
 * - {@code starterCreature} - The Creatures instance representing the player's starter creature.
 * - {@code inventory} - The Inventory instance managing player items.
 * - {@code changeActiveGUI} - GUI component for changing the active item in the inventory.
 * - {@code inventoryGUI} - GUI component for displaying and interacting with the inventory.
 * - {@code errorGUI} - GUI component for displaying errors related to the inventory.
 *
 * Author: De los Reyes, Carl Justin B.
 */
public class FireController {
    private MenuGUI menuGUI;

    private Creatures starterCreature;

    private Inventory inventory;
    ChangeActiveGUI changeActiveGUI;
    private InventoryGUI inventoryGUI;
    private ErrorInventoryGUI errorGUI;

    /**
     * Constructor for the FireController class. Initializes the FireController with the required GUI components
     * and game elements.
     *
     * @param start The Start instance representing the starting point of the game.
     * @param gameView The GameGUI instance representing the main graphical interface of the game.
     * @param fireGUI The FireGUI instance representing the graphical interface for the Fire phase.
     */
        public FireController(Start start, GameGUI gameView, FireGUI fireGUI) {
        this.menuGUI = new MenuGUI();
        this.inventory = new Inventory();
        this.starterCreature = new Creatures();
        this.inventoryGUI = new InventoryGUI();
        this.errorGUI = new ErrorInventoryGUI();

            /**
             * Listener for chosing Strawmander as starter creature
             */
            fireGUI.StrawanderActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                    String name = "Strawmander";
                    String type = "Fire";
                    String family = "Family A";
                    int level = 1;
                    String filename = "/images/charmander(updated) (3).png";

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

                    fireGUI.dispose();
                    menuGUI.setVisible(true);
                    inventoryGUI.setVisible(false);
                    errorGUI.setVisible(false);
                        }
                    });
            /**
             * Listener for chosing Chocowool as starter creature
             */
            fireGUI.ChocowoolActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                    String name = "Chocowool";
                    String type = "Fire";
                    String family = "Family B";
                    int level = 1;
                    String filename = "/images/mareep (1).png";

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

                    fireGUI.dispose();
                    menuGUI.setVisible(true);
                    inventoryGUI.setVisible(false);
                    errorGUI.setVisible(false);
                }
            });
            /**
             * Listener for chosing Parfwit as starter creature
             */
            fireGUI.ParfwitActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                    String name = "Parfwit";
                    String type = "Fire";
                    String family = "Family C";
                    int level = 1;
                    String filename = "/images/parfwit.png";

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

                    fireGUI.dispose();
                    menuGUI.setVisible(true);
                    inventoryGUI.setVisible(false);
                    errorGUI.setVisible(false);
                }
            });
            /**
             * Listener for back option
             */
            fireGUI.FireTypeActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireGUI.dispose();
                    gameView.setVisible(true);
                    inventoryGUI.setVisible(false);
                    errorGUI.setVisible(false);
                }
            });

        }

    }


