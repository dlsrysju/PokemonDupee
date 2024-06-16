import java.awt.*;
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
public class WaterController {
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
     * @param waterGUI The waterGUI instance representing the graphical interface for the Water phase.
     */
    public WaterController(Start start, GameGUI gameView, WaterGUI waterGUI) {
        this.menuGUI = new MenuGUI();
        this.inventory= new Inventory();
        this.starterCreature = new Creatures();
        this.inventoryGUI = new InventoryGUI();
        this.errorGUI = new ErrorInventoryGUI();
        /**
         * Listener for choosing squirpie as starter creature
         */
        waterGUI.squirpieActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                String name = "Squirpie";
                String type = "Water";
                String family = "Family G";
                int level = 1;
                String filename = "/images/squirpie.png";

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

                waterGUI.dispose();
                menuGUI.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });
        /**
         * Listener for choosing Chocolite as starter creature
         */
        waterGUI.chocoliteActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                String name = "Chocolite";
                String type = "Water";
                String family = "Family H";
                int level = 1;
                String filename = "/images/chocolite.png";

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

                waterGUI.dispose();
                menuGUI.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });
        /**
         * Listener for choosing Oshacone as starter creature
         */
        waterGUI.oshaconeActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                MenuController menuController = new MenuController(start, gameView, menuGUI, inventoryGUI, inventory);
                String name = "Oshacone";
                String type = "Water";
                String family = "Family I";
                int level = 1;
                String filename = "/images/water (2).png";

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

                waterGUI.dispose();
                menuGUI.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });
        /**
         * Listener for choosing back option on water GUI
         */
        waterGUI.backActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                waterGUI.dispose();
                gameView.setVisible(true);
                inventoryGUI.setVisible(false);
                errorGUI.setVisible(false);
            }
        });

    }

}
