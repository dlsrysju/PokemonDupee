/**The given class, InventoryGUI is for the GUI of View Inventory on MainMneu
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InventoryGUI extends javax.swing.JFrame {

    public void setCreatureFamily(String text){
        this.familya.setText(text);
    }
    public void setCreatureType(String text){
        this.firetypes.setText(text);
    }
    public void setCreatureLevel(String text){
        this.level1s.setText(text);
    }
    public void setNames3creature(String text) {
        this.names3.setText(text);
    }
    public void setCreaturename(String text) {
        names.setText(text);
    }
    public void setFamilya3(String text){
        this.familya3.setText(text);
    }
    public void setLevel1s3 (String text){
        this.level1s3.setText(text);
    }

    public void setCreatureIcon(String filename) {
        try {
            // Assuming the image file is in the classpath
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            creatureimg.setIcon(icon);

        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setActiveIcon(String filename){
        try {
            // Assuming the image file is in the classpath
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            activecreatureimg.setIcon(icon);
            this.filename = filename; // Set the class-level variable
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    } // NOI18N

    public void setFiretypes3(String text){
        this.firetypes3.setText(text);
    }
    public String getActiveName() {
        return this.names3.getText();
    }

    public String getFilename() {
        if (filename != null) {
            return filename;
        } else {
            System.out.println("hello");
            return "No filename set";
        }
    }

    public String getActiveFamily(){
        return this.familya3.getText();
    }

    public String getActiveType(){
        return this.firetypes3.getText();
    }
    public String getActiveLevel(){
        return this.level1s3.getText();
    }

    public String getCreatureName(){
        return this.names.getText();
    }
    public String getCreatureFamily(){
        return this.familya.getText();
    }

    public String getCreatureType(){
        return this.firetypes.getText();
    }

    public String getCreatureLevel(){
        return this.level1s.getText();
    }

    public InventoryGUI(){
        initComponents();
        setSize(845, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        leftpanel = new javax.swing.JPanel();
        Inventory = new javax.swing.JLabel();
        slot6img = new javax.swing.JLabel();
        slot5img = new javax.swing.JLabel();
        slot1details = new javax.swing.JPanel();
        names = new javax.swing.JLabel();
        familya = new javax.swing.JLabel();
        firetypes = new javax.swing.JLabel();
        level1s = new javax.swing.JLabel();
        slot2details = new javax.swing.JPanel();
        slot2name = new javax.swing.JLabel();
        slot2family = new javax.swing.JLabel();
        slot2type = new javax.swing.JLabel();
        slot4level = new javax.swing.JLabel();
        slot3details = new javax.swing.JPanel();
        slot3name = new javax.swing.JLabel();
        slot3family = new javax.swing.JLabel();
        slot3type = new javax.swing.JLabel();
        slot3level = new javax.swing.JLabel();
        creatureimg = new javax.swing.JLabel();
        slot4details = new javax.swing.JPanel();
        slot4name = new javax.swing.JLabel();
        slot4family = new javax.swing.JLabel();
        slot4type = new javax.swing.JLabel();
        levelslot4 = new javax.swing.JLabel();
        slot2img = new javax.swing.JLabel();
        slot5details = new javax.swing.JPanel();
        slot5name = new javax.swing.JLabel();
        slot5family = new javax.swing.JLabel();
        slottype5 = new javax.swing.JLabel();
        slot5level = new javax.swing.JLabel();
        slot6details = new javax.swing.JPanel();
        slot6name = new javax.swing.JLabel();
        slot6family = new javax.swing.JLabel();
        slot6type = new javax.swing.JLabel();
        slot6level = new javax.swing.JLabel();
        slot3img = new javax.swing.JLabel();
        slot4img = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        strawanderdetails2 = new javax.swing.JPanel();
        names3 = new javax.swing.JLabel();
        familya3 = new javax.swing.JLabel();
        firetypes3 = new javax.swing.JLabel();
        level1s3 = new javax.swing.JLabel();
        Firetype = new javax.swing.JLabel();
        activecreatureimg = new javax.swing.JLabel();
        SelectStarter1 = new javax.swing.JLabel();
        Cloud5 = new javax.swing.JLabel();
        Cloud3 = new javax.swing.JLabel();
        Cloud2 = new javax.swing.JLabel();
        Cloud1 = new javax.swing.JLabel();
        changeactive = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Grass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftpanel.setBackground(new java.awt.Color(246, 246, 199));
        leftpanel.setLayout(null);

        Inventory.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        Inventory.setForeground(new java.awt.Color(0, 102, 102));
        Inventory.setText("INVENTORY");
        Inventory.setName(""); // NOI18N
        Inventory.setPreferredSize(new java.awt.Dimension(130, 16));
        leftpanel.add(Inventory);
        Inventory.setBounds(20, 0, 210, 60);

        slot6img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot6img.setText("jLabel1");
        leftpanel.add(slot6img);
        slot6img.setBounds(270, 320, 220, 190);

        slot5img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot5img.setText("jLabel5");
        leftpanel.add(slot5img);
        slot5img.setBounds(270, 150, 210, 240);

        slot1details.setBackground(new java.awt.Color(214, 232, 232));

        names.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        names.setText("Name: Strawander");

        familya.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        familya.setText("Family: A");

        firetypes.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        firetypes.setText("Type: Fire ");

        level1s.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level1s.setText("Level: 1");

        javax.swing.GroupLayout slot1detailsLayout = new javax.swing.GroupLayout(slot1details);
        slot1details.setLayout(slot1detailsLayout);
        slot1detailsLayout.setHorizontalGroup(
                slot1detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot1detailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(slot1detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level1s)
                                        .addComponent(familya)
                                        .addComponent(names)
                                        .addComponent(firetypes))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        slot1detailsLayout.setVerticalGroup(
                slot1detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot1detailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(names)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(familya)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firetypes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level1s)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        leftpanel.add(slot1details);
        slot1details.setBounds(150, 80, 170, 100);

        slot2details.setBackground(new java.awt.Color(214, 232, 232));

        slot2name.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot2name.setText("");

        slot2family.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot2family.setText("");

        slot2type.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot2type.setText("");

        slot4level.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot4level.setText("");

        javax.swing.GroupLayout slot2detailsLayout = new javax.swing.GroupLayout(slot2details);
        slot2details.setLayout(slot2detailsLayout);
        slot2detailsLayout.setHorizontalGroup(
                slot2detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot2detailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(slot2detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slot4level)
                                        .addComponent(slot2family)
                                        .addComponent(slot2name)
                                        .addComponent(slot2type))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        slot2detailsLayout.setVerticalGroup(
                slot2detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot2detailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(slot2name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot2family)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot2type)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(slot4level)
                                .addGap(12, 12, 12))
        );

        leftpanel.add(slot2details);
        slot2details.setBounds(150, 220, 170, 100);

        slot3details.setBackground(new java.awt.Color(214, 232, 232));

        slot3name.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot3name.setText("");

        slot3family.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot3family.setText("");

        slot3type.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot3type.setText("");

        slot3level.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot3level.setText("");

        javax.swing.GroupLayout slot3detailsLayout = new javax.swing.GroupLayout(slot3details);
        slot3details.setLayout(slot3detailsLayout);
        slot3detailsLayout.setHorizontalGroup(
                slot3detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot3detailsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(slot3detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slot3level)
                                        .addComponent(slot3type)
                                        .addComponent(slot3family)
                                        .addComponent(slot3name))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        slot3detailsLayout.setVerticalGroup(
                slot3detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot3detailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(slot3name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot3family)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot3type)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot3level)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        leftpanel.add(slot3details);
        slot3details.setBounds(150, 370, 170, 100);

        creatureimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        creatureimg.setText("jLabel4");
        leftpanel.add(creatureimg);
        creatureimg.setBounds(-50, 40, 220, 170);

        slot4details.setBackground(new java.awt.Color(214, 232, 232));

        slot4name.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot4name.setText("");

        slot4family.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot4family.setText("");

        slot4type.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot4type.setText("");

        levelslot4.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        levelslot4.setText("");

        javax.swing.GroupLayout slot4detailsLayout = new javax.swing.GroupLayout(slot4details);
        slot4details.setLayout(slot4detailsLayout);
        slot4detailsLayout.setHorizontalGroup(
                slot4detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot4detailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(slot4detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(levelslot4)
                                        .addComponent(slot4family)
                                        .addComponent(slot4name)
                                        .addComponent(slot4type))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        slot4detailsLayout.setVerticalGroup(
                slot4detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot4detailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(slot4name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot4family)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot4type)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(levelslot4)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        leftpanel.add(slot4details);
        slot4details.setBounds(470, 80, 170, 100);


        slot2img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot2img.setText("jLabel5");
        leftpanel.add(slot2img);
        slot2img.setBounds(-50, 150, 210, 240);

        slot5details.setBackground(new java.awt.Color(214, 232, 232));

        slot5name.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot5name.setText("");


        slot5family.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot5family.setText("");

        slottype5.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slottype5.setText("");

        slot5level.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot5level.setText("");

        javax.swing.GroupLayout slot5detailsLayout = new javax.swing.GroupLayout(slot5details);
        slot5details.setLayout(slot5detailsLayout);
        slot5detailsLayout.setHorizontalGroup(
                slot5detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot5detailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(slot5detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slot5level)
                                        .addComponent(slot5family)
                                        .addComponent(slot5name)
                                        .addComponent(slottype5))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        slot5detailsLayout.setVerticalGroup(
                slot5detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot5detailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(slot5name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot5family)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slottype5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(slot5level)
                                .addGap(12, 12, 12))
        );

        leftpanel.add(slot5details);
        slot5details.setBounds(470, 220, 170, 100);

        slot6details.setBackground(new java.awt.Color(214, 232, 232));

        slot6name.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot6name.setText("");

        slot6family.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot6family.setText("");

        slot6type.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot6type.setText("");

        slot6level.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slot6level.setText("");

        javax.swing.GroupLayout slot6detailsLayout = new javax.swing.GroupLayout(slot6details);
        slot6details.setLayout(slot6detailsLayout);
        slot6detailsLayout.setHorizontalGroup(
                slot6detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot6detailsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(slot6detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slot6level)
                                        .addComponent(slot6type)
                                        .addComponent(slot6family)
                                        .addComponent(slot6name))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        slot6detailsLayout.setVerticalGroup(
                slot6detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot6detailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(slot6name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot6family)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot6type)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slot6level)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        leftpanel.add(slot6details);
        slot6details.setBounds(470, 370, 170, 100);

        slot3img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot3img.setText("");
        leftpanel.add(slot3img);
        slot3img.setBounds(-50, 320, 220, 190);

        slot4img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot4img.setText("");
        leftpanel.add(slot4img);
        slot4img.setBounds(270, 40, 220, 170);

        Background.setBackground(new java.awt.Color(214, 232, 232));
        Background.setLayout(null);

        strawanderdetails2.setBackground(new java.awt.Color(214, 232, 232));

        names3.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        names3.setText("");

        familya3.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        familya3.setText("");

        firetypes3.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        firetypes3.setText("");

        level1s3.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level1s3.setText("");

        javax.swing.GroupLayout strawanderdetails2Layout = new javax.swing.GroupLayout(strawanderdetails2);
        strawanderdetails2.setLayout(strawanderdetails2Layout);
        strawanderdetails2Layout.setHorizontalGroup(
                strawanderdetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(strawanderdetails2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(strawanderdetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level1s3)
                                        .addComponent(familya3)
                                        .addComponent(names3)
                                        .addComponent(firetypes3))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        strawanderdetails2Layout.setVerticalGroup(
                strawanderdetails2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(strawanderdetails2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(names3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(familya3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firetypes3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level1s3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Background.add(strawanderdetails2);
        strawanderdetails2.setBounds(670, 200, 140, 90);

        Firetype.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Firetype.setText("Active Creature");
        Background.add(Firetype);
        Firetype.setBounds(680, 30, 230, 22);

        activecreatureimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        activecreatureimg.setText("jLabel4");
        Background.add(activecreatureimg);
        activecreatureimg.setBounds(610, 50, 220, 170);

        SelectStarter1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        SelectStarter1.setText("Select Option");
        Background.add(SelectStarter1);
        SelectStarter1.setBounds(690, 300, 240, 22);

        Cloud5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud5.setText("jLabel1");
        Background.add(Cloud5);
        Cloud5.setBounds(710, -10, 160, 180);

        Cloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud3.setText("jLabel1");
        Background.add(Cloud3);
        Cloud3.setBounds(720, -120, 140, 160);

        Cloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud2.setText("jLabel1");
        Background.add(Cloud2);
        Cloud2.setBounds(450, -100, 140, 160);

        Cloud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud1.setText("jLabel1");
        Background.add(Cloud1);
        Cloud1.setBounds(600, -60, 140, 160);

        changeactive.setBackground(new java.awt.Color(0, 102, 102));
        changeactive.setForeground(new java.awt.Color(255, 255, 255));
        changeactive.setText("Change Active Creature");
        changeactive.setFont(new Font("Lucida Sans", Font.BOLD, 10));

        changeactive.setFocusPainted(false);
        changeactive.setBorderPainted(false);

        Background.add(changeactive);
        changeactive.setBounds(660, 330, 160, 40);

        back.setForeground(new java.awt.Color(0, 9, 0));
        back.setText("Back");
        back.setFocusPainted(false);
        back.setBorderPainted(false);

        Background.add(back);
        back.setBounds(660, 380, 160, 40);

        Grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        Background.add(Grass1);
        Grass1.setBounds(440, 280, 560, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(leftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 181, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void setFamily2 (String text){
        this.slot2family.setText(text);
    }
    public void setFamily3(String text){
        this.slot3family.setText(text);
    }
    public void setFamily4 (String text){
        this.slot4family.setText(text);
    }
    public void setFamily5 (String text){
        this.slot5family.setText(text);
    }
    public void setFamily6 (String text){
        this.slot6family.setText(text);
    }

    public void setName2(String text){
        this.slot2name.setText(text);
    }
    public void setName3(String text){
        this.slot3name.setText(text);
    }
    public void setName4(String text){
        this.slot4name.setText(text);
    }
    public void setName5(String text){
        this.slot5name.setText(text);
    }
    public void setName6(String text){
        this.slot6name.setText(text);
    }
    public void setType2(String text){
        this.slot2type.setText(text);
    }
    public void setType3(String text){
        this.slot3type.setText(text);
    }
    public void setType4(String text){
        this.slot4type.setText(text);
    }
    public void setType5(String text){
        this.slottype5.setText(text);
    }
    public void setType6(String text){
        this.slot6type.setText(text);
    }
    public void setLevel2(String text){
        this.slot4level.setText(text);
    }
    public void setLevel3(String text){
        this.slot3level.setText(text);
    }
    public void setLevel4(String text){
        this.levelslot4.setText(text);
    }
    public void setLevel5(String text){
        this.slot5level.setText(text);
    }
    public void setLevel6(String text){
        this.slot6level.setText(text);
    }

    public void setSlot1name(String text){
        this.names.setText(text);
    }

    public void typeSlot1(String text){
        this.firetypes.setText(text);
    }


    public void setlevel1s(String text){
        this.level1s.setText(text);
    }

    public void setSlot2img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot2img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
    public void setSlot3img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot3img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }    public void setSlot4img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot4img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
    public void setSlot5img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot5img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
    public void setSlot6img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot6img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void changeactiveActionListener(ActionListener listener) {
        changeactive.addActionListener(listener);
    }


    public void setBackinventoryActionListener(ActionListener listener) {
        back.addActionListener(listener);
    }


    // Variables declaration - do not modify
    // Variables declaration - do not modify
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Cloud1;
    private javax.swing.JLabel Cloud2;
    private javax.swing.JLabel Cloud3;
    private javax.swing.JLabel Cloud5;
    private javax.swing.JLabel Firetype;
    private javax.swing.JLabel Grass1;
    private javax.swing.JLabel Inventory;
    private javax.swing.JLabel SelectStarter1;
    private javax.swing.JButton back;
    private javax.swing.JButton changeactive;
    private javax.swing.JLabel familya;
    private javax.swing.JLabel familya3;
    private javax.swing.JLabel firetypes;
    private javax.swing.JLabel firetypes3;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel level1s;
    private javax.swing.JLabel level1s3;
    private javax.swing.JLabel levelslot4;
    private javax.swing.JLabel names;
    private javax.swing.JLabel names3;
    private javax.swing.JPanel slot1details;
    private javax.swing.JLabel creatureimg;
    private javax.swing.JPanel slot2details;
    private javax.swing.JLabel slot2family;
    private javax.swing.JLabel slot2img;
    private javax.swing.JLabel slot2name;
    private javax.swing.JLabel slot2type;
    private javax.swing.JPanel slot3details;
    private javax.swing.JLabel slot3family;
    private javax.swing.JLabel slot3img;
    private javax.swing.JLabel slot3level;
    private javax.swing.JLabel slot3name;
    private javax.swing.JLabel slot3type;
    private javax.swing.JPanel slot4details;
    private javax.swing.JLabel slot4family;
    private javax.swing.JLabel slot4img;
    private javax.swing.JLabel slot4level;
    private javax.swing.JLabel slot4name;
    private javax.swing.JLabel slot4type;
    private javax.swing.JPanel slot5details;
    private javax.swing.JLabel slot5family;
    private javax.swing.JLabel slot5img;
    private javax.swing.JLabel slot5level;
    private javax.swing.JLabel slot5name;
    private javax.swing.JPanel slot6details;
    private javax.swing.JLabel slot6family;
    private javax.swing.JLabel slot6img;
    private javax.swing.JLabel slot6level;
    private javax.swing.JLabel slot6name;
    private javax.swing.JLabel slot6type;
    private javax.swing.JLabel slottype5;
    private javax.swing.JPanel strawanderdetails2;
    private javax.swing.JLabel activecreatureimg;
    private String filename;
    // End of variables declaration
}

// End of variables declaration
