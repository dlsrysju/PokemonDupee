import java.util.ArrayList;

/**
 * The `Creatures` class contains the details of creatures in a game. Each creature has a name, type, family, level, and health.
 * This class provides methods to access and manipulate creature properties.
 */
public class Creatures {
    private String cName;
    private String cType;
    private String cFamily;
    private int cLevel;
    private int cHealth;
    private String imageFileName;
    ArrayList<Creatures> creaturesList = new ArrayList<>();

    /**
     * Constructs a list of default creatures when an instance of the `Creatures` class is created.
     * Contains the creatures that will use for the game
     */
    public Creatures() {
        // Initialize a list of default creatures
        creaturesList.add(new Creatures("Strawmander", "Fire", "Family A", 1, "/images/charmander(updated) (3).png"));
        creaturesList.add(new Creatures("Chocowool", "Fire", "Family B", 1, "/images/mareep (1).png"));
        creaturesList.add(new Creatures("Parfwit", "Fire", "Family C", 1, "/images/parfwit.png"));
        creaturesList.add(new Creatures("Brownisaur", "Grass", "Family D", 1, "/images/bulbasaur.png"));
        creaturesList.add(new Creatures("Frubat", "Grass", "Family E", 1, "/images/frubat.png"));
        creaturesList.add(new Creatures("Malts", "Grass", "Family F", 1, "/images/malts.png"));
        creaturesList.add(new Creatures("Squirpie", "Water", "Family H", 1, "/images/squirpie.png"));
        creaturesList.add(new Creatures("Chocolite", "Water", "Family I", 1, "/images/chocolite.png"));
        creaturesList.add(new Creatures("Oshacone", "Water", "Family J", 1, "/images/water (2).png"));
    }

    /**
     * Constructs a new creature with the given attributes.
     *
     * @param cName   The name of the creature.
     * @param cType   The type of the creature (e.g., Fire, Grass, Water).
     * @param cFamily The family to which the creature belongs.
     * @param cLevel  The level of the creature.
     */
    public Creatures(String cName, String cType, String cFamily, int cLevel, String filename) {
        this.cName = cName;
        this.cType = cType;
        this.cFamily = cFamily;
        this.cLevel = cLevel;
        this.imageFileName = filename;
        this.cHealth = 50; // Default health value for a new creature.
    }

    /**
     * Gets the name of the creature.
     *
     * @return The name of the creature.
     */
    public String getcName() {
        return cName;
    }

    /**
     * Gets the type of the creature.
     *
     * @return The type of the creature.
     */
    public String getcType() {
        return cType;
    }

    /**
     * Gets the family of the creature.
     *
     * @return The family of the creature.
     */
    public String getcFamily() {
        return cFamily;
    }

    /**
     * Gets the level of the creature.
     *
     * @return The level of the creature.
     */
    public int getcLevel() {
        return cLevel;
    }

    /**
     * Gets the health of the creature.
     *
     * @return The health of the creature.
     */
    public int getcHealth() {
        return cHealth;
    }
    /**
     * Gets the health of the creature.
     *
     * @return Image File anme of the creature
     */
    public String getImageFileName() {
        return imageFileName;
    }
}
