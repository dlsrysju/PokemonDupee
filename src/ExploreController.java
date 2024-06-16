import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Random;

/**
 * The ExploreController class manages the exploration functionality in the game.
 * It includes the following attributes:
 * - {@code area1GUI} - Graphical user interface for Area 1
 * - {@code area2GUI} - Graphical user interface for Area 2
 * - {@code area3GUI} - Graphical user interface for Area 3
 * - {@code characterX} - Current X position of the character
 * - {@code characterY} - Current Y position of the character
 * - {@code characterWidth} - Width of the character
 * - {@code characterHeight} - Height of the character
 * - {@code currposX} - Current X position (temporary)
 * - {@code currposY} - Current Y position (temporary)
 * - {@code oobGUI} - Graphical user interface for handling out-of-bound situations
 * - {@code creaturesList} - List to store creature objects
 * - {@code creaturesListArea2} - List to store creature objects for Area 2
 * - {@code creaturesListArea3} - List to store creature objects for Area 3
 * - {@code inventory} - Inventory instance for managing player's items and creatures
 * - {@code enemyEncounteredGUI} - Graphical user interface for notifying the player about encountering an enemy
 * - {@code battlePhaseGUI} - Graphical user interface for the battle phase
 * - {@code consumedAttacksGUI} - Graphical user interface for displaying consumed attacks during the battle
 * - {@code allowCharacterMovement} - Flag to control character movement
 * - {@code enemyName} - Name of the encountered enemy
 * - {@code enemyType} - Type of the encountered enemy
 * - {@code enemyFamily} - Family of the encountered enemy
 * - {@code enemyLevel} - Level of the encountered enemy
 * - {@code enemyImageFileName} - File name of the image for the encountered enemy
 * - {@code enemyHealth} - Health of the encountered enemy
 * - {@code enemyCaughtGUI} - Graphical user interface for notifying the player when an enemy is caught
 * - {@code area} - String indicating the current area
 *
 * Author: De los Reyes, Carl Justin
 */
public class ExploreController {
    private Area1GUI area1GUI;
    private Area2GUI area2GUI;
    private Area3GUI area3GUI;
    private int characterX; // current X position of the character
    private int characterY; // current Y position of the character
    private int characterWidth; // width of the character
    private int characterHeight; // height of the character
    private int currposX = 0;
    private int currposY = 0;
    private OutofBoundGUI oobGUI;
    private ArrayList<Creatures> creaturesList;
    private Inventory inventory;
    private EnemyEncounteredGUI enemyEncounteredGUI;
    private BattlePhaseGUI battlePhaseGUI;
    private ConsumedAttacksGUI consumedAttacksGUI;
    private boolean allowCharacterMovement = true;
    private String enemyName;
    private String enemyType;
    private String enemyFamily;
    private int enemyLevel;
    private String enemyImageFileName;
    private int enemyHealth;
    private EnemyCaughtGUI enemyCaughtGUI;
    private ArrayList<Creatures>  creaturesListArea2;
    private ArrayList<Creatures> creaturesListArea3;
    private String area;
    /**
     * Constructs an instance of ExploreController.
     *
     * @param menuGUI         The graphical user interface for the game menu.
     * @param inventory       The inventory instance for managing player's items and creatures.
     * @param inventoryGUI    The graphical user interface for the inventory.
     * @param exploreAreaGUI  The graphical user interface for exploring different areas in the game.
     * @param changeActiveGUI The graphical user interface for changing the active item in the inventory.
     */
    public ExploreController(MenuGUI menuGUI, Inventory inventory, InventoryGUI inventoryGUI, ExploreAreaGUI exploreAreaGUI, ChangeActiveGUI changeActiveGUI) {
        this.area1GUI = new Area1GUI();
        this.area2GUI = new Area2GUI();
        this.area3GUI = new Area3GUI();
        this.oobGUI = new OutofBoundGUI();
        this.creaturesList = new ArrayList<>();
        this.creaturesListArea2 = new ArrayList<>();
        this.creaturesListArea3 = new ArrayList<>();
        this.battlePhaseGUI = new BattlePhaseGUI();
        this.enemyCaughtGUI = new EnemyCaughtGUI();
        this.consumedAttacksGUI = new ConsumedAttacksGUI();
        this.enemyHealth = 50;

        creaturesList.add(new Creatures("Strawmander", "Fire", "Family A", 1, "/images/charmander(updated) (3).png"));
        creaturesList.add(new Creatures("Chocowool", "Fire", "Family B", 1, "/images/mareep (1).png"));
        creaturesList.add(new Creatures("Parfwit", "Fire", "Family C", 1, "/images/parfwit.png"));
        creaturesList.add(new Creatures("Brownisaur", "Grass", "Family D", 1, "/images/bulbasaur.png"));
        creaturesList.add(new Creatures("Frubat", "Grass", "Family E", 1, "/images/frubat.png"));
        creaturesList.add(new Creatures("Malts", "Grass", "Family F", 1, "/images/malts.png"));
        creaturesList.add(new Creatures("Squirpie", "Water", "Family G", 1, "/images/squirpie.png"));
        creaturesList.add(new Creatures("Chocolite", "Water", "Family H", 1, "/images/chocolite.png"));
        creaturesList.add(new Creatures("Oshacone", "Water", "Family I", 1, "/images/water (2).png"));

        creaturesListArea2.add(new Creatures("Strawmander", "Fire", "Family A", 1, "/images/charmander(updated) (3).png"));
        creaturesListArea2.add(new Creatures("Chocowool", "Fire", "Family B", 1, "/images/mareep (1).png"));
        creaturesListArea2.add(new Creatures("Parfwit", "Fire", "Family C", 1, "/images/parfwit.png"));
        creaturesListArea2.add(new Creatures("Brownisaur", "Grass", "Family D", 1, "/images/bulbasaur.png"));
        creaturesListArea2.add(new Creatures("Frubat", "Grass", "Family E", 1, "/images/frubat.png"));
        creaturesListArea2.add(new Creatures("Malts", "Grass", "Family F", 1, "/images/malts.png"));
        creaturesListArea2.add(new Creatures("Squirpie", "Water", "Family G", 1, "/images/squirpie.png"));
        creaturesListArea2.add(new Creatures("Chocolite", "Water", "Family H", 1, "/images/chocolite.png"));
        creaturesListArea2.add(new Creatures("Oshacone", "Water", "Family I", 1, "/images/water (2).png"));
        creaturesListArea2.add(new Creatures("Strawleon", "Fire", "Family A", 2, "/images/straweleon.png"));
        creaturesListArea2.add(new Creatures("Chocofluff", "Fire", "Family B", 2, "/images/chocofluff.png"));
        creaturesListArea2.add(new Creatures("Parfure", "Fire", "Family C", 2, "/images/parfure.png"));
        creaturesListArea2.add(new Creatures("Chocosaur", "Grass", "Family D", 2, "/images/chocosaur.png"));
        creaturesListArea2.add(new Creatures("Golberry", "Grass", "Family E", 2, "/images/golberry.png"));
        creaturesListArea2.add(new Creatures("Kirlicake", "Grass", "Family F", 2, "/images/kirlicake.png"));
        creaturesListArea2.add(new Creatures("Tartortle", "Water", "Family G", 2, "/images/tartortle.png"));
        creaturesListArea2.add(new Creatures("Chocolish", "Water", "Family H", 2, "/images/chocolish.png"));
        creaturesListArea2.add(new Creatures("Dewice", "Water", "Family I", 2, "/images/dewice.png"));

        creaturesListArea3.add(new Creatures("Strawmander", "Fire", "Family A", 1, "/images/charmander(updated) (3).png"));
        creaturesListArea3.add(new Creatures("Chocowool", "Fire", "Family B", 1, "/images/mareep (1).png"));
        creaturesListArea3.add(new Creatures("Parfwit", "Fire", "Family C", 1, "/images/parfwit.png"));
        creaturesListArea3.add(new Creatures("Brownisaur", "Grass", "Family D", 1, "/images/bulbasaur.png"));
        creaturesListArea3.add(new Creatures("Frubat", "Grass", "Family E", 1, "/images/frubat.png"));
        creaturesListArea3.add(new Creatures("Malts", "Grass", "Family F", 1, "/images/malts.png"));
        creaturesListArea3.add(new Creatures("Squirpie", "Water", "Family G", 1, "/images/squirpie.png"));
        creaturesListArea3.add(new Creatures("Chocolite", "Water", "Family H", 1, "/images/chocolite.png"));
        creaturesListArea3.add(new Creatures("Oshacone", "Water", "Family I", 1, "/images/water (2).png"));
        creaturesListArea3.add(new Creatures("Strawleon", "Fire", "Family A", 2, "/images/straweleon.png"));
        creaturesListArea3.add(new Creatures("Chocofluff", "Fire", "Family B", 2, "/images/chocofluff.png"));
        creaturesListArea3.add(new Creatures("Parfure", "Fire", "Family C", 2, "/images/parfure.png"));
        creaturesListArea3.add(new Creatures("Chocosaur", "Grass", "Family D", 2, "/images/chocosaur.png"));
        creaturesListArea3.add(new Creatures("Golberry", "Grass", "Family E", 2, "/images/golberry.png"));
        creaturesListArea3.add(new Creatures("Kirlicake", "Grass", "Family F", 2, "/images/kirlicake.png"));
        creaturesListArea3.add(new Creatures("Tartortle", "Water", "Family G", 2, "/images/tartortle.png"));
        creaturesListArea3.add(new Creatures("Chocolish", "Water", "Family H", 2, "/images/chocolish.png"));
        creaturesListArea3.add(new Creatures("Dewice", "Water", "Family I", 2, "/images/dewice.png"));
        creaturesListArea3.add(new Creatures("Strawizard", "Fire", "Family A", 3, "/images/strawizard.png"));
        creaturesListArea3.add(new Creatures("Candaros", "Fire", "Family B", 3, "/images/candaros.png"));
        creaturesListArea3.add(new Creatures("Parfelure", "Fire", "Family C", 3, "/images/parfelure.png"));
        creaturesListArea3.add(new Creatures("Fudgusaur", "Grass", "Family D", 3, "/images/fudgusaur.png"));
        creaturesListArea3.add(new Creatures("Croberry", "Grass", "Family E", 3, "/images/croberry.png"));
        creaturesListArea3.add(new Creatures("Velvevoir", "Grass", "Family F", 3, "/images/velvivoire.png"));
        creaturesListArea3.add(new Creatures("Piestoise", "Water", "Family G", 3, "/images/piestoise.png"));
        creaturesListArea3.add(new Creatures("Ice Sundae", "Water", "Family H", 3, "/images/icesundae.png"));
        creaturesListArea3.add(new Creatures("Samurcone", "Water", "Family I", 3, "/images/samurcone.png"));

        this.inventory = inventory;
        this.enemyEncounteredGUI = new EnemyEncounteredGUI();
        /**
         * Listener for back button in area1
         */
        area1GUI.setbackActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exploreAreaGUI.setArea("null");
                area2GUI.setVisible(false);
                area3GUI.setVisible(false);
                // Reset character position to default
                characterX = 60;
                characterY = -100;
                currposX = characterX;
                currposY = characterY;

                // Set the character position in Area1GUI
                area1GUI.setChracterPosition(characterX, characterY, characterWidth, characterHeight);

                exploreAreaGUI.setVisible(true);
                area1GUI.dispose();
                oobGUI.dispose();
            }
        });
        /**
         * Listener for Moving the character to left under area 1
         */
        area1GUI.setArrowleftActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area3GUI.setVisible(false);
                oobGUI.setVisible(true);

                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for selecting other area under OutOfBounds GUI
         */
        oobGUI.selectanotherareaActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area3GUI.setVisible(false);
                exploreAreaGUI.setVisible(true);

                System.out.println("Select Another Area Clicked");
                System.out.println("Before Reset - characterX: " + characterX + ", characterY: " + characterY);

                // Reset character position to initial state
                characterX = 60;
                characterY = -100;
                currposX = characterX;
                currposY = characterY;

                // Set the character position in Area1GUI
                area1GUI.setChracterPosition(characterX, characterY, characterWidth, characterHeight);

                System.out.println("After Reset - characterX: " + characterX + ", characterY: " + characterY);

                area1GUI.dispose();
                oobGUI.dispose();
            }
        });
        /**
         * Listener for Moving the character to right under area1
         */
        area1GUI.setArrowrightActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area3GUI.setVisible(false);
                oobGUI.setVisible(true);

                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for proceeding when an enemy encounteredduring roaming in the area
         */
        enemyEncounteredGUI.setProceedActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BattlePhaseController battlePhaseController = new BattlePhaseController(menuGUI, inventory, inventoryGUI, exploreAreaGUI, battlePhaseGUI, area1GUI, enemyCaughtGUI, area3GUI, area2GUI, consumedAttacksGUI, changeActiveGUI);
                if(exploreAreaGUI.getArea() == "area1"){
                    area2GUI.setVisible(false);
                    area3GUI.setVisible(false);
                    battlePhaseGUI.setEnemyname(enemyName);
                    battlePhaseGUI.setEnemytype(enemyType);
                    battlePhaseGUI.setEnemyfamily(enemyFamily);
                    battlePhaseGUI.setEnemylevel(Integer.toString(enemyLevel));
                    battlePhaseGUI.setEnemycreatureimg(enemyImageFileName);

                    battlePhaseGUI.setActivecreaturefamily(inventoryGUI.getActiveFamily());
                    battlePhaseGUI.setActivecreaturename(inventoryGUI.getActiveName());
                    battlePhaseGUI.setActivecreaturetype(inventoryGUI.getActiveType());
                    battlePhaseGUI.setActivecreaturelevel(inventoryGUI.getActiveLevel());
                    battlePhaseGUI.setActivecreatureimg(inventoryGUI.getFilename());
                    allowCharacterMovement = true;
                    battlePhaseGUI.setVisible(true);
                    enemyEncounteredGUI.dispose();
                    area1GUI.dispose();
                }else if(exploreAreaGUI.getArea() == "area2"){
                    area3GUI.setVisible(false);
                    area1GUI.setVisible(false);
                    area2GUI.dispose();
                    battlePhaseGUI.setEnemyname(enemyName);
                    battlePhaseGUI.setEnemytype(enemyType);
                    battlePhaseGUI.setEnemyfamily(enemyFamily);
                    battlePhaseGUI.setEnemylevel(Integer.toString(enemyLevel));
                    battlePhaseGUI.setEnemycreatureimg(enemyImageFileName);

                    battlePhaseGUI.setActivecreaturefamily(inventoryGUI.getActiveFamily());
                    battlePhaseGUI.setActivecreaturename(inventoryGUI.getActiveName());
                    battlePhaseGUI.setActivecreaturetype(inventoryGUI.getActiveType());
                    battlePhaseGUI.setActivecreaturelevel(inventoryGUI.getActiveLevel());
                    battlePhaseGUI.setActivecreatureimg(inventoryGUI.getFilename());
                    allowCharacterMovement = true;
                    battlePhaseGUI.setVisible(true);
                    enemyEncounteredGUI.dispose();
                } else{
                    area2GUI.setVisible(false);
                    area1GUI.setVisible(false);
                    battlePhaseGUI.setEnemyname(enemyName);
                    battlePhaseGUI.setEnemytype(enemyType);
                    battlePhaseGUI.setEnemyfamily(enemyFamily);
                    battlePhaseGUI.setEnemylevel(Integer.toString(enemyLevel));
                    battlePhaseGUI.setEnemycreatureimg(enemyImageFileName);

                    battlePhaseGUI.setActivecreaturefamily(inventoryGUI.getActiveFamily());
                    battlePhaseGUI.setActivecreaturename(inventoryGUI.getActiveName());
                    battlePhaseGUI.setActivecreaturetype(inventoryGUI.getActiveType());
                    battlePhaseGUI.setActivecreaturelevel(inventoryGUI.getActiveLevel());
                    battlePhaseGUI.setActivecreatureimg(inventoryGUI.getFilename());
                    allowCharacterMovement = true;
                    battlePhaseGUI.setVisible(true);
                    enemyEncounteredGUI.dispose();
                    area3GUI.dispose();
                }

            }
        });
        /**
         * Listener for Moving the character to upward under area 1
         */
        area1GUI.setArrowupActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area3GUI.setVisible(false);
                area1GUI.setVisible(true);
                if (allowCharacterMovement && characterY > -15) {
                    currposX = characterX;
                    currposY = characterY - 85;
                    System.out.println("Current Y before move up: " + characterY);
                    System.out.println("Moving up to Y: " + currposY);
                    area1GUI.setChracterPosition(currposX, currposY, characterWidth, characterHeight);
                    characterY = currposY;  // Update characterY after moving
                    System.out.println("Current Y after move up: " + characterY);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemy();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel= enemy.getcLevel();
                        enemyImageFileName= enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);

                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);

                        enemyEncounteredGUI.setVisible(true);
                    }
                } else {
                    System.out.println("Cannot move up. Current Y: " + characterY);
                    if(allowCharacterMovement) {
                        oobGUI.setVisible(true);

                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for choosing area 1 GUI
         */
        exploreAreaGUI.Area1ActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exploreAreaGUI.setArea("area1");
                area2GUI.setVisible(false);
                area3GUI.setVisible(false);
            area1GUI.setVisible(true);
            exploreAreaGUI.dispose();
            characterX = 60; // Set initial X position
            characterY = -100; // Set initial Y position
            characterWidth = 240; // Set the width of the character
            characterHeight = 230; // Set the height of the character

            }
        });
        /**
         * Listener for Moving the character to DDownwards under area 1
         */
        area1GUI.setArrowdownActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area3GUI.setVisible(false);
                System.out.println("Arrow Down Clicked");
                System.out.println("CharacterY before: " + characterY);

                area1GUI.setVisible(true);

                if (allowCharacterMovement&&characterY < 325) {
                    currposX = characterX;
                    currposY = characterY + 85;
                    System.out.println("Moving down. New Y: " + currposY);
                    characterY = currposY;  // Update characterY
                    area1GUI.setChracterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemy();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);
                    }
                } else {
                    if(allowCharacterMovement) {
                        System.out.println("Already at the bottom");
                        oobGUI.setVisible(true);
                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
                System.out.println("CharacterY after: " + characterY);
            }
        });
        /**
         * Listener for back button in area 2
         */
        area2GUI.setback(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area3GUI.setVisible(false);
                area1GUI.setVisible(false);
                characterX = -50; // Set initial X position
                characterY = -80; // Set initial Y position + 80 to move downp and -80 to move up
                characterWidth = 240; // Set the width of the character
                characterHeight = 230; // Set the height of the character

                area2GUI.setCharacterPosition(characterX, characterY, characterWidth, characterHeight);

                exploreAreaGUI.setVisible(true);
                area2GUI.dispose();
                oobGUI.dispose();
            }
        });
        /**
         * Listener for selecting anotyher area when Out of Bounds GUI pops up
         */
        oobGUI.selectanotherareaActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area3GUI.setVisible(false);
                area1GUI.setVisible(false);
                exploreAreaGUI.setVisible(true);

                characterX = -50;
                characterY = -80;
                currposX = characterX;
                currposY = characterY;

                area2GUI.setCharacterPosition(characterX, characterY, characterWidth, characterHeight);

                System.out.println("After Reset - characterX: " + characterX + ", characterY: " + characterY);

                area2GUI.dispose();
                oobGUI.dispose();
            }
        });
        /**
         * Listener for Moving the character to left under Area 2
         */
        area2GUI.setArrowrleft(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area3GUI.setVisible(false);
                area1GUI.setVisible(false);
                area2GUI.setVisible(true);

                if (allowCharacterMovement&& characterX > -50 ) {
                    currposX = characterX-120;
                    currposY = characterY;
                    characterX = currposX;  // Update characterY
                    area2GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        Creatures enemy = getRandomEnemyArea2();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);

                    }
                } else {
                    if(allowCharacterMovement) {
                        area3GUI.setVisible(false);
                        area1GUI.setVisible(false);
                        oobGUI.setVisible(true);

                    }else{
                        area3GUI.setVisible(false);
                        area1GUI.setVisible(false);
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for Moving the character to right under Area2
         */
        area2GUI.setArrowright(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area3GUI.setVisible(false);
                area1GUI.setVisible(false);
                area2GUI.setVisible(true);

                if (allowCharacterMovement&& (characterX < 190 && characterY > -80)) {
                    currposX = characterX+120;
                    currposY = characterY;
                    characterX = currposX;  // Update characterY
                    area2GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        Creatures enemy = getRandomEnemyArea2();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);

                    }
                } else {
                    if(allowCharacterMovement) {
                        oobGUI.setVisible(true);
                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for Moving the character to upwards under Area 2
         */
        area2GUI.setArrowup(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area3GUI.setVisible(false);
                area1GUI.setVisible(false);
                area2GUI.setVisible(true);

                if (allowCharacterMovement&& characterY > 25 ) {
                    currposX = characterX;
                    currposY = characterY-105;
                    characterY = currposY;  // Update characterY
                    area2GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemyArea2();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);

                    }
                } else {
                    if(allowCharacterMovement) {
                        area3GUI.setVisible(false);
                        area1GUI.setVisible(false);
                        oobGUI.setVisible(true);
                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for Area2
         */
        exploreAreaGUI.Area2ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exploreAreaGUI.setArea("area2");
                area2GUI.setVisible(true);
                exploreAreaGUI.dispose();
                characterX = -50; // Set initial X position
                characterY = -80; // Set initial Y position + 80 to move downp and -80 to move up
                characterWidth = 240; // Set the width of the character
                characterHeight = 230; // Set the height of the character
                area3GUI.setVisible(false);
                area1GUI.setVisible(false);
            }

        });
        /**
         * Listener for Moving the character to downwards under Area 2
         */
        area2GUI.setArrowdown(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area3GUI.setVisible(false);
                area1GUI.setVisible(false);
                area2GUI.setVisible(true);

                if (allowCharacterMovement&& characterY < 220 ) {
                    currposX = characterX;
                    currposY = characterY+105;
                    characterY = currposY;  // Update characterY
                    area2GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemyArea2();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);
                    }
                } else {
                    if(allowCharacterMovement) {
                        oobGUI.setVisible(true);
                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for the back button under area 3
         */
        area3GUI.setback(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area1GUI.setVisible(false);
                characterX = -70; // Set initial X position
                characterY = -100; // Set initial Y position + 80 to move downp and -80 to move up
                characterWidth = 240; // Set the width of the character
                characterHeight = 230; // Set the height of the character

                area3GUI.setCharacterPosition(characterX, characterY, characterWidth, characterHeight);

                exploreAreaGUI.setVisible(true);
                area3GUI.dispose();
                oobGUI.dispose();
            }
        });
        /**
         * Listener for returning to area when Out of Bounds GUI pops up
         */
        oobGUI.returntoareaActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (exploreAreaGUI.getArea() == "area1"){

                    area2GUI.setVisible(false);
                    area3GUI.setVisible(false);
                    oobGUI.dispose();

                    area1GUI.setChracterPosition(characterX, characterY, characterWidth, characterHeight);
                    area1GUI.setVisible(true); // Show the Area1GUI

                } else if (exploreAreaGUI.getArea() == "area2") {
                    area3GUI.setVisible(false);
                    area1GUI.setVisible(false);
                    oobGUI.dispose();
                    area2GUI.setVisible(true); // Show the Area1GUI
                }else{
                    area2GUI.setVisible(false);
                    area1GUI.setVisible(false);
                    oobGUI.dispose();
                    area3GUI.setVisible(true); // Show the Area1GUI
                }
            }
        });
        /**
         * Listener for selecting an area when Out of Bounds Gui Pops up
         */
        oobGUI.selectanotherareaActionListener(new ActionListener() {
                                                   @Override
                                                   public void actionPerformed(ActionEvent e) {
                                                       area2GUI.setVisible(false);
                                                       area1GUI.setVisible(false);
                                                       exploreAreaGUI.setVisible(true);

                                                       characterX = -70;
                                                       characterY = -100;
                                                       currposX = characterX;
                                                       currposY = characterY;

                                                       area3GUI.setCharacterPosition(characterX, characterY, characterWidth, characterHeight);

                                                       System.out.println("After Reset - characterX: " + characterX + ", characterY: " + characterY);

                                                       area3GUI.dispose();
                                                       oobGUI.dispose();
                                                   }
                                               });
        /**
         * Listener for Moving the character to left under Area 3
         */
        area3GUI.setArrowrleft(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area1GUI.setVisible(false);
                area3GUI.setVisible(true);

                if (allowCharacterMovement&& characterX > -70 ) {
                    currposX = characterX-90;
                    currposY = characterY;
                    characterX = currposX;  // Update characterY
                    area3GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemyArea3();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);

                    }
                } else {
                    if(allowCharacterMovement) {
                        oobGUI.setVisible(true);
                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for Moving the character to right under ARea 3
         */
        area3GUI.setArrowright(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area1GUI.setVisible(false);
                area3GUI.setVisible(true);

                if (allowCharacterMovement&& (characterX < 190 && characterY > -100)) {
                    currposX = characterX+90;
                    currposY = characterY;
                    characterX = currposX;  // Update characterY
                    area3GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemyArea3();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);


                    }
                } else {
                    if(allowCharacterMovement) {
                        oobGUI.setVisible(true);
                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for Moving the character to upwards under area 3
         */
        area3GUI.setArrowup(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area1GUI.setVisible(false);
                area3GUI.setVisible(true);

                if (allowCharacterMovement&& characterY > 20 ) {
                    currposX = characterX;
                    currposY = characterY-90;
                    characterY = currposY;  // Update characterY
                    area3GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemyArea3();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);

                    }
                } else {
                    if(allowCharacterMovement) {
                        oobGUI.setVisible(true);
                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for Area 3
         */
        exploreAreaGUI.Area3ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exploreAreaGUI.setArea("area3");
                area2GUI.setVisible(false);
                area1GUI.setVisible(false);
                area3GUI.setVisible(true);
                exploreAreaGUI.dispose();
                characterX = -70; // Set initial X position
                characterY = -100; // Set initial Y position
                characterWidth = 240; // Set the width of the character
                characterHeight = 230; // Set the height of the character
            }

        });
        /**
         * Listener for Moving the character to down under area 3
         */
        area3GUI.setArrowdown(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area2GUI.setVisible(false);
                area1GUI.setVisible(false);
                area3GUI.setVisible(true);

                if (allowCharacterMovement&& characterY < 260 ) {
                    currposX = characterX;
                    currposY = characterY+90;
                    characterY = currposY;  // Update characterY
                    area3GUI.setCharacterPosition(currposX, currposY, characterWidth, characterHeight);

                    if (encounterEnemy()) {
                        allowCharacterMovement = false;
                        Creatures enemy = getRandomEnemyArea3();

                        enemyName = enemy.getcName();
                        enemyType = enemy.getcType();
                        enemyFamily = enemy.getcFamily();
                        enemyLevel = enemy.getcLevel();
                        enemyImageFileName = enemy.getImageFileName();
                        enemyHealth = enemy.getcHealth();

                        enemyCaughtGUI.setEnemyfamily(enemyFamily);
                        enemyCaughtGUI.setEnemytype(enemyType);
                        enemyCaughtGUI.setEnemycreatureimg(enemyImageFileName);
                        enemyCaughtGUI.setEnemyname(enemyName);
                        enemyCaughtGUI.setEnemylevel(Integer.toString(enemyLevel));

                        setEnemyHealth(enemyHealth);
                        setEnemyHealth(enemyHealth);
                        setEnemyType(enemyType);
                        setEnemyLevel(enemyLevel);
                        setEnemyFamily(enemyFamily);
                        setEnemyName(enemyName);

                        enemyEncounteredGUI.setEnemyName(enemyName);
                        enemyEncounteredGUI.setEnemytype(enemyType);
                        enemyEncounteredGUI.setEnemyfamily(enemyFamily);
                        enemyEncounteredGUI.setEnemylevel(Integer.toString(enemyLevel));
                        enemyEncounteredGUI.setEnemycreatureimg(enemyImageFileName);
                    }
                } else {
                    if(allowCharacterMovement) {
                        oobGUI.setVisible(true);

                    }else{
                        enemyEncounteredGUI.setVisible(true);
                    }
                }
                exploreAreaGUI.dispose();
            }
        });
        /**
         * Listener for back button under area 3
         */
        exploreAreaGUI.backActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI.setVisible(true);
                exploreAreaGUI.dispose();
            }
        });

    }

    /**
     * Sets the flag controlling character movement based on the provided decision.
     *
     * @param decision Boolean value to allow or disallow character movement.
     */
    public void setAllowCharacterMovement(Boolean decision) {
        allowCharacterMovement = decision;
    }

    /**
     * Retrieves the name of the encountered enemy.
     *
     * @return The name of the encountered enemy.
     */
    public String getEnemyName() {
        return enemyName;
    }

    /**
     * Retrieves the type of the encountered enemy.
     *
     * @return The type of the encountered enemy.
     */
    public String getEnemyType() {
        return enemyType;
    }

    /**
     * Retrieves the family of the encountered enemy.
     *
     * @return The family of the encountered enemy.
     */
    public String getEnemyFamily() {
        return enemyFamily;
    }

    /**
     * Retrieves the file name of the image for the encountered enemy.
     *
     * @return The file name of the image for the encountered enemy.
     */
    public String getEnemyImageFileName() {
        return enemyImageFileName;
    }

    /**
     * Retrieves the level of the encountered enemy.
     *
     * @return The level of the encountered enemy.
     */
    public int getEnemyLevel() {
        return enemyLevel;
    }

    /**
     * Retrieves the health of the encountered enemy.
     *
     * @return The health of the encountered enemy.
     */
    public int getEnemyHealth() {
        return enemyHealth;
    }

    /**
     * Sets the name of the encountered enemy.
     *
     * @param name The name to set for the encountered enemy.
     */
    public void setEnemyName(String name) {
        enemyName = name;
    }

    /**
     * Sets the type of the encountered enemy.
     *
     * @param type The type to set for the encountered enemy.
     */
    public void setEnemyType(String type) {
        enemyType = type;
    }

    /**
     * Sets the family of the encountered enemy.
     *
     * @param family The family to set for the encountered enemy.
     */
    public void setEnemyFamily(String family) {
        enemyFamily = family;
    }

    /**
     * Sets the level of the encountered enemy.
     *
     * @param level The level to set for the encountered enemy.
     */
    public void setEnemyLevel(int level) {
        enemyLevel = level;
    }

    /**
     * Sets the health of the encountered enemy.
     *
     * @param health The health to set for the encountered enemy.
     */
    public void setEnemyHealth(int health) {
        enemyHealth = health;
    }

    /**
     * Retrieves a random enemy from the general creatures list.
     *
     * @return A randomly selected enemy from the general creatures list.
     */
    public Creatures getRandomEnemy() {
        if (creaturesList.isEmpty()) {
            // Handle the case where creaturesList is empty, for example, return a default enemy
            System.out.print("hello");
        }

        Random random = new Random();
        int enemyIndex = random.nextInt(creaturesList.size());
        return creaturesList.get(enemyIndex);
    }

    /**
     * Retrieves a random enemy from the creatures list specific to Area 2.
     *
     * @return A randomly selected enemy from the creatures list specific to Area 2.
     */
    public Creatures getRandomEnemyArea2() {
        if (creaturesListArea2.isEmpty()) {
            // Handle the case where creaturesListArea2 is empty, for example, return a default enemy
            System.out.print("hello");
        }

        Random random = new Random();
        int enemyIndex = random.nextInt(creaturesListArea2.size());
        return creaturesListArea2.get(enemyIndex);
    }

    /**
     * Retrieves a random enemy from the creatures list specific to Area 3.
     *
     * @return A randomly selected enemy from the creatures list specific to Area 3.
     */
    public Creatures getRandomEnemyArea3() {
        if (creaturesListArea3.isEmpty()) {
            // Handle the case where creaturesListArea3 is empty, for example, return a default enemy
            System.out.print("hello");
        }

        Random random = new Random();
        int enemyIndex = random.nextInt(creaturesListArea3.size());
        return creaturesListArea3.get(enemyIndex);
    }

    /**
     * Determines whether the player will encounter an enemy based on a predefined probability.
     *
     * @return True if an enemy is encountered; false otherwise.
     */
    private boolean encounterEnemy() {
        Random random = new Random();
        return random.nextDouble() < 0.4; // Adjust the probability as needed
    }
}

