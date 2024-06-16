/**The given class,EvolveGUIn is the GUI for Evolution option in Main Menu
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import javax.swing.*;
import java.awt.event.ActionListener;

public class EvolveGUI extends javax.swing.JFrame {

    /**
     * Creates new form EvolveCreatureGUI
     */
    public EvolveGUI() {
        initComponents();
        setSize(820, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Slot1Details = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        family1 = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        level11 = new javax.swing.JLabel();
        Slot2Details = new javax.swing.JPanel();
        name2 = new javax.swing.JLabel();
        family2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        level12 = new javax.swing.JLabel();
        evolving = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        creature2label = new javax.swing.JLabel();
        removecreature2 = new javax.swing.JButton();
        evolvebutton = new javax.swing.JButton();
        choosecreature2 = new javax.swing.JButton();
        removecreature1 = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        choosecreature1 = new javax.swing.JButton();
        creature1label = new javax.swing.JLabel();
        slot2img = new javax.swing.JLabel();
        slot1img = new javax.swing.JLabel();
        evlovecreaturelabel = new javax.swing.JLabel();
        shadow1 = new javax.swing.JLabel();
        shadow2 = new javax.swing.JLabel();
        shadow3 = new javax.swing.JLabel();
        shadow4 = new javax.swing.JLabel();
        shadow5 = new javax.swing.JLabel();
        shadow6 = new javax.swing.JLabel();
        connection = new javax.swing.JLabel();
        Grass3 = new javax.swing.JLabel();
        Grass2 = new javax.swing.JLabel();
        Cloud4 = new javax.swing.JLabel();
        Cloud5 = new javax.swing.JLabel();
        Cloud6 = new javax.swing.JLabel();
        Cloud7 = new javax.swing.JLabel();
        Cloud8 = new javax.swing.JLabel();
        Cloud9 = new javax.swing.JLabel();
        Cloud10 = new javax.swing.JLabel();
        Cloud11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 232, 232));
        jPanel1.setLayout(null);

        Slot1Details.setBackground(new java.awt.Color(246, 246, 199));

        name1.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name1.setText("Name:");

        family1.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family1.setText("Family:");

        type1.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        type1.setText("Type:");

        level11.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level11.setText("Level;");

        javax.swing.GroupLayout Slot1DetailsLayout = new javax.swing.GroupLayout(Slot1Details);
        Slot1Details.setLayout(Slot1DetailsLayout);
        Slot1DetailsLayout.setHorizontalGroup(
                Slot1DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Slot1DetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(Slot1DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(family1)
                                        .addComponent(name1)
                                        .addComponent(level11)
                                        .addComponent(type1))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        Slot1DetailsLayout.setVerticalGroup(
                Slot1DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Slot1DetailsLayout.createSequentialGroup()
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

        jPanel1.add(Slot1Details);
        Slot1Details.setBounds(40, 330, 170, 100);

        Slot2Details.setBackground(new java.awt.Color(246, 246, 199));

        name2.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        name2.setText("Name:");

        family2.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        family2.setText("Family:");

        type2.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        type2.setText("Type:");

        level12.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level12.setText("Level:");

        javax.swing.GroupLayout Slot2DetailsLayout = new javax.swing.GroupLayout(Slot2Details);
        Slot2Details.setLayout(Slot2DetailsLayout);
        Slot2DetailsLayout.setHorizontalGroup(
                Slot2DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Slot2DetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(Slot2DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level12)
                                        .addComponent(family2)
                                        .addComponent(name2)
                                        .addComponent(type2))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        Slot2DetailsLayout.setVerticalGroup(
                Slot2DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Slot2DetailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(name2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(family2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(type2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level12)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(Slot2Details);
        Slot2Details.setBounds(600, 330, 170, 100);

        evolving.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        evolving.setForeground(new java.awt.Color(0, 102, 102));
        evolving.setText("Evolving Creature.....");
        evolving.setName(""); // NOI18N
        evolving.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(evolving);
        evolving.setBounds(10, 20, 280, 60);

        note.setFont(new java.awt.Font("Lucida Sans", 0, 8)); // NOI18N
        note.setText("Note: Both creatures must be the same");
        jPanel1.add(note);
        note.setBounds(330, 190, 190, 17);

        creature2label.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        creature2label.setText("Creature 2 Details");
        jPanel1.add(creature2label);
        creature2label.setBounds(630, 310, 130, 20);

        removecreature2.setBackground(new java.awt.Color(0, 102, 102));
        removecreature2.setForeground(new java.awt.Color(255, 255, 255));
        removecreature2.setText("Remove Creature");
        jPanel1.add(removecreature2);
        removecreature2.setBounds(620, 440, 140, 30);

        evolvebutton.setBackground(new java.awt.Color(0, 102, 102));
        evolvebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/evolutionbutton (2).png"))); // NOI18N
        evolvebutton.setText("jButton1");
        evolvebutton.setBorderPainted(false);
        evolvebutton.setFocusPainted(false);

        jPanel1.add(evolvebutton);
        evolvebutton.setBounds(360, 280, 90, 90);
        choosecreature2.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        choosecreature2.setBackground(new java.awt.Color(0, 102, 102));
        choosecreature2.setForeground(new java.awt.Color(255, 255, 255));
        choosecreature2.setText("Choose Creature");
        jPanel1.add(choosecreature2);
        choosecreature2.setBounds(510, 100, 120, 30);
        choosecreature2.setBorderPainted(false);
        choosecreature2.setFocusPainted(false);

        removecreature1.setBackground(new java.awt.Color(0, 102, 102));
        removecreature1.setForeground(new java.awt.Color(255, 255, 255));
        removecreature1.setText("Remove Creature");
        jPanel1.add(removecreature1);
        removecreature1.setBounds(50, 440, 140, 30);
        removecreature1.setBorderPainted(false);
        removecreature1.setFocusPainted(false);
        backbutton.setText("Back");
        jPanel1.add(backbutton);
        backbutton.setBounds(670, 10, 120, 30);
        backbutton.setBorderPainted(false);
        backbutton.setFocusPainted(false);
        choosecreature1.setFont(new java.awt.Font("Lucida Sans", 0, 10)); // NOI18N
        choosecreature1.setBackground(new java.awt.Color(0, 102, 102));
        choosecreature1.setForeground(new java.awt.Color(255, 255, 255));
        choosecreature1.setText("Choose Creature");
        jPanel1.add(choosecreature1);
        choosecreature1.setBorderPainted(false);
        choosecreature1.setFocusPainted(false);
        choosecreature1.setBounds(180, 100, 120, 30);

        creature1label.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        creature1label.setText("Creature 1 Details");
        jPanel1.add(creature1label);
        creature1label.setBounds(70, 310, 130, 20);

        slot2img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empty (1).png"))); // NOI18N
        slot2img.setText("jLabel4");
        jPanel1.add(slot2img);
        slot2img.setBounds(450, 120, 220, 170);

        slot1img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empty (1).png"))); // NOI18N
        slot1img.setText("jLabel4");
        jPanel1.add(slot1img);
        slot1img.setBounds(120, 120, 220, 170);

        evlovecreaturelabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        evlovecreaturelabel.setForeground(new java.awt.Color(0, 102, 102));
        evlovecreaturelabel.setText("EVOLVE YOUR CREATURE");
        evlovecreaturelabel.setName(""); // NOI18N
        evlovecreaturelabel.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(evlovecreaturelabel);
        evlovecreaturelabel.setBounds(10, 0, 440, 60);

        shadow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow1);
        shadow1.setBounds(450, 110, 250, 170);

        shadow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow2);
        shadow2.setBounds(440, 120, 310, 180);

        shadow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow3);
        shadow3.setBounds(130, 120, 290, 170);

        shadow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow4);
        shadow4.setBounds(140, 110, 290, 190);

        shadow5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow5);
        shadow5.setBounds(470, 130, 280, 170);

        shadow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow6);
        shadow6.setBounds(120, 120, 290, 170);

        connection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/connection.png"))); // NOI18N
        jPanel1.add(connection);
        connection.setBounds(220, 110, 570, 360);

        Grass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        jPanel1.add(Grass3);
        Grass3.setBounds(300, 160, 797, 470);

        Grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        jPanel1.add(Grass2);
        Grass2.setBounds(-10, 210, 797, 370);

        Cloud4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud4.setText("jLabel1");
        jPanel1.add(Cloud4);
        Cloud4.setBounds(150, -80, 160, 180);

        Cloud5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud5.setText("jLabel1");
        jPanel1.add(Cloud5);
        Cloud5.setBounds(680, -160, 160, 260);

        Cloud6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud6.setText("jLabel1");
        jPanel1.add(Cloud6);
        Cloud6.setBounds(580, -70, 160, 180);

        Cloud7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jPanel1.add(Cloud7);
        Cloud7.setBounds(450, -140, 310, 260);

        Cloud8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud8.setText("jLabel1");
        jPanel1.add(Cloud8);
        Cloud8.setBounds(370, -140, 160, 260);

        Cloud9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud9.setText("jLabel1");
        jPanel1.add(Cloud9);
        Cloud9.setBounds(0, -140, 160, 260);

        Cloud10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud10.setText("jLabel1");
        jPanel1.add(Cloud10);
        Cloud10.setBounds(260, -60, 160, 180);

        Cloud11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud11.setText("jLabel1");
        jPanel1.add(Cloud11);
        Cloud11.setBounds(190, -130, 160, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void setBackbutton(ActionListener listener){
        backbutton.addActionListener(listener);
    }
    public void setEvolvebutton(ActionListener listener){
        evolvebutton.addActionListener(listener);
    }
    public void setRemovecreature1(ActionListener listener){
        removecreature1.addActionListener(listener);
    }
    public void setRemovecreature2(ActionListener listener){
        removecreature2.addActionListener(listener);
    }
    public void setChoosecreature1(ActionListener listener){
        choosecreature1.addActionListener(listener);
    }
    public void setChoosecreature2(ActionListener listener){
        choosecreature2.addActionListener(listener);
    }
    public void setName1(String text){
        this.name1.setText("Name: "+text);
    }
    public void setName2(String text){
        this.name2.setText("Name: "+text);
    }
    public void setFamily1(String text){
        this.family1.setText("Family: "+text);
    }
    public void setFamily2(String text){
        this.family2.setText("Family: "+text);
    }
    public void setLevel11(String text){
        this.level11.setText("Level: "+text);
    }
    public void setLevel12(String text){
        this.level12.setText("Level: "+text);
    }
    public void settype1(String text){
        this.type1.setText("Type "+text);
    }
    public void setType2(String text){
        this.type2.setText("Type: "+text);
    }

    public void setSlot1img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot1img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setChosenbutton(String button){
        this.button = button;
    }

    public String getButton(){
        return button;
    }

    public void setSlot2img(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            slot2img.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Cloud10;
    private javax.swing.JLabel Cloud11;
    private javax.swing.JLabel Cloud4;
    private javax.swing.JLabel Cloud5;
    private javax.swing.JLabel Cloud6;
    private javax.swing.JLabel Cloud7;
    private javax.swing.JLabel Cloud8;
    private javax.swing.JLabel Cloud9;
    private javax.swing.JLabel Grass2;
    private javax.swing.JLabel Grass3;
    private javax.swing.JPanel Slot1Details;
    private javax.swing.JPanel Slot2Details;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton choosecreature1;
    private javax.swing.JButton choosecreature2;
    private javax.swing.JLabel connection;
    private javax.swing.JLabel creature1label;
    private javax.swing.JLabel creature2label;
    private javax.swing.JLabel evlovecreaturelabel;
    private javax.swing.JButton evolvebutton;
    private javax.swing.JLabel evolving;
    private javax.swing.JLabel family1;
    private javax.swing.JLabel family2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level11;
    private javax.swing.JLabel level12;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel note;
    private javax.swing.JButton removecreature1;
    private javax.swing.JButton removecreature2;
    private javax.swing.JLabel shadow1;
    private javax.swing.JLabel shadow2;
    private javax.swing.JLabel shadow3;
    private javax.swing.JLabel shadow4;
    private javax.swing.JLabel shadow5;
    private javax.swing.JLabel shadow6;
    private javax.swing.JLabel slot1img;
    private javax.swing.JLabel slot2img;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    private String button;
    // End of variables declaration
}
