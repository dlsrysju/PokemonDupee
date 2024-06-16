/**The given class, InevntoryChangeActiveGUI is the GUI for changing active creature in inventory
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import javax.swing.*;
import java.awt.event.ActionListener;

public class InventoryChangeActiveGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChangeCreature
     */
    public InventoryChangeActiveGUI() {
        initComponents();
        setSize(835, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        leftpanel = new javax.swing.JPanel();
        option3 = new javax.swing.JButton();
        option2 = new javax.swing.JButton();
        backinvent = new javax.swing.JButton();
        option6 = new javax.swing.JButton();
        option1 = new javax.swing.JButton();
        option4 = new javax.swing.JButton();
        option5 = new javax.swing.JButton();
        changeactive = new javax.swing.JLabel();
        slot6img = new javax.swing.JLabel();
        slot5img = new javax.swing.JLabel();
        slot1details = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        family1 = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        level11 = new javax.swing.JLabel();
        slot2details = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        level12 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        family2 = new javax.swing.JLabel();
        slot3details = new javax.swing.JPanel();
        name3 = new javax.swing.JLabel();
        family3 = new javax.swing.JLabel();
        type4 = new javax.swing.JLabel();
        level13 = new javax.swing.JLabel();
        slot1img = new javax.swing.JLabel();
        slot4details = new javax.swing.JPanel();
        name4 = new javax.swing.JLabel();
        family4 = new javax.swing.JLabel();
        slottype4 = new javax.swing.JLabel();
        level14 = new javax.swing.JLabel();
        slot2img = new javax.swing.JLabel();
        slot5details = new javax.swing.JPanel();
        name5 = new javax.swing.JLabel();
        family5 = new javax.swing.JLabel();
        type5 = new javax.swing.JLabel();
        level15 = new javax.swing.JLabel();
        slot6details = new javax.swing.JPanel();
        name6 = new javax.swing.JLabel();
        family6 = new javax.swing.JLabel();
        type6 = new javax.swing.JLabel();
        level16 = new javax.swing.JLabel();
        slot3img = new javax.swing.JLabel();
        slot4img = new javax.swing.JLabel();
        inventorylabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftpanel.setBackground(new java.awt.Color(246, 246, 199));
        leftpanel.setLayout(null);

        option3.setBackground(new java.awt.Color(0, 102, 102));
        option3.setForeground(new java.awt.Color(255, 255, 255));
        option3.setText("3");
        leftpanel.add(option3);
        option3.setBounds(20, 390, 50, 50);
        option3.setFocusPainted(false);

        option2.setBackground(new java.awt.Color(0, 102, 102));
        option2.setForeground(new java.awt.Color(255, 255, 255));
        option2.setText("2");
        option2.setFocusPainted(false);
        leftpanel.add(option2);
        option2.setBounds(20, 250, 50, 50);

        backinvent.setBackground(new java.awt.Color(0, 102, 102));
        backinvent.setForeground(new java.awt.Color(255, 255, 255));
        backinvent.setText("Back");
        leftpanel.add(backinvent);
        backinvent.setFocusPainted(false);
        backinvent.setBounds(690, 10, 110, 40);

        option6.setBackground(new java.awt.Color(0, 102, 102));
        option6.setForeground(new java.awt.Color(255, 255, 255));
        option6.setText("6");
        option6.setFocusPainted(false);
        leftpanel.add(option6);
        option6.setBounds(430, 390, 50, 50);

        option1.setBackground(new java.awt.Color(0, 102, 102));
        option1.setForeground(new java.awt.Color(255, 255, 255));
        option1.setText("1");
        leftpanel.add(option1);
        option1.setFocusPainted(false);
        option1.setBounds(20, 100, 50, 50);

        option4.setBackground(new java.awt.Color(0, 102, 102));
        option4.setForeground(new java.awt.Color(255, 255, 255));
        option4.setText("4");
        leftpanel.add(option4);
        option4.setFocusPainted(false);
        option4.setBounds(430, 100, 50, 50);

        option5.setBackground(new java.awt.Color(0, 102, 102));
        option5.setForeground(new java.awt.Color(255, 255, 255));
        option5.setText("5");
        leftpanel.add(option5);
        option5.setFocusPainted(false);
        option5.setBounds(430, 250, 50, 50);

        changeactive.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        changeactive.setForeground(new java.awt.Color(0, 102, 102));
        changeactive.setText("Changing Active Creature......");
        changeactive.setName(""); // NOI18N
        changeactive.setPreferredSize(new java.awt.Dimension(130, 16));
        leftpanel.add(changeactive);
        changeactive.setBounds(20, 10, 280, 60);

        slot6img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot6img.setText("jLabel1");
        leftpanel.add(slot6img);
        slot6img.setBounds(430, 320, 220, 190);

        slot5img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot5img.setText("jLabel5");
        leftpanel.add(slot5img);
        slot5img.setBounds(430, 150, 210, 240);

        slot1details.setBackground(new java.awt.Color(214, 232, 232));

        name1.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name1.setText("");

        family1.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family1.setText("");

        type1.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        type1.setText("");

        level11.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level11.setText("");

        javax.swing.GroupLayout slot1detailsLayout = new javax.swing.GroupLayout(slot1details);
        slot1details.setLayout(slot1detailsLayout);
        slot1detailsLayout.setHorizontalGroup(
                slot1detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot1detailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(slot1detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level11)
                                        .addComponent(family1)
                                        .addComponent(name1)
                                        .addComponent(type1))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        slot1detailsLayout.setVerticalGroup(
                slot1detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot1detailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(name1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(family1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level11)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        leftpanel.add(slot1details);
        slot1details.setBounds(240, 80, 170, 100);

        slot2details.setBackground(new java.awt.Color(214, 232, 232));

        name2.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name2.setText("");

        level12.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level12.setText("");

        type2.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        type2.setText("");

        family2.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family2.setText("");

        javax.swing.GroupLayout slot2detailsLayout = new javax.swing.GroupLayout(slot2details);
        slot2details.setLayout(slot2detailsLayout);
        slot2detailsLayout.setHorizontalGroup(
                slot2detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot2detailsLayout.createSequentialGroup()
                                .addGroup(slot2detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(slot2detailsLayout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(level12))
                                        .addGroup(slot2detailsLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(slot2detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(family2)
                                                        .addComponent(name2)
                                                        .addComponent(type2))))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        slot2detailsLayout.setVerticalGroup(
                slot2detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot2detailsLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(name2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(family2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level12)
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        leftpanel.add(slot2details);
        slot2details.setBounds(240, 220, 170, 106);

        slot3details.setBackground(new java.awt.Color(214, 232, 232));

        name3.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name3.setText("");

        family3.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family3.setText("");

        type4.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        type4.setText("");

        level13.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level13.setText("");

        javax.swing.GroupLayout slot3detailsLayout = new javax.swing.GroupLayout(slot3details);
        slot3details.setLayout(slot3detailsLayout);
        slot3detailsLayout.setHorizontalGroup(
                slot3detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot3detailsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(slot3detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level13)
                                        .addComponent(type4)
                                        .addComponent(family3)
                                        .addComponent(name3))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        slot3detailsLayout.setVerticalGroup(
                slot3detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot3detailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(name3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(family3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level13)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        leftpanel.add(slot3details);
        slot3details.setBounds(240, 360, 170, 100);

        slot1img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot1img.setText("jLabel4");
        leftpanel.add(slot1img);
        slot1img.setBounds(30, 40, 220, 170);

        slot4details.setBackground(new java.awt.Color(214, 232, 232));

        name4.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name4.setText("");

        family4.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family4.setText("");

        slottype4.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        slottype4.setText("");

        level14.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level14.setText("");

        javax.swing.GroupLayout slot4detailsLayout = new javax.swing.GroupLayout(slot4details);
        slot4details.setLayout(slot4detailsLayout);
        slot4detailsLayout.setHorizontalGroup(
                slot4detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot4detailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(slot4detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level14)
                                        .addComponent(family4)
                                        .addComponent(name4)
                                        .addComponent(slottype4))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        slot4detailsLayout.setVerticalGroup(
                slot4detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot4detailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(name4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(family4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slottype4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level14)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        leftpanel.add(slot4details);
        slot4details.setBounds(640, 80, 170, 100);

        slot2img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot2img.setText("jLabel5");
        leftpanel.add(slot2img);
        slot2img.setBounds(30, 150, 210, 240);

        slot5details.setBackground(new java.awt.Color(214, 232, 232));

        name5.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name5.setText("");

        family5.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family5.setText("");

        type5.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        type5.setText("");

        level15.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level15.setText("");

        javax.swing.GroupLayout slot5detailsLayout = new javax.swing.GroupLayout(slot5details);
        slot5details.setLayout(slot5detailsLayout);
        slot5detailsLayout.setHorizontalGroup(
                slot5detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot5detailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(slot5detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level15)
                                        .addComponent(family5)
                                        .addComponent(name5)
                                        .addComponent(type5))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        slot5detailsLayout.setVerticalGroup(
                slot5detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot5detailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(name5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(family5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(level15)
                                .addGap(12, 12, 12))
        );

        leftpanel.add(slot5details);
        slot5details.setBounds(640, 220, 170, 100);

        slot6details.setBackground(new java.awt.Color(214, 232, 232));

        name6.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name6.setText("");

        family6.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family6.setText("");

        type6.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        type6.setText("");

        level16.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level16.setText("");

        javax.swing.GroupLayout slot6detailsLayout = new javax.swing.GroupLayout(slot6details);
        slot6details.setLayout(slot6detailsLayout);
        slot6detailsLayout.setHorizontalGroup(
                slot6detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot6detailsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(slot6detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level16)
                                        .addComponent(type6)
                                        .addComponent(family6)
                                        .addComponent(name6))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        slot6detailsLayout.setVerticalGroup(
                slot6detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(slot6detailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(name6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(family6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level16)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        leftpanel.add(slot6details);
        slot6details.setBounds(640, 370, 170, 100);

        slot3img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot3img.setText("jLabel1");
        leftpanel.add(slot3img);
        slot3img.setBounds(30, 320, 220, 190);

        slot4img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadowcircle.png"))); // NOI18N
        slot4img.setText("jLabel4");
        leftpanel.add(slot4img);
        slot4img.setBounds(430, 40, 220, 170);

        inventorylabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        inventorylabel.setForeground(new java.awt.Color(0, 102, 102));
        inventorylabel.setText("INVENTORY");
        inventorylabel.setName(""); // NOI18N
        inventorylabel.setPreferredSize(new java.awt.Dimension(130, 16));
        leftpanel.add(inventorylabel);
        inventorylabel.setBounds(20, -10, 210, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }


    public void setFamily1 (String text){
        this.family1.setText(text);
    }
    public void setFamily2 (String text){
        this.family2.setText(text);
    }
    public void setFamily3(String text){
        this.family3.setText(text);
    }
    public void setFamily4 (String text){
        this.family4.setText(text);
    }
    public void setFamily5 (String text){
        this.family5.setText(text);
    }
    public void setFamily6 (String text){
        this.family6.setText(text);
    }

    public void setName1(String text){
        this.name1.setText(text);
    }
    public void setName2(String text){
        this.name2.setText(text);
    }
    public void setName3(String text){
        this.name3.setText(text);
    }
    public void setName4(String text){
        this.name4.setText(text);
    }
    public void setName5(String text){
        this.name5.setText(text);
    }
    public void setName6(String text){
        this.name6.setText(text);
    }

    public void setType1(String text){
        this.type1.setText(text);
    }
    public void setType2(String text){
        this.type2.setText(text);
    }
    public void setType3(String text){
        this.type4.setText(text);
    }
    public void setType4(String text){
        this.slottype4.setText(text);
    }
    public void setType5(String text){
        this.type5.setText(text);
    }
    public void setType6(String text){
        this.type6.setText(text);
    }
    public void setLevel1(String text){
        this.level11.setText(text);
    }
    public void setLevel2(String text){
        this.level12.setText(text);
    }
    public void setLevel3(String text){
        this.level13.setText(text);
    }
    public void setLevel4(String text){
        this.level14.setText(text);
    }
    public void setLevel5(String text){
        this.level15.setText(text);
    }
    public void setLevel6(String text){
        this.level16.setText(text);
    }

    public void setSlot1img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot1img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
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

    public void setOption1ActionListener(ActionListener listener) {
        option1.addActionListener(listener);
    }
    public void setOption2ActionListener(ActionListener listener) {
        option2.addActionListener(listener);
    }
    public void setOption3ActionListener(ActionListener listener) {
        option3.addActionListener(listener);
    }
    public void setOption4ActionListener(ActionListener listener) {
        option4.addActionListener(listener);
    }
    public void setOption5ActionListener(ActionListener listener) {
        option5.addActionListener(listener);
    }
    public void setOption6ActionListener(ActionListener listener) {
        option6.addActionListener(listener);
    }

    public void setback(ActionListener listener){
        backinvent.addActionListener(listener);
    }
    // Variables declaration - do not modify
    private javax.swing.JButton backinvent;
    private javax.swing.JLabel changeactive;
    private javax.swing.JLabel family1;
    private javax.swing.JLabel family2;
    private javax.swing.JLabel family3;
    private javax.swing.JLabel family4;
    private javax.swing.JLabel family5;
    private javax.swing.JLabel family6;
    private javax.swing.JLabel inventorylabel;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel level11;
    private javax.swing.JLabel level12;
    private javax.swing.JLabel level13;
    private javax.swing.JLabel level14;
    private javax.swing.JLabel level15;
    private javax.swing.JLabel level16;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel name4;
    private javax.swing.JLabel name5;
    private javax.swing.JLabel name6;
    private javax.swing.JButton option1;
    private javax.swing.JButton option2;
    private javax.swing.JButton option3;
    private javax.swing.JButton option4;
    private javax.swing.JButton option5;
    private javax.swing.JButton option6;
    private javax.swing.JPanel slot1details;
    private javax.swing.JLabel slot1img;
    private javax.swing.JPanel slot2details;
    private javax.swing.JLabel slot2img;
    private javax.swing.JPanel slot3details;
    private javax.swing.JLabel slot3img;
    private javax.swing.JPanel slot4details;
    private javax.swing.JLabel slot4img;
    private javax.swing.JPanel slot5details;
    private javax.swing.JLabel slot5img;
    private javax.swing.JPanel slot6details;
    private javax.swing.JLabel slot6img;
    private javax.swing.JLabel slottype4;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type4;
    private javax.swing.JLabel type5;
    private javax.swing.JLabel type6;
    // End of variables declaration
}
