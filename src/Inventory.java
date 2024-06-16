import java.util.ArrayList;
import java.util.Scanner;

/**
 * The `Inventory` class stores the user's inventory of creatures and their active creature.
 * It allows user to add creatures to their inventory, view the creatures they own, and change their active creature.
 */
public class Inventory {
    private ArrayList<Creatures> userCreatures;
    private Creatures activeCreature;

    /**
     * Constructs an `Inventory` object with an empty list of user creatures and no active creature selected.
     */
    public Inventory() {
        userCreatures = new ArrayList<Creatures>();
        activeCreature = null;
    }

    /**
     * Allow the user to add a creature to his/her inventory.
     *
     * @param creature The creature to be added to the inventory.
     */
    public void addCreature(Creatures creature) {
        userCreatures.add(creature);
    }
    /**
     * Allow the user to remove a creature to his/her inventory.
     *
     * @param creature The creature to be removed to the inventory.
     */
    public void removeCreature(Creatures creature) {
        userCreatures.remove(creature);
        System.out.print(creature);
    }


    /**
     * Allows the user to change their active creature by selecting one from their inventory.
     */
    public void changeActiveCreature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Select a new active creature:");
        int index = 1;

        for (Creatures creature : userCreatures) {
            System.out.println(index + "    Name: " + creature.getcName());
            System.out.println("     Type: " + creature.getcType());
            System.out.println("     Family: " + creature.getcFamily());
            System.out.println("     Level: " + creature.getcLevel());
            System.out.println();
            index++;
        }

        System.out.print("Enter the number of the creature you want to set as active: ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= userCreatures.size()) {
            Creatures selectedCreature = userCreatures.get(choice - 1);
            if (selectedCreature == activeCreature) {
                System.out.println();
                System.out.println(selectedCreature.getcName() + " is already your active creature.");
            } else {
                activeCreature = selectedCreature;
                System.out.println();
                System.out.println("You have set " + activeCreature.getcName() + " as your active creature.");
            }
        } else {
            System.out.println("Invalid choice. Please select a valid creature.");
        }
    }

    /**
     * Returns the user's active creature.
     *
     * @return The active creature.
     */
    public Creatures getActiveCreature() {
        return activeCreature;
    }

    /**
     * Sets the user's active creature.
     *
     * @param creature The creature to set as the active creature.
     */
    public void setActiveCreature(Creatures creature) {
        activeCreature = creature;
    }

    public void setUserCreatures(ArrayList<Creatures> userCreatures) {
        this.userCreatures = userCreatures;
    }

    /**
     * Returns the list of creatures in the user's inventory.
     *
     * @return The list of user creatures.
     */

    public ArrayList<Creatures> getUserCreatures() {

        return userCreatures;
    }
}
