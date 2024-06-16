/**
 * The BattlePhaseController class manages the behavior of the BattlePhase graphical user interface.
 *
 * It includes the following attributes:
 * - {@code enemyHealth} - stores the current health of the opponent in the battle
 * - {@code actionCount} - tracks the remaining actions available to the player
 * - {@code enemyCaught} - a boolean flag indicating whether the opponent has been successfully captured
 * - {@code inventoryGUI} - handles the graphical representation and user interactions with the inventory
 * - {@code errorInventoryGUI} - provides a graphical interface for displaying inventory-related errors
 * - {@code changeActiveGUI} - manages the GUI for changing the active item in the inventory
 * - {@code changeConfirmationGUI} - offers a graphical confirmation interface for item changes
 * - {@code enemyDiedGUI} - GUI for notifying the player when the opponent has been defeated
 * - {@code inventory} - an instance of the Inventory class containing player items
 * - {@code exploreAreaGUI} - GUI for exploring different areas in the game
 * - {@code battlePhaseGUI} - the main graphical interface for the Battle Phase
 * - {@code area1GUI} - GUI for Area 1 in the game
 * - {@code area2GUI} - GUI for Area 2 in the game
 * - {@code area3GUI} - GUI for Area 3 in the game
 * - {@code enemyCaughtGUI} - GUI for notifying the player when an opponent is caught
 * - {@code consumedAttacksGUI} - GUI for displaying consumed attacks during the battle
 * - {@code menuGUI} - GUI for the game menu
 * - {@code errorSwapGUI} - GUI for displaying errors related to creature swapping
 *
 * Author: De los Reyes, Carl Justin B.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class BattlePhaseController {
    private int enemyHealth;
    private int actionCount = 3;
    private boolean enemyCaught = false; // Flag to track if the enemy is caught
    private InventoryGUI inventoryGUI;
    private ErrorInventoryGUI errorInventoryGUI;
    private ChangeActiveGUI changeActiveGUI;
    private ChangeConfirmationGUI changeConfirmationGUI;
    private EnemyDiedGUI enemyDiedGUI;
    private Inventory inventory;
    private ExploreAreaGUI exploreAreaGUI;
    private BattlePhaseGUI battlePhaseGUI;
    private Area1GUI area1GUI;
    private Area2GUI area2GUI;
    private Area3GUI area3GUI;
    private EnemyCaughtGUI enemyCaughtGUI;
    private ConsumedAttacksGUI consumedAttacksGUI;
    private MenuGUI menuGUI;
    private ErrorSwapGUI errorSwapGUI;

    /**
     * Constructor for BattlePhaseController.
     *
     * @param menuGUI              Menu GUI instance
     * @param inventory            Inventory instance
     * @param inventoryGUI         Inventory GUI instance
     * @param exploreAreaGUI       Explore Area GUI instance
     * @param battlePhaseGUI       Battle Phase GUI instance
     * @param area1GUI             Area 1 GUI instance
     * @param enemyCaughtGUI       Enemy Caught GUI instance
     * @param area3GUI             Area 3 GUI instance
     * @param area2GUI             Area 2 GUI instance
     * @param consumedAttacksGUI   Consumed Attacks GUI instance
     * @param changeActiveGUI      Change Active GUI instance
     */
    public BattlePhaseController(MenuGUI menuGUI, Inventory inventory, InventoryGUI inventoryGUI, ExploreAreaGUI exploreAreaGUI,
                                 BattlePhaseGUI battlePhaseGUI, Area1GUI area1GUI, EnemyCaughtGUI enemyCaughtGUI, Area3GUI area3GUI,
                                 Area2GUI area2GUI, ConsumedAttacksGUI consumedAttacksGUI, ChangeActiveGUI changeActiveGUI) {

        this.inventoryGUI = inventoryGUI; // Assign the provided inventoryGUI to the class variable
        this.enemyHealth = 50;
        this.errorInventoryGUI = new ErrorInventoryGUI();
        this.changeActiveGUI = changeActiveGUI;
        this.changeConfirmationGUI = new ChangeConfirmationGUI();
        this.consumedAttacksGUI =consumedAttacksGUI;
        this.inventory = inventory;
        this.exploreAreaGUI = exploreAreaGUI;
        this.battlePhaseGUI = battlePhaseGUI;
        this.area2GUI = area2GUI;
        this.area3GUI = area3GUI;
        this.area1GUI = area1GUI;
        this.enemyCaughtGUI = enemyCaughtGUI;
        this.menuGUI = menuGUI;
        this.errorSwapGUI = new ErrorSwapGUI();
        this.enemyDiedGUI = new EnemyDiedGUI();
        registerListeners();
    }

    /**
     * This register listeners executes contains and handles all the action listeners for battlephase GUI
     */
    public void registerListeners() {
        /**
         * Listener for Run
         */
        battlePhaseGUI.runActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (exploreAreaGUI.getArea() == "area1") {
                    area1GUI.setVisible(true);
                    resetBattle();
                    battlePhaseGUI.dispose();
                } else if (exploreAreaGUI.getArea() == "area2") {
                    area2GUI.setVisible(true);
                    resetBattle();
                    battlePhaseGUI.dispose();
                } else {
                    area3GUI.setVisible(true);
                    resetBattle();
                    battlePhaseGUI.dispose();
                }
            }
        });
        /**
         * Listener for Attack
         */
        battlePhaseGUI.attackActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullhealth = "/images/heart.png";
                String healthreduced = "/images/healtreduced (1).png";
                String healthloss = "/images/losshealth.png";

                if (actionCount > 0) {
                    consumedAttacksGUI.setVisible(false);
                    int damage = calculateAttackDamage(inventoryGUI.getActiveLevel(), enemyCaughtGUI.getEnemyType());

                    enemyHealth -= damage;

                    actionCount--;
                    System.out.print("atack" + actionCount);

                    battlePhaseGUI.setWhatwill("You attacked the enemy!");
                    battlePhaseGUI.setLabel2("You dealt " + damage + "!");
                    battlePhaseGUI.setYourcreaturedoBounds(13, 60, 140, 20);
                    battlePhaseGUI.setYourcreaturedo("Remaining Actions: " + actionCount);

                    battlePhaseGUI.setHealthlabel(String.valueOf(enemyHealth));
                    if (enemyHealth <= 49 && enemyHealth > 40) {
                        battlePhaseGUI.setHealth5(healthreduced);
                    } else if (enemyHealth <= 40 && enemyHealth > 35) {
                        battlePhaseGUI.setHealth5(healthloss);
                    } else if (enemyHealth <= 35 && enemyHealth > 30) {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthreduced);
                    } else if (enemyHealth <= 30 && enemyHealth > 25) {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthloss);
                    } else if (enemyHealth <= 25 && enemyHealth > 20) {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthloss);
                        battlePhaseGUI.setHealth3(healthreduced);
                    } else if (enemyHealth <= 20 && enemyHealth > 15) {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthloss);
                        battlePhaseGUI.setHealth3(healthloss);
                    } else if (enemyHealth <= 15 && enemyHealth > 10) {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthloss);
                        battlePhaseGUI.setHealth3(healthloss);
                        battlePhaseGUI.setHealth2(healthreduced);
                    } else if (enemyHealth <= 10 && enemyHealth > 5) {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthloss);
                        battlePhaseGUI.setHealth3(healthloss);
                        battlePhaseGUI.setHealth2(healthloss);
                    } else if (enemyHealth <= 5 && enemyHealth > 0) {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthloss);
                        battlePhaseGUI.setHealth3(healthloss);
                        battlePhaseGUI.setHealth2(healthloss);
                        battlePhaseGUI.setHealth1(healthreduced);
                    } else {
                        battlePhaseGUI.setHealth5(healthloss);
                        battlePhaseGUI.setHealth4(healthloss);
                        battlePhaseGUI.setHealth3(healthloss);
                        battlePhaseGUI.setHealth2(healthloss);
                        battlePhaseGUI.setHealth1(healthloss);

                        enemyDiedGUI.setVisible(true);
                    }
                } else {
                    consumedAttacksGUI.setVisible(true);
                }
                if (actionCount <= 0) {
                    consumedAttacksGUI.setVisible(true);
                }

            }
        });
        /**
         * Listener for Return to Area when enemy died
         */
        enemyDiedGUI.setReturntoarea(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (exploreAreaGUI.getArea() == "area1") {
                    area1GUI.setVisible(true);
                    resetBattle();
                    battlePhaseGUI.dispose();
                    enemyDiedGUI.setVisible(true);
                } else if (exploreAreaGUI.getArea() == "area2") {
                    area2GUI.setVisible(true);
                    resetBattle();
                    battlePhaseGUI.dispose();
                    enemyDiedGUI.setVisible(true);
                } else {
                    area3GUI.setVisible(true);
                    resetBattle();
                    battlePhaseGUI.dispose();
                    enemyDiedGUI.setVisible(true);
                }
            }
        });
        /**
         * Listener for Return to Menu when enemy Died
         */
        enemyDiedGUI.setReturntomenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI.setVisible(true);
                enemyDiedGUI.dispose();
                battlePhaseGUI.dispose();
            }
        });
        /**
         * Listener for Return to Area when all attacks where consumed
         */
       consumedAttacksGUI.setReturntoareaActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fullhealth = "/images/heart.png";

                if (exploreAreaGUI.getArea() == "area1") {
                    area1GUI.setVisible(true);
                } else if (exploreAreaGUI.getArea() == "area2") {
                    area2GUI.setVisible(true);
                } else {
                    area3GUI.setVisible(true);
                }
                consumedAttacksGUI.dispose();
                battlePhaseGUI.dispose();

                resetBattle();
                battlePhaseGUI.setWhatwill("What will your ");
                battlePhaseGUI.setLabel2("");
                battlePhaseGUI.setYourcreaturedo("creature do?");
                battlePhaseGUI.setYourcreaturedoBounds(13, 40, 180, 22);
                battlePhaseGUI.setHealthlabel("50");
                battlePhaseGUI.setHealth1(fullhealth);
                battlePhaseGUI.setHealth2(fullhealth);
                battlePhaseGUI.setHealth3(fullhealth);
                battlePhaseGUI.setHealth4(fullhealth);
                battlePhaseGUI.setHealth5(fullhealth);
            }
        });
        /**
         * Listener for Catch
         */
        battlePhaseGUI.catchActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fullhealth = "/images/heart.png";
                String pokeball = "/images/pokeball.png";

                if (!enemyCaught && actionCount > 0) {
                    consumedAttacksGUI.setVisible(false);
                    int catchRate = calculateCatchRate(enemyHealth);
                    int maxRandom = 100 - (enemyHealth / 2); // Adjust the divisor for desired randomness

                    int randomChance = new Random().nextInt(100);

                    actionCount--; // Decrease actionCount for a successful catch
                    if (randomChance <= catchRate && catchRate != 40) {

                        consumedAttacksGUI.setVisible(false);
                        battlePhaseGUI.setEnemycreatureimg(pokeball);
                        battlePhaseGUI.setWhatwill("SUCCESS!");
                        battlePhaseGUI.setWhatwillForeground(0, 153, 0);
                        battlePhaseGUI.setLabel2("You captured the Enemy!");
                        battlePhaseGUI.setYourcreaturedoBounds(13, 60, 140, 20);
                        battlePhaseGUI.setYourcreaturedo("Remaining Actions: " + actionCount);
                        String levelString = enemyCaughtGUI.getEnemylevel();
                        int level;
                        consumedAttacksGUI.setVisible(false);
                        String numericPart = levelString.replaceAll("\\D+", "");
                        level = Integer.parseInt(numericPart);
                        enemyCaughtGUI.setVisible(true);

                        inventory.addCreature(new Creatures(enemyCaughtGUI.getEnemyName(), enemyCaughtGUI.getEnemyType(), enemyCaughtGUI.getEnemyFamily(), level, enemyCaughtGUI.getEnemyTextFile()));
                        System.out.print(inventory.getUserCreatures().get(0).getcName());
                        if (inventory.getUserCreatures().size() == 1) {
                            changeActiveGUI.setType1(inventory.getUserCreatures().get(0).getcType());
                            changeActiveGUI.setLevel1(String.valueOf(inventory.getUserCreatures().get(0).getcLevel()));
                            changeActiveGUI.setName1(inventory.getUserCreatures().get(0).getcName());
                            changeActiveGUI.setFamily1(inventory.getUserCreatures().get(0).getcFamily());
                            changeActiveGUI.setSlot1img(inventory.getUserCreatures().get(0).getImageFileName());
                        } else if (inventory.getUserCreatures().size() == 2) {
                            changeActiveGUI.setType1(inventory.getUserCreatures().get(0).getcType());
                            changeActiveGUI.setLevel1(String.valueOf(inventory.getUserCreatures().get(0).getcLevel()));
                            changeActiveGUI.setName1(inventory.getUserCreatures().get(0).getcName());
                            changeActiveGUI.setFamily1(inventory.getUserCreatures().get(0).getcFamily());
                            changeActiveGUI.setSlot1img(inventory.getUserCreatures().get(0).getImageFileName());


                            inventoryGUI.setType2(inventory.getUserCreatures().get(1).getcType());
                            inventoryGUI.setLevel2(String.valueOf(inventory.getUserCreatures().get(1).getcLevel()));
                            inventoryGUI.setName2(inventory.getUserCreatures().get(1).getcName());
                            inventoryGUI.setFamily2(inventory.getUserCreatures().get(1).getcFamily());
                            inventoryGUI.setSlot2img(inventory.getUserCreatures().get(1).getImageFileName());

                            changeActiveGUI.setType2(inventory.getUserCreatures().get(1).getcType());
                            changeActiveGUI.setLevel2(String.valueOf(inventory.getUserCreatures().get(1).getcLevel()));
                            changeActiveGUI.setName2(inventory.getUserCreatures().get(1).getcName());
                            changeActiveGUI.setFamily2(inventory.getUserCreatures().get(1).getcFamily());
                            changeActiveGUI.setSlot2img(inventory.getUserCreatures().get(1).getImageFileName());
                        } else if (inventory.getUserCreatures().size() == 3) {
                            inventoryGUI.setType3(inventory.getUserCreatures().get(2).getcType());
                            inventoryGUI.setLevel3(String.valueOf(inventory.getUserCreatures().get(2).getcLevel()));
                            inventoryGUI.setName3(inventory.getUserCreatures().get(2).getcName());
                            inventoryGUI.setFamily3(inventory.getUserCreatures().get(2).getcFamily());
                            inventoryGUI.setSlot3img(inventory.getUserCreatures().get(2).getImageFileName());

                            changeActiveGUI.setType3(inventory.getUserCreatures().get(2).getcType());
                            changeActiveGUI.setLevel3(String.valueOf(inventory.getUserCreatures().get(2).getcLevel()));
                            changeActiveGUI.setName3(inventory.getUserCreatures().get(2).getcName());
                            changeActiveGUI.setFamily3(inventory.getUserCreatures().get(2).getcFamily());
                            changeActiveGUI.setSlot3img(inventory.getUserCreatures().get(2).getImageFileName());
                        } else if (inventory.getUserCreatures().size() == 4) {
                            inventoryGUI.setType4(inventory.getUserCreatures().get(3).getcType());
                            inventoryGUI.setLevel4(String.valueOf(inventory.getUserCreatures().get(3).getcLevel()));
                            inventoryGUI.setName4(inventory.getUserCreatures().get(3).getcName());
                            inventoryGUI.setFamily4(inventory.getUserCreatures().get(3).getcFamily());
                            inventoryGUI.setSlot4img(inventory.getUserCreatures().get(3).getImageFileName());

                            changeActiveGUI.setType4(inventory.getUserCreatures().get(3).getcType());
                            changeActiveGUI.setLevel4(String.valueOf(inventory.getUserCreatures().get(3).getcLevel()));
                            changeActiveGUI.setName4(inventory.getUserCreatures().get(3).getcName());
                            changeActiveGUI.setFamily4(inventory.getUserCreatures().get(3).getcFamily());
                            changeActiveGUI.setSlot4img(inventory.getUserCreatures().get(3).getImageFileName());
                        } else if (inventory.getUserCreatures().size() == 5) {
                            inventoryGUI.setType5(inventory.getUserCreatures().get(4).getcType());
                            inventoryGUI.setLevel5(String.valueOf(inventory.getUserCreatures().get(4).getcLevel()));
                            inventoryGUI.setName5(inventory.getUserCreatures().get(4).getcName());
                            inventoryGUI.setFamily5(inventory.getUserCreatures().get(4).getcFamily());
                            inventoryGUI.setSlot5img(inventory.getUserCreatures().get(4).getImageFileName());

                            changeActiveGUI.setType5(inventory.getUserCreatures().get(4).getcType());
                            changeActiveGUI.setLevel5(String.valueOf(inventory.getUserCreatures().get(4).getcLevel()));
                            changeActiveGUI.setName5(inventory.getUserCreatures().get(4).getcName());
                            changeActiveGUI.setFamily5(inventory.getUserCreatures().get(4).getcFamily());
                            changeActiveGUI.setSlot5img(inventory.getUserCreatures().get(4).getImageFileName());
                        } else if (inventory.getUserCreatures().size() == 6) {
                            inventoryGUI.setType6(inventory.getUserCreatures().get(5).getcType());
                            inventoryGUI.setLevel6(String.valueOf(inventory.getUserCreatures().get(5).getcLevel()));
                            inventoryGUI.setName6(inventory.getUserCreatures().get(5).getcName());
                            inventoryGUI.setFamily6(inventory.getUserCreatures().get(5).getcFamily());
                            inventoryGUI.setSlot6img(inventory.getUserCreatures().get(5).getImageFileName());

                            changeActiveGUI.setType6(inventory.getUserCreatures().get(6).getcType());
                            changeActiveGUI.setLevel6(String.valueOf(inventory.getUserCreatures().get(6).getcLevel()));
                            changeActiveGUI.setName6(inventory.getUserCreatures().get(6).getcName());
                            changeActiveGUI.setFamily6(inventory.getUserCreatures().get(6).getcFamily());
                            changeActiveGUI.setSlot6img(inventory.getUserCreatures().get(6).getImageFileName());
                        } else {
                            //display reach max
                        }
                        enemyCaught = true;
                        resetBattle();
                    } else {
                        System.out.print(" catch: " + actionCount);
                        battlePhaseGUI.setWhatwill("FAILED!");
                        battlePhaseGUI.setWhatwillForeground(100, 0, 0);
                        battlePhaseGUI.setLabel2("Catch attempt failed!");
                        battlePhaseGUI.setYourcreaturedoBounds(13, 60, 140, 20);
                        battlePhaseGUI.setYourcreaturedo("Remaining Actions: " + actionCount);
                        if (actionCount <= 0) {
                            consumedAttacksGUI.setVisible(true);
                        }
                    }
                }
            }
        });
        /**
         * Listener for Return to Area when enemy caught
         */
        enemyCaughtGUI.setReturntoarea(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consumedAttacksGUI.setVisible(false);

                if (exploreAreaGUI.getArea() == "area1") {
                    area1GUI.setVisible(true);
                } else if (exploreAreaGUI.getArea() == "area2") {
                    area2GUI.setVisible(true);
                } else {
                    area3GUI.setVisible(true);
                }

                enemyCaughtGUI.dispose();
                battlePhaseGUI.dispose();
                resetBattle();
                consumedAttacksGUI.setVisible(false);
            }
        });
        /**
         * Listener for Return to menu when swaping is error
         */
        this.errorSwapGUI.setReturntomenuActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI.setVisible(true);
                errorInventoryGUI.dispose();
                battlePhaseGUI.dispose();
                errorSwapGUI.dispose();
            }
        });
        /**
         * Listener for return to battle when swapping error
         */
        this.errorSwapGUI.returntobattleActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                battlePhaseGUI.setVisible(true);
                errorInventoryGUI.dispose();
                errorSwapGUI.dispose();
            }
        });
        /**
         * Listener for Swap
         */
        battlePhaseGUI.swapActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionCount--;
                if (actionCount >= 0) {
                    if (inventory.getUserCreatures().size() == 1) {
                        battlePhaseGUI.setWhatwill("FAILED!");
                        battlePhaseGUI.setWhatwillForeground(153, 0, 0);
                        battlePhaseGUI.setLabel2("Cannot change!");
                        battlePhaseGUI.setYourcreaturedoBounds(13, 60, 140, 20);
                        battlePhaseGUI.setYourcreaturedo("Remaining Actions: " + actionCount);
                        errorSwapGUI.setVisible(true);
                    } else {
                        changeActiveGUI.setVisible(true);
                        battlePhaseGUI.dispose();
                    }
                } else {
                    consumedAttacksGUI.setVisible(true);
                }
            }
        });
        /**
         * Listener for Choosing Option 1 under options of creature
         * Change the Active Creature for GUI of battlephase,confirmation and inventory
         */
        this.changeActiveGUI.setOption1ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(0).getcName();
                String family = inventory.getUserCreatures().get(0).getcFamily();
                String type = inventory.getUserCreatures().get(0).getcType();
                int level = inventory.getUserCreatures().get(0).getcLevel();
                String filename = inventory.getUserCreatures().get(0).getImageFileName();

                battlePhaseGUI.setActivecreaturename(name);
                battlePhaseGUI.setActivecreatureimg(filename);
                battlePhaseGUI.setActivecreaturelevel(Integer.toString(level));
                battlePhaseGUI.setActivecreaturetype(type);
                battlePhaseGUI.setActivecreaturefamily(family);

                changeConfirmationGUI.setActiveCreatureFamily(family);
                changeConfirmationGUI.setActiveCreatureName(name);
                changeConfirmationGUI.setActivecreatureType(type);
                changeConfirmationGUI.setActiveCreatureFLevel(Integer.toString(level));
                changeConfirmationGUI.setActivecreatureimg(filename);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                changeConfirmationGUI.setVisible(true);

            }
        });
        /**
         * Listener for Choosing Option 2 under options of creature
         * Change the Active Creature for GUI of battlephase,confirmation and inventory
         */
        this.changeActiveGUI.setOption2ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(1).getcName();
                String family = inventory.getUserCreatures().get(1).getcFamily();
                String type = inventory.getUserCreatures().get(1).getcType();
                int level = inventory.getUserCreatures().get(1).getcLevel();
                String filename = inventory.getUserCreatures().get(1).getImageFileName();

                battlePhaseGUI.setActivecreaturename(name);
                battlePhaseGUI.setActivecreatureimg(filename);
                battlePhaseGUI.setActivecreaturelevel(Integer.toString(level));
                battlePhaseGUI.setActivecreaturetype(type);
                battlePhaseGUI.setActivecreaturefamily(family);

                changeConfirmationGUI.setActiveCreatureFamily(family);
                changeConfirmationGUI.setActiveCreatureName(name);
                changeConfirmationGUI.setActivecreatureType(type);
                changeConfirmationGUI.setActiveCreatureFLevel(Integer.toString(level));
                changeConfirmationGUI.setActivecreatureimg(filename);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);
                changeConfirmationGUI.setVisible(true);
            }
        });
        /**
         * Listener for Choosing Option 3 under options of creature
         * Change the Active Creature for GUI of battlephase,confirmation and inventory
         */
        this.changeActiveGUI.setOption3ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(2).getcName();
                String family = inventory.getUserCreatures().get(0).getcFamily();
                String type = inventory.getUserCreatures().get(2).getcType();
                int level = inventory.getUserCreatures().get(2).getcLevel();
                String filename = inventory.getUserCreatures().get(2).getImageFileName();

                battlePhaseGUI.setActivecreaturename(name);
                battlePhaseGUI.setActivecreatureimg(filename);
                battlePhaseGUI.setActivecreaturelevel(Integer.toString(level));
                battlePhaseGUI.setActivecreaturetype(type);
                battlePhaseGUI.setActivecreaturefamily(family);

                changeConfirmationGUI.setActiveCreatureFamily(family);
                changeConfirmationGUI.setActiveCreatureName(name);
                changeConfirmationGUI.setActivecreatureType(type);
                changeConfirmationGUI.setActiveCreatureFLevel(Integer.toString(level));
                changeConfirmationGUI.setActivecreatureimg(filename);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);
                changeConfirmationGUI.setVisible(true);
            }
        });
        /**
         * Listener for Choosing Option 4 under options of creature
         * Change the Active Creature for GUI of battlephase,confirmation and inventory
         */
        this.changeActiveGUI.setOption4ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(3).getcName();
                String family = inventory.getUserCreatures().get(3).getcFamily();
                String type = inventory.getUserCreatures().get(3).getcType();
                int level = inventory.getUserCreatures().get(3).getcLevel();
                String filename = inventory.getUserCreatures().get(3).getImageFileName();

                battlePhaseGUI.setActivecreaturename(name);
                battlePhaseGUI.setActivecreatureimg(filename);
                battlePhaseGUI.setActivecreaturelevel(Integer.toString(level));
                battlePhaseGUI.setActivecreaturetype(type);
                battlePhaseGUI.setActivecreaturefamily(family);

                changeConfirmationGUI.setActiveCreatureFamily(family);
                changeConfirmationGUI.setActiveCreatureName(name);
                changeConfirmationGUI.setActivecreatureType(type);
                changeConfirmationGUI.setActiveCreatureFLevel(Integer.toString(level));
                changeConfirmationGUI.setActivecreatureimg(filename);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);
                changeConfirmationGUI.setVisible(true);
            }
        });
        /**
         * Listener for Choosing Option 5 under options of creature
         * Change the Active Creature for GUI of battlephase,confirmation and inventory
         */
        this.changeActiveGUI.setOption5ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(4).getcName();
                String family = inventory.getUserCreatures().get(4).getcFamily();
                String type = inventory.getUserCreatures().get(4).getcType();
                int level = inventory.getUserCreatures().get(4).getcLevel();
                String filename = inventory.getUserCreatures().get(4).getImageFileName();

                battlePhaseGUI.setActivecreaturename(name);
                battlePhaseGUI.setActivecreatureimg(filename);
                battlePhaseGUI.setActivecreaturelevel(Integer.toString(level));
                battlePhaseGUI.setActivecreaturetype(type);
                battlePhaseGUI.setActivecreaturefamily(family);

                changeConfirmationGUI.setActiveCreatureFamily(family);
                changeConfirmationGUI.setActiveCreatureName(name);
                changeConfirmationGUI.setActivecreatureType(type);
                changeConfirmationGUI.setActiveCreatureFLevel(Integer.toString(level));
                changeConfirmationGUI.setActivecreatureimg(filename);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);
                changeConfirmationGUI.setVisible(true);
            }
        });
        /**
         * Listener for Choosing Option 6 under options of creature
         *      Change the Active Creature for GUI of battlephase,confirmation and inventory
         */
        this.changeActiveGUI.setOption6ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getUserCreatures().get(5).getcName();
                String family = inventory.getUserCreatures().get(5).getcFamily();
                String type = inventory.getUserCreatures().get(5).getcType();
                int level = inventory.getUserCreatures().get(5).getcLevel();
                String filename = inventory.getUserCreatures().get(5).getImageFileName();

                battlePhaseGUI.setActivecreaturename(name);
                battlePhaseGUI.setActivecreatureimg(filename);
                battlePhaseGUI.setActivecreaturelevel(Integer.toString(level));
                battlePhaseGUI.setActivecreaturetype(type);
                battlePhaseGUI.setActivecreaturefamily(family);

                changeConfirmationGUI.setActiveCreatureFamily(family);
                changeConfirmationGUI.setActiveCreatureName(name);
                changeConfirmationGUI.setActivecreatureType(type);
                changeConfirmationGUI.setActiveCreatureFLevel(Integer.toString(level));
                changeConfirmationGUI.setActivecreatureimg(filename);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);
                changeConfirmationGUI.setVisible(true);
            }
        });
        /**
         * Listener for back option under chnaging of active creature
         */
        this.changeActiveGUI.setBackinvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                battlePhaseGUI.setVisible(true);
                changeActiveGUI.dispose();
                changeActiveGUI.setVisible(false);
            }
        });
        /**
         * Listener for No option in confirmation of changing active creature
         */
        this.changeConfirmationGUI.noActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = inventory.getActiveCreature().getcName();
                String family = inventory.getActiveCreature().getcFamily();
                String type = inventory.getActiveCreature().getcType();
                int level = inventory.getActiveCreature().getcLevel();
                String filename = inventory.getActiveCreature().getImageFileName();

                battlePhaseGUI.setActivecreaturename(name);
                battlePhaseGUI.setEnemycreatureimg(filename);
                battlePhaseGUI.setActivecreaturelevel(Integer.toString(level));
                battlePhaseGUI.setActivecreaturetype(type);
                battlePhaseGUI.setActivecreaturefamily(family);

                inventoryGUI.setActiveIcon(filename);
                inventoryGUI.setFamilya3(family);
                inventoryGUI.setFiretypes3(type);
                inventoryGUI.setLevel1s3(Integer.toString(level));
                inventoryGUI.setNames3creature(name);

                battlePhaseGUI.setVisible(true);

            }
        });
        /**
         * Listener for Yes option in confirmation of changing active creature
         */
        this.changeConfirmationGUI.yesActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeActiveGUI.dispose();
                changeConfirmationGUI.dispose();

                battlePhaseGUI.setWhatwill("SUCCESS!");
                battlePhaseGUI.setWhatwillForeground(0, 153, 0);
                battlePhaseGUI.setLabel2("You change your Active Creature");
                battlePhaseGUI.setYourcreaturedoBounds(13, 60, 140, 20);
                battlePhaseGUI.setYourcreaturedo("Remaining Actions: " + actionCount);
                battlePhaseGUI.setVisible(true);
            }
        });
    }
    /**
     * Calculates the attack damage based on the active creature's level and the enemy's type.
     *
     * @param enemyHealth The health of enemy where its the basis
     * @return The calculated catch rate based on the enemy health
     */
    private int calculateCatchRate(int enemyHealth) {
        // Use the provided catch rate formula
        int catchRate = (40 + 50 - enemyHealth) % 100;

        // Ensure the catch rate is within valid bounds (0 to 100)
        return Math.max(0, Math.min(catchRate, 100));
    }

    /**
     * Calculates the attack damage based on the active creature's level and the enemy's type.
     *
     * @param activeLevel The level of the active creature as a string containing numeric and non-numeric parts.
     * @param enemyType   The type of the enemy creature.
     * @return The calculated damage based on the active creature's level and type advantages.
     */
    private int calculateAttackDamage(String activeLevel, String enemyType) {
        // Extract the numeric part from activeLevel using regular expression
        String numericPart = activeLevel.replaceAll("\\D+", "");

        // Parse the numeric part into an integer
        int activeEL = Integer.parseInt(numericPart);

        Random random = new Random();
        int baseDamage = random.nextInt(10) + 1; // RAND(1, 10)
        int damage = baseDamage * activeEL;

        // If the active creature's type is stronger than the enemy's type, multiply damage by 1.5
        if (isTypeAdvantage(inventoryGUI.getActiveType(), enemyType)) {
            damage = (int) (damage * 1.5);
        }
        return damage;
    }

    /**
     * Resets the battle parameters to their initial values.
     */
    private void resetBattle() {
        enemyHealth = 50;
        actionCount = 3;
        enemyCaught = false;
    }

    /**
     * Checks if the active creature's type has an advantage over the enemy's type.
     *
     * @param activeType The type of the active creature.
     * @param enemyType  The type of the enemy creature.
     * @return True if the active creature has a type advantage over the enemy; otherwise, false.
     */
    private boolean isTypeAdvantage(String activeType, String enemyType) {
        return (activeType.equals("FIRE") && enemyType.equals("GRASS")) ||
                (activeType.equals("GRASS") && enemyType.equals("WATER")) ||
                (activeType.equals("WATER") && enemyType.equals("FIRE"));
    }
}


