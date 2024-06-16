/**The given class, BattlePhaseGUI is the GUI for the battlephase when the user encountered a creature
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */

import javax.swing.*;
import java.awt.event.ActionListener;

public class BattlePhaseGUI extends javax.swing.JFrame {

    /**
     * Creates new form BattlephaseGUI
     */
    public BattlePhaseGUI() {
        initComponents();
        setSize(810, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        activecreaturedetails = new javax.swing.JPanel();
        activecreaturename = new javax.swing.JLabel();
        activecreaturefamily = new javax.swing.JLabel();
        activecreaturetype = new javax.swing.JLabel();
        activecreaturelevel = new javax.swing.JLabel();
        enemydetails = new javax.swing.JPanel();
        enemyname = new javax.swing.JLabel();
        enemyfamily = new javax.swing.JLabel();
        enemytype = new javax.swing.JLabel();
        enemylevel = new javax.swing.JLabel();
        question = new javax.swing.JPanel();
        whatwill = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        yourcreaturedo = new javax.swing.JLabel();
        healthlabel = new javax.swing.JLabel();
        battlephase = new javax.swing.JLabel();
        health2 = new javax.swing.JLabel();
        health3 = new javax.swing.JLabel();
        health5 = new javax.swing.JLabel();
        enemycreatureimg = new javax.swing.JLabel();
        health1 = new javax.swing.JLabel();
        shadow1 = new javax.swing.JLabel();
        actionpanel = new javax.swing.JPanel();
        swap = new javax.swing.JButton();
        catchcreature = new javax.swing.JButton();
        run = new javax.swing.JButton();
        enemyname5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        attacklabel = new javax.swing.JLabel();
        runlabel = new javax.swing.JLabel();
        swapcreaturelabel = new javax.swing.JLabel();
        catchlabel = new javax.swing.JLabel();
        enemycreaturelabel = new javax.swing.JLabel();
        youractivecreature = new javax.swing.JLabel();
        activecreatureimg = new javax.swing.JLabel();
        shadow2 = new javax.swing.JLabel();
        shadow3 = new javax.swing.JLabel();
        shadow4 = new javax.swing.JLabel();
        shadow5 = new javax.swing.JLabel();
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
        shadow6 = new javax.swing.JLabel();
        health4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 232, 232));
        jPanel1.setLayout(null);

        activecreaturedetails.setBackground(new java.awt.Color(246, 246, 199));

        activecreaturename.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreaturename.setText("Name: Strawander");

        activecreaturefamily.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreaturefamily.setText("Family: A");

        activecreaturetype.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreaturetype.setText("Type: Fire ");

        activecreaturelevel.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreaturelevel.setText("Level: 1");

        javax.swing.GroupLayout activecreaturedetailsLayout = new javax.swing.GroupLayout(activecreaturedetails);
        activecreaturedetails.setLayout(activecreaturedetailsLayout);
        activecreaturedetailsLayout.setHorizontalGroup(
                activecreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(activecreaturedetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(activecreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(activecreaturefamily)
                                        .addComponent(activecreaturename)
                                        .addGroup(activecreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(activecreaturelevel)
                                                .addComponent(activecreaturetype)))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        activecreaturedetailsLayout.setVerticalGroup(
                activecreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(activecreaturedetailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(activecreaturename)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activecreaturefamily)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activecreaturetype)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activecreaturelevel)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(activecreaturedetails);
        activecreaturedetails.setBounds(20, 150, 170, 100);

        enemydetails.setBackground(new java.awt.Color(246, 246, 199));

        enemyname.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemyname.setText("Name: Strawander");

        enemyfamily.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemyfamily.setText("Family: A");

        enemytype.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemytype.setText("Type: Fire ");

        enemylevel.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemylevel.setText("Level: 1");

        javax.swing.GroupLayout enemydetailsLayout = new javax.swing.GroupLayout(enemydetails);
        enemydetails.setLayout(enemydetailsLayout);
        enemydetailsLayout.setHorizontalGroup(
                enemydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enemydetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(enemydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(enemylevel)
                                        .addComponent(enemyfamily)
                                        .addComponent(enemyname)
                                        .addComponent(enemytype))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        enemydetailsLayout.setVerticalGroup(
                enemydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enemydetailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(enemyname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemyfamily)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemytype)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemylevel)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(enemydetails);
        enemydetails.setBounds(610, 150, 170, 100);

        question.setBackground(new java.awt.Color(246, 246, 199));
        question.setLayout(null);

        whatwill.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        whatwill.setText("What will your ");
        question.add(whatwill);
        whatwill.setBounds(13, 20, 180, 22);

        label2.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        label2.setText("");
        question.add(label2);
        label2.setBounds(13, 40, 180, 22);

        yourcreaturedo.setFont(new java.awt.Font("Lucida Sans", 1, 11)); // NOI18N
        yourcreaturedo.setText("creature do?");
        question.add(yourcreaturedo);
        yourcreaturedo.setBounds(13, 40, 140, 20);

        jPanel1.add(question);
        question.setBounds(30, 350, 170, 110);

        healthlabel.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        healthlabel.setText("Health: 50");
        jPanel1.add(healthlabel);
        healthlabel.setBounds(620, 110, 102, 15);

        battlephase.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        battlephase.setForeground(new java.awt.Color(0, 102, 102));
        battlephase.setText("BATTLEPHASE");
        battlephase.setName(""); // NOI18N
        battlephase.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(battlephase);
        battlephase.setBounds(10, 0, 310, 60);

        health2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        health2.setForeground(new java.awt.Color(0, 102, 102));
        health2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        health2.setText("BATTLEPHASE");
        health2.setName(""); // NOI18N
        health2.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(health2);
        health2.setBounds(590, 110, 90, 60);

        health3.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        health3.setForeground(new java.awt.Color(0, 102, 102));
        health3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        health3.setText("BATTLEPHASE");
        health3.setName(""); // NOI18N
        health3.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(health3);
        health3.setBounds(620, 110, 90, 60);

        health5.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        health5.setForeground(new java.awt.Color(0, 102, 102));
        health5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        health5.setText("BATTLEPHASE");
        health5.setName(""); // NOI18N
        health5.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(health5);
        health5.setBounds(680, 110, 90, 60);

        enemycreatureimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander(updated) (3).png"))); // NOI18N
        enemycreatureimg.setText("jLabel4");
        jPanel1.add(enemycreatureimg);
        enemycreatureimg.setBounds(400, 110, 220, 170);

        health1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        health1.setForeground(new java.awt.Color(0, 102, 102));
        health1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        health1.setText("BATTLEPHASE");
        health1.setName(""); // NOI18N
        health1.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(health1);
        health1.setBounds(560, 110, 90, 60);

        shadow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow1);
        shadow1.setBounds(410, 110, 280, 170);

        actionpanel.setBackground(new java.awt.Color(246, 246, 199));
        actionpanel.setLayout(null);

        swap.setBackground(new java.awt.Color(0, 153, 153));
        swap.setForeground(new java.awt.Color(0, 102, 102));
        swap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/swap.png"))); // NOI18N
        swap.setText("jButton1");
        swap.setFocusPainted(false);

        actionpanel.add(swap);
        swap.setBounds(170, 30, 100, 80);

        catchcreature.setBackground(new java.awt.Color(0, 153, 153));
        catchcreature.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/catch.png"))); // NOI18N
        catchcreature.setText("jButton1");
        catchcreature.setFocusPainted(false);
        actionpanel.add(catchcreature);
        catchcreature.setBounds(290, 30, 100, 80);

        run.setBackground(new java.awt.Color(0, 153, 153));
        run.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        run.setForeground(new java.awt.Color(255, 255, 255));
        run.setText("Run");
        run.setFocusPainted(false);

        actionpanel.add(run);
        run.setBounds(410, 30, 100, 80);

        enemyname5.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemyname5.setText("SWAP ACTIVE CREATURE");
        actionpanel.add(enemyname5);
        enemyname5.setBounds(630, 110, 102, 15);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attack (2).png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setFocusPainted(false);

        actionpanel.add(jButton1);
        jButton1.setBounds(40, 30, 100, 80);

        attacklabel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        attacklabel.setText("ATTACK");
        actionpanel.add(attacklabel);
        attacklabel.setBounds(60, 10, 102, 15);

        runlabel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        runlabel.setText("RUN");
        actionpanel.add(runlabel);
        runlabel.setBounds(450, 10, 40, 15);

        swapcreaturelabel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        swapcreaturelabel.setText("SWAP CREATURE");
        actionpanel.add(swapcreaturelabel);
        swapcreaturelabel.setBounds(170, 10, 102, 15);

        catchlabel.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        catchlabel.setText("CATCH");
        actionpanel.add(catchlabel);
        catchlabel.setBounds(320, 10, 40, 15);

        jPanel1.add(actionpanel);
        actionpanel.setBounds(230, 340, 540, 130);

        enemycreaturelabel.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        enemycreaturelabel.setText("Enemy Creature");
        jPanel1.add(enemycreaturelabel);
        enemycreaturelabel.setBounds(460, 280, 230, 22);

        youractivecreature.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        youractivecreature.setText("Your Active Creature");
        jPanel1.add(youractivecreature);
        youractivecreature.setBounds(170, 280, 230, 22);

        activecreatureimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander(updated) (3).png"))); // NOI18N
        activecreatureimg.setText("jLabel4");
        jPanel1.add(activecreatureimg);
        activecreatureimg.setBounds(150, 110, 220, 170);

        shadow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow2);
        shadow2.setBounds(400, 110, 320, 180);

        shadow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow3);
        shadow3.setBounds(140, 110, 290, 170);

        shadow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow4);
        shadow4.setBounds(150, 100, 290, 190);

        shadow5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow5);
        shadow5.setBounds(400, 110, 300, 170);

        Grass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        jPanel1.add(Grass3);
        Grass3.setBounds(300, 160, 797, 470);

        Grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        jPanel1.add(Grass2);
        Grass2.setBounds(-20, 160, 797, 470);

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

        shadow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shadow.png"))); // NOI18N
        jPanel1.add(shadow6);
        shadow6.setBounds(150, 120, 290, 170);

        health4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 36)); // NOI18N
        health4.setForeground(new java.awt.Color(0, 102, 102));
        health4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        health4.setText("BATTLEPHASE");
        health4.setName(""); // NOI18N
        health4.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(health4);
        health4.setBounds(650, 110, 90, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 798, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void runActionListener(ActionListener listener) {
        run.addActionListener(listener);
    }

    public void attackActionListener(ActionListener listener) {
        jButton1.addActionListener(listener);
    }


    public void swapActionListener(ActionListener listener) {
        swap.addActionListener(listener);
    }
    public void catchActionListener(ActionListener listener) {
        catchcreature.addActionListener(listener);
    }

    public void setEnemytype(String text){
        this.enemytype.setText("Type: "+ text);
    }
    public void setEnemyfamily(String text){
        this.enemyfamily.setText("Family: "+text);
    }
    public void setEnemylevel(String text){
        this.enemylevel.setText("Level: "+text);
    }
    public void setEnemyname(String text){
        this.enemyname.setText("Name: "+ text);
    }
    public void setEnemycreatureimg(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            enemycreatureimg.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setActivecreaturefamily(String text){
        this.activecreaturefamily.setText(text);
    }
    public void setActivecreaturelevel(String text){
        this.activecreaturelevel.setText(text);

    }
    public void setActivecreaturename(String text){
        this.activecreaturename.setText(text);
    }
    public void setActivecreaturetype(String text){
        this.activecreaturetype.setText(text);
    }

    public void setActivecreatureimg(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            activecreatureimg.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
    public void setLabel2(String text){
      this.label2.setText(text);
    }
    public void setWhatwill(String text){
        this.whatwill.setText(text);
    }
    public void setYourcreaturedo(String text){
        this.yourcreaturedo.setText(text);
    }
    public void setHealthlabel(String text){
        this.healthlabel.setText("Health: "+text);
    }
    public void setWhatwillForeground(int x, int y, int z){
        this.whatwill.setForeground(new java.awt.Color(x, y, z));
    }


    public void setHealth1(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            health1.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setHealth2(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            health2.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setHealth3(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            health3.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setHealth4(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            health4.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setHealth5(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            health5.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setYourcreaturedoBounds(int x, int y, int width, int height){
        yourcreaturedo.setBounds(x, y, width, height);
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
    private javax.swing.JPanel actionpanel;
    private javax.swing.JPanel activecreaturedetails;
    private javax.swing.JLabel activecreaturefamily;
    private javax.swing.JLabel activecreatureimg;
    private javax.swing.JLabel activecreaturelevel;
    private javax.swing.JLabel activecreaturename;
    private javax.swing.JLabel activecreaturetype;
    private javax.swing.JLabel attacklabel;
    private javax.swing.JLabel battlephase;
    private javax.swing.JButton catchcreature;
    private javax.swing.JLabel catchlabel;
    private javax.swing.JLabel enemycreatureimg;
    private javax.swing.JLabel enemycreaturelabel;
    private javax.swing.JPanel enemydetails;
    private javax.swing.JLabel enemyfamily;
    private javax.swing.JLabel enemylevel;
    private javax.swing.JLabel enemyname;
    private javax.swing.JLabel enemyname5;
    private javax.swing.JLabel enemytype;
    private javax.swing.JLabel health1;
    private javax.swing.JLabel health2;
    private javax.swing.JLabel health3;
    private javax.swing.JLabel health4;
    private javax.swing.JLabel health5;
    private javax.swing.JLabel healthlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel question;
    private javax.swing.JButton run;
    private javax.swing.JLabel runlabel;
    private javax.swing.JLabel shadow1;
    private javax.swing.JLabel shadow2;
    private javax.swing.JLabel shadow3;
    private javax.swing.JLabel shadow4;
    private javax.swing.JLabel shadow5;
    private javax.swing.JLabel shadow6;
    private javax.swing.JButton swap;
    private javax.swing.JLabel swapcreaturelabel;
    private javax.swing.JLabel whatwill;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel youractivecreature;
    private javax.swing.JLabel yourcreaturedo;
    // End of variables declaration
}
