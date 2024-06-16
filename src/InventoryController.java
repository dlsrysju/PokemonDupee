import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Attributes of the InventoryController class:
 * - {@code inventory} - The Inventory instance managing player items.
 * - {@code errorGUI} - GUI component for displaying errors related to the inventory.
 * - {@code changeActiveInventoryGUI} - GUI component for changing the active item in the inventory.
 * - {@code inventoryConfirmationGUI} - GUI component for confirming inventory-related actions.
 */
public class InventoryController {
    private Inventory inventory;
    private ErrorInventoryGUI errorGUI;
    private ChangeActiveInventoryGUI changeActiveInventoryGUI;
    private InventoryConfirmationGUI inventoryConfirmationGUI;
    /**
     * Constructor for the InventoryController class. Initializes the InventoryController with the required components.
     *
     * @param menuGUI The MenuGUI instance representing the game menu.
     * @param inventoryGUI The InventoryGUI instance representing the graphical interface for the player's inventory.
     * @param inventory The Inventory instance managing player items.
     * @param changeActiveGUI The ChangeActiveGUI instance managing the GUI for changing the active item.
     */
    public InventoryController(MenuGUI menuGUI, InventoryGUI inventoryGUI, Inventory inventory, ChangeActiveGUI changeActiveGUI) {
        this.inventory = new Inventory();
        this.changeActiveInventoryGUI = new ChangeActiveInventoryGUI();
        this.errorGUI = new ErrorInventoryGUI();
        this.inventoryConfirmationGUI = new InventoryConfirmationGUI();
        /**
         * Listener for Changing Active Creature
         */
        inventoryGUI.changeactiveActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (inventory.getUserCreatures().size() == 1) {
                    errorGUI.setVisible(true);
                } else {
                    errorGUI.setVisible(false);
                    System.out.println(inventory.getUserCreatures().size());
                    changeActiveGUI.setVisible(true);
                    inventoryGUI.dispose();
                }
            }
        });
        /**
         * Listener for Choosing Option 1
         * Setting the new active creature on the inventory
         */
        this.changeActiveInventoryGUI.setOption1Inventory(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(0).getcName();
                String family = inventory.getUserCreatures().get(0).getcFamily();
                String type = inventory.getUserCreatures().get(0).getcType();
                int level = inventory.getUserCreatures().get(0).getcLevel();
                String filename = inventory.getUserCreatures().get(0).getImageFileName();

                inventoryConfirmationGUI.setActivefamily(family);
                inventoryConfirmationGUI.setActivename(name);
                inventoryConfirmationGUI.setActivetype(type);
                inventoryConfirmationGUI.setActivelevel(Integer.toString(level));
                inventoryConfirmationGUI.setActivecreatureimg(filename);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                inventoryConfirmationGUI.setVisible(true);

                Creatures newactive = new Creatures(name, family, type, level, filename);
                inventory.setActiveCreature(newactive);
            }
        });
        /**
         * Listener for Choosing Option 2
         * Setting the new active creature on the inventory
         */
        this.changeActiveInventoryGUI.setOption2Inventory(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(1).getcName();
                String family = inventory.getUserCreatures().get(1).getcFamily();
                String type = inventory.getUserCreatures().get(1).getcType();
                int level = inventory.getUserCreatures().get(1).getcLevel();
                String filename = inventory.getUserCreatures().get(1).getImageFileName();

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                inventoryConfirmationGUI.setVisible(true);

                Creatures newactive = new Creatures(name, family, type, level, filename);
                inventory.setActiveCreature(newactive);
            }
        });
        /**
         * Listener for Choosing Option 3
         * Setting the new active creature on the inventory
         */
        this.changeActiveInventoryGUI.setOption3Inventory(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(2).getcName();
                String family = inventory.getUserCreatures().get(0).getcFamily();
                String type = inventory.getUserCreatures().get(2).getcType();
                int level = inventory.getUserCreatures().get(2).getcLevel();
                String filename = inventory.getUserCreatures().get(2).getImageFileName();

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                inventoryConfirmationGUI.setVisible(true);

                Creatures newactive = new Creatures(name, family, type, level, filename);
                inventory.setActiveCreature(newactive);
            }
        });
        /**
         * Listener for Choosing Option 4
         * Setting the new active creature on the inventory
         */
        this.changeActiveInventoryGUI.setOption4Inventory(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(3).getcName();
                String family = inventory.getUserCreatures().get(3).getcFamily();
                String type = inventory.getUserCreatures().get(3).getcType();
                int level = inventory.getUserCreatures().get(3).getcLevel();
                String filename = inventory.getUserCreatures().get(3).getImageFileName();

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                inventoryConfirmationGUI.setVisible(true);

                Creatures newactive = new Creatures(name, family, type, level, filename);
                inventory.setActiveCreature(newactive);
            }
        });
        /**
         * Listener for Choosing Option 5
         * Setting the new active creature on the inventory
         */
        this.changeActiveInventoryGUI.setOption5Inventory(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(4).getcName();
                String family = inventory.getUserCreatures().get(4).getcFamily();
                String type = inventory.getUserCreatures().get(4).getcType();
                int level = inventory.getUserCreatures().get(4).getcLevel();
                String filename = inventory.getUserCreatures().get(4).getImageFileName();

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                inventoryConfirmationGUI.setVisible(true);

                Creatures newactive = new Creatures(name, family, type, level, filename);
                inventory.setActiveCreature(newactive);
            }
        });
        /**
         * Listener for Changing Active Creature under Inventory
         */
        this.changeActiveInventoryGUI.setOption6Inventory(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(5).getcName();
                String family = inventory.getUserCreatures().get(5).getcFamily();
                String type = inventory.getUserCreatures().get(5).getcType();
                int level = inventory.getUserCreatures().get(5).getcLevel();
                String filename = inventory.getUserCreatures().get(5).getImageFileName();

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                inventoryConfirmationGUI.setVisible(true);

                Creatures newactive = new Creatures(name, family, type, level, filename);
                inventory.setActiveCreature(newactive);
            }
        });
        /**
         * Listener for Return to Inventory under ErrorGUI
         */
        errorGUI.returntoinventoryActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
                inventoryGUI.setVisible(true);
                errorGUI.setVisible(false);
                errorGUI.dispose();
                }
                });
        /**
         * Listener for Return to Menu under Error GUI
         */
        errorGUI.setReturntomenuActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuGUI.setVisible(true);
                inventoryGUI.dispose();
                errorGUI.setVisible(false);
                errorGUI.dispose();
            }
        });
        /**
         * Listener for No option on confirmation change of active creature
         */
        this.inventoryConfirmationGUI.noInventoryListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getActiveCreature().getcName();
                String family = inventory.getActiveCreature().getcFamily();
                String type = inventory.getActiveCreature().getcType();
                int level = inventory.getActiveCreature().getcLevel();
                String filename = inventory.getActiveCreature().getImageFileName();

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);
                inventoryGUI.setVisible(true);

            }
        });
        /**
         * Listener for Yes option on inventory Confirmation
         */
        this.inventoryConfirmationGUI.yesInventoryListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventoryGUI.setVisible(true);
                changeActiveGUI.dispose();
                inventoryConfirmationGUI.dispose();
            }
        });
        /**
         * Listener for changing active creature under Inventory
         */
        this.changeActiveInventoryGUI.setBackinvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventoryGUI.setVisible(true);
                changeActiveGUI.dispose();
            }
        });
        /**
         * Listener for back button under inventory
         */
        inventoryGUI.setBackinventoryActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI.setVisible(true);
                inventoryGUI.dispose();
                errorGUI.setVisible(false);
            }
        });

    }
}
