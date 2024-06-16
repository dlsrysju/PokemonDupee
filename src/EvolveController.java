import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
    /**
     * The EvolveController class manages the evolution functionality in the game.
     *
     * It includes the following attributes:
     * - {@code chooseCreatureGUI} - Graphical user interface for choosing creatures to evolve
     * - {@code errorEvolutionGUI} - Graphical user interface for handling evolution errors
     * - {@code evolveCreatureConfirmationGUI} - Graphical user interface for confirming creature evolution
     * - {@code creatures} - List to store creature objects
     * - {@code inventory} - Inventory instance for managing player's items and creatures
     * - {@code errorCreatureGUI} - Graphical user interface for handling creature-related errors
     * - {@code creature1} - Instance of the first creature involved in the evolution process
     * - {@code creature2} - Instance of the second creature involved in the evolution process
     * - {@code evolveGUI} - Graphical user interface for the evolution process
     *
     * Author: Carl Justin B De los Reyes
     */
public class EvolveController {
    private ChooseCreatureGUI chooseCreatureGUI;
    private ErrorEvolutionGUI errorEvolutionGUI;
    private EvolveCreatureConfirmationGUI evolveCreatureConfirmationGUI;
    private ArrayList<Creatures> creatures;
    private Inventory inventory;
    private ErrorCreatureGUI errorCreatureGUI;
    private Creatures creature1;
    private Creatures creature2;
    private EvolveGUI evolveGUI;

    /**
     * Constructs an instance of EvolveController.
     *
     * @param inventory      The inventory instance for managing player's items and creatures.
     * @param inventoryGUI   The graphical user interface for the inventory.
     * @param menuGUI        The graphical user interface for the game menu.
     * @param evolveGUI      The graphical user interface for the evolution process.
     * @param changeActiveGUI The graphical user interface for changing the active item in the inventory.
     */
    public EvolveController(Inventory inventory, InventoryGUI inventoryGUI, MenuGUI menuGUI, EvolveGUI evolveGUI, ChangeActiveGUI changeActiveGUI){
        this.chooseCreatureGUI = new ChooseCreatureGUI();
        this.evolveCreatureConfirmationGUI = new EvolveCreatureConfirmationGUI();
        this.creatures = new ArrayList<>();
        this.inventory = inventory;
        this.evolveGUI = evolveGUI;
        this.errorCreatureGUI = new ErrorCreatureGUI();
        this.errorEvolutionGUI = new ErrorEvolutionGUI();

        creatures.add(new Creatures("Strawmander", "Fire", "Family A", 1, "/images/charmander(updated) (3).png"));
        creatures.add(new Creatures("Chocowool", "Fire", "Family B", 1, "/images/mareep (1).png"));
        creatures.add(new Creatures("Parfwit", "Fire", "Family C", 1, "/images/parfwit.png"));
        creatures.add(new Creatures("Brownisaur", "Grass", "Family D", 1, "/images/bulbasaur.png"));
        creatures.add(new Creatures("Frubat", "Grass", "Family E", 1, "/images/frubat.png"));
        creatures.add(new Creatures("Malts", "Grass", "Family F", 1, "/images/malts.png"));
        creatures.add(new Creatures("Squirpie", "Water", "Family G", 1, "/images/squirpie.png"));
        creatures.add(new Creatures("Chocolite", "Water", "Family H", 1, "/images/chocolite.png"));
        creatures.add(new Creatures("Oshacone", "Water", "Family I", 1, "/images/water (2).png"));
        creatures.add(new Creatures("Strawleon", "Fire", "Family A", 2, "/images/straweleon.png"));
        creatures.add(new Creatures("Chocofluff", "Fire", "Family B", 2, "/images/chocofluff.png"));
        creatures.add(new Creatures("Parfure", "Fire", "Family C", 2, "/images/parfure.png"));
        creatures.add(new Creatures("Chocosaur", "Grass", "Family D", 2, "/images/chocosaur.png"));
        creatures.add(new Creatures("Golberry", "Grass", "Family E", 2, "/images/golberry.png"));
        creatures.add(new Creatures("Kirlicake", "Grass", "Family F", 2, "/images/kirlicake.png"));
        creatures.add(new Creatures("Tartortle", "Water", "Family G", 2, "/images/tartortle.png"));
        creatures.add(new Creatures("Chocolish", "Water", "Family H", 2, "/images/chocolish.png"));
        creatures.add(new Creatures("Dewice", "Water", "Family I", 2, "/images/dewice.png"));
        creatures.add(new Creatures("Strawizard", "Fire", "Family A", 3, "/images/strawizard.png"));
        creatures.add(new Creatures("Candaros", "Fire", "Family B", 3, "/images/candaros.png"));
        creatures.add(new Creatures("Parfelure", "Fire", "Family C", 3, "/images/parfelure.png"));
        creatures.add(new Creatures("Fudgusaur", "Grass", "Family D", 3, "/images/fudgusaur.png"));
        creatures.add(new Creatures("Croberry", "Grass", "Family E", 3, "/images/croberry.png"));
        creatures.add(new Creatures("Velvevoir", "Grass", "Family F", 3, "/images/velvivoire.png"));
        creatures.add(new Creatures("Piestoise", "Water", "Family G", 3, "/images/piestoise.png"));
        creatures.add(new Creatures("Ice Sundae", "Water", "Family H", 3, "/images/icesundae.png"));
        creatures.add(new Creatures("Samurcone", "Water", "Family I", 3, "/images/samurcone.png"));

        /**
         * Listener for choosing option 1 in choosing a creature
         * sets the GUIs with the new creature
         */
        this.chooseCreatureGUI.setOption1ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(evolveGUI.getButton() == "button1") {
                    evolveGUI.setFamily1(inventory.getUserCreatures().get(0).getcFamily());
                    evolveGUI.setName1(inventory.getUserCreatures().get(0).getcName());
                    evolveGUI.settype1(inventory.getUserCreatures().get(0).getcType());
                    evolveGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(0).getcLevel()));
                    evolveGUI.setSlot1img(inventory.getUserCreatures().get(0).getImageFileName());

                    evolveGUI.setVisible(true);
                    chooseCreatureGUI.dispose();

                    Creatures myCreature = new Creatures(inventory.getUserCreatures().get(0).getcName(), inventory.getUserCreatures().get(0).getcType(), inventory.getUserCreatures().get(0).getcFamily(), inventory.getUserCreatures().get(0).getcLevel(), inventory.getUserCreatures().get(0).getImageFileName());
                    setCreature1(myCreature);
                }else {
                    evolveGUI.setFamily2(inventory.getUserCreatures().get(0).getcFamily());
                    evolveGUI.setName2(inventory.getUserCreatures().get(0).getcName());
                    evolveGUI.setType2(inventory.getUserCreatures().get(0).getcType());
                    evolveGUI.setLevel12(String.valueOf(inventory.getUserCreatures().get(0).getcLevel()));
                    evolveGUI.setSlot2img(inventory.getUserCreatures().get(0).getImageFileName());

                    evolveGUI.setVisible(true);
                    chooseCreatureGUI.dispose();

                    Creatures myCreature = new Creatures(inventory.getUserCreatures().get(0).getcName(), inventory.getUserCreatures().get(0).getcType(), inventory.getUserCreatures().get(0).getcFamily(), inventory.getUserCreatures().get(0).getcLevel(), inventory.getUserCreatures().get(0).getImageFileName());
                    setCreature2(myCreature);
                }
            }
        });
        /**
         * Listener for choosing option 2 in choosing a creature
         * sets the GUIs with the new creature
         */
        this.chooseCreatureGUI.setOption2ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inventory.getUserCreatures().size() >= 2) {
                    if (evolveGUI.getButton() == "button1") {
                        evolveGUI.setFamily1(inventory.getUserCreatures().get(1).getcFamily());
                        evolveGUI.setName1(inventory.getUserCreatures().get(1).getcName());
                        evolveGUI.settype1(inventory.getUserCreatures().get(1).getcType());
                        evolveGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(1).getcLevel()));
                        evolveGUI.setSlot1img(inventory.getUserCreatures().get(1).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(1).getcName(), inventory.getUserCreatures().get(1).getcType(), inventory.getUserCreatures().get(1).getcFamily(), inventory.getUserCreatures().get(1).getcLevel(), inventory.getUserCreatures().get(1).getImageFileName());
                        setCreature1(myCreature);
                    } else {
                        evolveGUI.setFamily2(inventory.getUserCreatures().get(1).getcFamily());
                        evolveGUI.setName2(inventory.getUserCreatures().get(1).getcName());
                        evolveGUI.setType2(inventory.getUserCreatures().get(1).getcType());
                        evolveGUI.setLevel12(String.valueOf(inventory.getUserCreatures().get(1).getcLevel()));
                        evolveGUI.setSlot2img(inventory.getUserCreatures().get(1).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(1).getcName(), inventory.getUserCreatures().get(1).getcType(), inventory.getUserCreatures().get(1).getcFamily(), inventory.getUserCreatures().get(1).getcLevel(), inventory.getUserCreatures().get(1).getImageFileName());
                        setCreature2(myCreature);
                    }
                }else{
                    errorCreatureGUI.setVisible(true);
                }

            }
        });
        /**
         * Listener for choosing option 3 in choosing a creature
         * sets the GUIs with the new creature
         */
        this.chooseCreatureGUI.setOption3ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inventory.getUserCreatures().size() >= 3) {
                    if (evolveGUI.getButton() == "button1") {
                        evolveGUI.setFamily1(inventory.getUserCreatures().get(2).getcFamily());
                        evolveGUI.setName1(inventory.getUserCreatures().get(2).getcName());
                        evolveGUI.settype1(inventory.getUserCreatures().get(2).getcType());
                        evolveGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(2).getcLevel()));
                        evolveGUI.setSlot1img(inventory.getUserCreatures().get(2).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(2).getcName(), inventory.getUserCreatures().get(2).getcType(), inventory.getUserCreatures().get(2).getcFamily(), inventory.getUserCreatures().get(2).getcLevel(), inventory.getUserCreatures().get(2).getImageFileName());
                        setCreature1(myCreature);

                    } else {
                        evolveGUI.setFamily2(inventory.getUserCreatures().get(2).getcFamily());
                        evolveGUI.setName2(inventory.getUserCreatures().get(2).getcName());
                        evolveGUI.setType2(inventory.getUserCreatures().get(2).getcType());
                        evolveGUI.setLevel12(String.valueOf(inventory.getUserCreatures().get(2).getcLevel()));
                        evolveGUI.setSlot2img(inventory.getUserCreatures().get(2).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(2).getcName(), inventory.getUserCreatures().get(2).getcType(), inventory.getUserCreatures().get(2).getcFamily(), inventory.getUserCreatures().get(2).getcLevel(), inventory.getUserCreatures().get(2).getImageFileName());
                        setCreature2(myCreature);
                    }
                }else{
                    errorCreatureGUI.setVisible(true);
                }
            }
        });
        /**
         * Listener for Return to Menu under confirmation of evolved creature
         */
        this.evolveCreatureConfirmationGUI.setReturntomenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI.setVisible(true);
                evolveCreatureConfirmationGUI.dispose();
                evolveGUI.dispose();

                clearfields();
            }
        });
        /**
         * Listener for Evolve button under evolved creature
         */
        this.evolveCreatureConfirmationGUI.setEvolvecreature(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evolveCreatureConfirmationGUI.dispose();
                evolveGUI.setVisible(true);
            }
        });
        /**
         * Listener for Back button under choosing a creature for evolution
         */
        this.chooseCreatureGUI.setBackinvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chooseCreatureGUI.dispose();
                evolveGUI.setVisible(true);
            }
        });
        /**
         * Listener for choosing option 4 in choosing a creature
         * sets the GUIs with the new creature
         */
        this.chooseCreatureGUI.setOption4ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inventory.getUserCreatures().size() >= 4) {
                    if (evolveGUI.getButton() == "button1") {
                        evolveGUI.setFamily1(inventory.getUserCreatures().get(3).getcFamily());
                        evolveGUI.setName1(inventory.getUserCreatures().get(3).getcName());
                        evolveGUI.settype1(inventory.getUserCreatures().get(3).getcType());
                        evolveGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(3).getcLevel()));
                        evolveGUI.setSlot1img(inventory.getUserCreatures().get(3).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(3).getcName(), inventory.getUserCreatures().get(3).getcType(), inventory.getUserCreatures().get(3).getcFamily(), inventory.getUserCreatures().get(3).getcLevel(), inventory.getUserCreatures().get(3).getImageFileName());
                        setCreature1(myCreature);
                    } else {
                        evolveGUI.setFamily2(inventory.getUserCreatures().get(3).getcFamily());
                        evolveGUI.setName2(inventory.getUserCreatures().get(3).getcName());
                        evolveGUI.setType2(inventory.getUserCreatures().get(3).getcType());
                        evolveGUI.setLevel12(String.valueOf(inventory.getUserCreatures().get(3).getcLevel()));
                        evolveGUI.setSlot2img(inventory.getUserCreatures().get(3).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(3).getcName(), inventory.getUserCreatures().get(3).getcType(), inventory.getUserCreatures().get(3).getcFamily(), inventory.getUserCreatures().get(3).getcLevel(), inventory.getUserCreatures().get(3).getImageFileName());
                        setCreature2(myCreature);
                    }
                } else {
                    errorCreatureGUI.setVisible(true);

                }

            }
        });
        /**
         * Listener for choosing option 5 in choosing a creature
         * sets the GUIs with the new creature
         */
        this.chooseCreatureGUI.setOption5ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inventory.getUserCreatures().size() >= 5) {
                    if (evolveGUI.getButton() == "button1") {
                        evolveGUI.setFamily1(inventory.getUserCreatures().get(4).getcFamily());
                        evolveGUI.setName1(inventory.getUserCreatures().get(4).getcName());
                        evolveGUI.settype1(inventory.getUserCreatures().get(4).getcType());
                        evolveGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(4).getcLevel()));
                        evolveGUI.setSlot1img(inventory.getUserCreatures().get(4).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(4).getcName(), inventory.getUserCreatures().get(4).getcType(), inventory.getUserCreatures().get(4).getcFamily(), inventory.getUserCreatures().get(4).getcLevel(), inventory.getUserCreatures().get(4).getImageFileName());
                        setCreature1(myCreature);
                    } else {
                        evolveGUI.setFamily2(inventory.getUserCreatures().get(4).getcFamily());
                        evolveGUI.setName2(inventory.getUserCreatures().get(4).getcName());
                        evolveGUI.setType2(inventory.getUserCreatures().get(4).getcType());
                        evolveGUI.setLevel12(String.valueOf(inventory.getUserCreatures().get(4).getcLevel()));
                        evolveGUI.setSlot2img(inventory.getUserCreatures().get(4).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(4).getcName(), inventory.getUserCreatures().get(4).getcType(), inventory.getUserCreatures().get(4).getcFamily(), inventory.getUserCreatures().get(4).getcLevel(), inventory.getUserCreatures().get(4).getImageFileName());
                        setCreature2(myCreature);
                    }
                }else{
                    errorCreatureGUI.setVisible(true);
                }
            }
        });
        /**
         * Listener for choosing option 6 in choosing a creature
         * sets the GUIs with the new creature
         */
        this.chooseCreatureGUI.setOption6ActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inventory.getUserCreatures().size() >= 6) {
                    if (evolveGUI.getButton() == "button1") {
                        evolveGUI.setFamily1(inventory.getUserCreatures().get(5).getcFamily());
                        evolveGUI.setName1(inventory.getUserCreatures().get(5).getcName());
                        evolveGUI.settype1(inventory.getUserCreatures().get(5).getcType());
                        evolveGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(5).getcLevel()));
                        evolveGUI.setSlot1img(inventory.getUserCreatures().get(5).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(5).getcName(), inventory.getUserCreatures().get(5).getcType(), inventory.getUserCreatures().get(5).getcFamily(), inventory.getUserCreatures().get(5).getcLevel(), inventory.getUserCreatures().get(5).getImageFileName());
                        setCreature1(myCreature);
                    } else {
                        evolveGUI.setFamily2(inventory.getUserCreatures().get(5).getcFamily());
                        evolveGUI.setName2(inventory.getUserCreatures().get(5).getcName());
                        evolveGUI.setType2(inventory.getUserCreatures().get(5).getcType());
                        evolveGUI.setLevel12(String.valueOf(inventory.getUserCreatures().get(5).getcLevel()));
                        evolveGUI.setSlot2img(inventory.getUserCreatures().get(5).getImageFileName());

                        evolveGUI.setVisible(true);
                        chooseCreatureGUI.dispose();

                        Creatures myCreature = new Creatures(inventory.getUserCreatures().get(5).getcName(), inventory.getUserCreatures().get(5).getcType(), inventory.getUserCreatures().get(5).getcFamily(), inventory.getUserCreatures().get(5).getcLevel(), inventory.getUserCreatures().get(5).getImageFileName());
                        setCreature2(myCreature);
                    }
                } else{
                    errorCreatureGUI.setVisible(true);

                }
            }
        });
        /**
         * Listener for back burron on evolve GUI
         */
        evolveGUI.setBackbutton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evolveGUI.setVisible(false);
                menuGUI.setVisible(true);
                clearfields();
            }
        });
        /**
         * Listener for choosing creature for slot1 in evolution
         */
        evolveGUI.setChoosecreature1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evolveGUI.setChosenbutton("button1");
                System.out.print(evolveGUI.getButton());
                initialization();
                chooseCreatureGUI.setVisible(true);
                evolveGUI.setVisible(false);
            }
        });
        /**
         * Listener for Evolve button
         */
        evolveGUI.setEvolvebutton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Creatures creature1 = getCreature1();
                Creatures creature2 = getCreature2();

                Creatures evolvedCreature = getEvolvedCreature();

                if (evolvedCreature != null && evolvedCreature.getcLevel() !=3 && creature1 != null && creature2 != null) {

                    removeCreature(creature1.getcName());
                    removeCreature(creature2.getcName());
                    evolveCreatureConfirmationGUI.setVisible(true);
                    evolveCreatureConfirmationGUI.setevolvecreaturename(evolvedCreature.getcName());
                    evolveCreatureConfirmationGUI.setevolvecreaturefamily(evolvedCreature.getcFamily());
                    evolveCreatureConfirmationGUI.setevolvecreaturetype(evolvedCreature.getcType());
                    evolveCreatureConfirmationGUI.setevolvecreaturelevel(Integer.toString(evolvedCreature.getcLevel()));
                    evolveCreatureConfirmationGUI.setEvolvedcreatureimg(evolvedCreature.getImageFileName());

                    inventoryGUI.setCreaturename(evolvedCreature.getcName());
                    inventoryGUI.setCreatureType(evolvedCreature.getcType());
                    inventoryGUI.setCreatureFamily(evolvedCreature.getcFamily());
                    inventoryGUI.setCreatureLevel(Integer.toString(evolvedCreature.getcLevel()));
                    inventoryGUI.setCreatureIcon(evolvedCreature.getImageFileName());

                    inventoryGUI.setNames3creature(evolvedCreature.getcName());
                    inventoryGUI.setActiveIcon(evolvedCreature.getImageFileName());
                    inventoryGUI.setFiretypes3(evolvedCreature.getcType());
                    inventoryGUI.setLevel1s3(Integer.toString(evolvedCreature.getcLevel()));
                    inventoryGUI.setFamilya3(evolvedCreature.getcFamily());

                    inventory.addCreature(evolvedCreature);
                    initialization();
                }
                else{
                    errorEvolutionGUI.setVisible(true);
                }
                clearfields();
            }
        });
        /**
         * Listener for Return to evolving area
         */
        this.errorEvolutionGUI.setReturntoevolve(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            menuGUI.dispose();
            evolveGUI.setVisible(true);
            errorEvolutionGUI.dispose();
            }
        });
        /**
         * Listener for return to menu when error appears
         */
        errorEvolutionGUI.setReturntomenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menuGUI.setVisible(true);
                evolveCreatureConfirmationGUI.dispose();
                evolveGUI.dispose();
                errorEvolutionGUI.dispose();
                clearfields();
            }
        });
        /**
         * Listener for choosing creature for slot2 in evolution
         */
        evolveGUI.setChoosecreature2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evolveGUI.setChosenbutton("button2");
                initialization();
                chooseCreatureGUI.setVisible(true);
                evolveGUI.setVisible(false);
            }
        });
        /**
         * Listener for removing creature in slot 1
         */
        evolveGUI.setRemovecreature1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setCreature1(null);

                evolveGUI.setName1("");
                evolveGUI.setFamily1("");
                evolveGUI.setLevel11("");
                evolveGUI.settype1("");
                evolveGUI.setSlot1img("/images/empty (1).png");
            }
        });
        /**
         * Listener for removing the creature  in slot2
         */
        evolveGUI.setRemovecreature2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setCreature2(null);
                evolveGUI.setName2("");
                evolveGUI.setFamily2("");
                evolveGUI.setLevel12("");
                evolveGUI.setType2("");
                evolveGUI.setSlot2img("/images/empty (1).png");
            }
        });
        /**
         * Listener for returning to evolve area under error GUI
         */
        errorCreatureGUI.setReturntoevolve(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                chooseCreatureGUI.setVisible(true);
                errorCreatureGUI.setVisible(false);
            }
        });
        /**
         * Listener for return to menu under error creature GUI
         */
        errorCreatureGUI.setReturntomenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evolveGUI.setVisible(true);
                errorCreatureGUI.setVisible(false);
                clearfields();
            }
        });

    }
        /**
         * Retrieves the evolved form of a creature based on the selected creatures (creature1 and creature2).
         * If the evolved form is found, it returns the creature; otherwise, returns null.
         *
         * @return The evolved creature or null if not found.
         */
        public Creatures getEvolvedCreature() {
            // Iterate over the list of creatures to find the evolved form
            for (Creatures creature : creatures) {
                if (creature1 != null && creature2 != null) {
                    if (creature1.getcFamily().equals(creature.getcFamily()) &&
                            creature2.getcFamily().equals(creature.getcFamily()) &&
                            creature1.getcName().equals(creature2.getcName())) {
                        // Check if creature1 and creature2 are at level 1
                        if (creature1.getcLevel() == 1 && creature2.getcLevel() == 1) {
                            // Evolve to level 2
                            if (creature.getcLevel() == 2) {
                                return creature;
                            }
                        } else {
                            // Evolve to the next level
                            if (creature.getcLevel() == Math.max(creature1.getcLevel(), creature2.getcLevel()) + 1) {
                                return creature;
                            }
                        }
                    }
                } else {
                    // Display an error message if creatures are not selected
                    errorEvolutionGUI.setMessage2("Add Creatures First!");
                    errorEvolutionGUI.setMessage1("");
                }
            }

            // Evolved creature not found
            return null;
        }

        /**
         * Sets the first creature (creature1) for the evolution process.
         *
         * @param creature1 The first creature selected for evolution.
         */
        public void setCreature1(Creatures creature1) {
            this.creature1 = creature1;
        }

        /**
         * Retrieves the first creature (creature1) selected for the evolution process.
         *
         * @return The first creature selected for evolution.
         */
        public Creatures getCreature1() {
            return this.creature1;
        }

        /**
         * Retrieves the second creature (creature2) selected for the evolution process.
         *
         * @return The second creature selected for evolution.
         */
        public Creatures getCreature2() {
            return this.creature2;
        }

        /**
         * Sets the second creature (creature2) for the evolution process.
         *
         * @param creature2 The second creature selected for evolution.
         */
        public void setCreature2(Creatures creature2) {
            this.creature2 = creature2;
        }

        /**
         * Clears the selected creatures and associated GUI fields in the evolution process.
         */
        public void clearfields() {
            setCreature1(null);
            setCreature2(null);
            evolveGUI.setSlot2img("/images/empty (1).png");
            evolveGUI.setSlot1img("/images/empty (1).png");
            evolveGUI.setName1("");
            evolveGUI.setName2("");
            evolveGUI.settype1("");
            evolveGUI.setType2("");
            evolveGUI.setLevel12("");
            evolveGUI.setLevel11("");
            evolveGUI.setFamily2("");
            evolveGUI.setFamily1("");
        }

        /**
         * Removes a creature with the specified name from the user's creatures in the inventory.
         *
         * @param creatureNameToRemove The name of the creature to be removed.
         */
        public void removeCreature(String creatureNameToRemove) {
            ArrayList<Creatures> userCreatures = inventory.getUserCreatures();

            // Iterate through the user's creatures
            Iterator<Creatures> iterator = userCreatures.iterator();
            while (iterator.hasNext()) {
                Creatures creature = iterator.next();

                // Check if the current creature's name matches the one to be removed
                if (creature.getcName().equals(creatureNameToRemove)) {
                    // Remove the creature from the list
                    iterator.remove();
                    return; // Assuming you want to remove only one creature with the specified name
                }
            }
        }
        /**
         * Initialize all the contents for creatures.
         */
    public void initialization() {
        inventory.removeCreature(getCreature1());
        inventory.removeCreature(getCreature2());
        if (inventory.getUserCreatures().size() == 1) {
            chooseCreatureGUI.setType1(inventory.getUserCreatures().get(0).getcType());
            chooseCreatureGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(0).getcLevel()));
            chooseCreatureGUI.setName1(inventory.getUserCreatures().get(0).getcName());
            chooseCreatureGUI.setFamily1(inventory.getUserCreatures().get(0).getcType());
            chooseCreatureGUI.setSlot1img(inventory.getUserCreatures().get(0).getImageFileName());
        } else if (inventory.getUserCreatures().size() == 2) {
            chooseCreatureGUI.setType1(inventory.getUserCreatures().get(0).getcType());
            chooseCreatureGUI.setLevel11(String.valueOf(inventory.getUserCreatures().get(0).getcLevel()));
            chooseCreatureGUI.setName1(inventory.getUserCreatures().get(0).getcName());
            chooseCreatureGUI.setFamily1(inventory.getUserCreatures().get(0).getcFamily());
            chooseCreatureGUI.setSlot1img(inventory.getUserCreatures().get(0).getImageFileName());

            chooseCreatureGUI.setType2(inventory.getUserCreatures().get(1).getcType());
            chooseCreatureGUI.setLevel2(String.valueOf(inventory.getUserCreatures().get(1).getcLevel()));
            chooseCreatureGUI.setName2(inventory.getUserCreatures().get(1).getcName());
            chooseCreatureGUI.setFamily2(inventory.getUserCreatures().get(1).getcFamily());
            chooseCreatureGUI.setSlot2img(inventory.getUserCreatures().get(1).getImageFileName());
        } else if (inventory.getUserCreatures().size() == 3) {
            chooseCreatureGUI.setType3(inventory.getUserCreatures().get(2).getcType());
            chooseCreatureGUI.setLevel3(String.valueOf(inventory.getUserCreatures().get(2).getcLevel()));
            chooseCreatureGUI.setName3(inventory.getUserCreatures().get(2).getcName());
            chooseCreatureGUI.setFamily3(inventory.getUserCreatures().get(2).getcFamily());
            chooseCreatureGUI.setSlot3img(inventory.getUserCreatures().get(2).getImageFileName());
        } else if (inventory.getUserCreatures().size() == 4) {
            chooseCreatureGUI.setType4(inventory.getUserCreatures().get(3).getcType());
            chooseCreatureGUI.setLevel4(String.valueOf(inventory.getUserCreatures().get(3).getcLevel()));
            chooseCreatureGUI.setName4(inventory.getUserCreatures().get(3).getcName());
            chooseCreatureGUI.setFamily4(inventory.getUserCreatures().get(3).getcFamily());
            chooseCreatureGUI.setSlot4img(inventory.getUserCreatures().get(3).getImageFileName());
        } else if (inventory.getUserCreatures().size() == 5) {
            chooseCreatureGUI.setType5(inventory.getUserCreatures().get(4).getcType());
            chooseCreatureGUI.setLevel5(String.valueOf(inventory.getUserCreatures().get(4).getcLevel()));
            chooseCreatureGUI.setName5(inventory.getUserCreatures().get(4).getcName());
            chooseCreatureGUI.setFamily5(inventory.getUserCreatures().get(4).getcFamily());
            chooseCreatureGUI.setSlot5img(inventory.getUserCreatures().get(4).getImageFileName());
        } else if (inventory.getUserCreatures().size() == 6) {
            chooseCreatureGUI.setType6(inventory.getUserCreatures().get(5).getcType());
            chooseCreatureGUI.setLevel6(String.valueOf(inventory.getUserCreatures().get(5).getcLevel()));
            chooseCreatureGUI.setName6(inventory.getUserCreatures().get(5).getcName());
            chooseCreatureGUI.setFamily6(inventory.getUserCreatures().get(5).getcFamily());
            chooseCreatureGUI.setSlot6img(inventory.getUserCreatures().get(5).getImageFileName());
        } else {
            //display reach max
        }

    }
}
