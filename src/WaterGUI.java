/**The given class, WaterGUI is the GUI for choosing water type creatures
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */

import java.awt.event.ActionListener;

/**
 *
 * @author Justin Delos Reyes
 */
public class WaterGUI extends javax.swing.JFrame {

    /**
     * Creates new form WaterGUI
     */
    public WaterGUI() {
        initComponents();
        setSize(800, 550);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        leftpanel = new javax.swing.JPanel();
        WATER = new javax.swing.JLabel();
        squirpiedetails = new javax.swing.JPanel();
        names = new javax.swing.JLabel();
        familyb = new javax.swing.JLabel();
        watertypes = new javax.swing.JLabel();
        level1s = new javax.swing.JLabel();
        chocolitedetails = new javax.swing.JPanel();
        namec = new javax.swing.JLabel();
        familyh = new javax.swing.JLabel();
        watertypec = new javax.swing.JLabel();
        levelc = new javax.swing.JLabel();
        oshaconedetails = new javax.swing.JPanel();
        nameo = new javax.swing.JLabel();
        famili = new javax.swing.JLabel();
        watertypeo = new javax.swing.JLabel();
        level10 = new javax.swing.JLabel();
        oschaconeimg = new javax.swing.JLabel();
        squirpieimg = new javax.swing.JLabel();
        chocolireimg = new javax.swing.JLabel();
        waterlogo1 = new javax.swing.JLabel();
        waterlogo = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        WaterType = new javax.swing.JLabel();
        SelectStarter2 = new javax.swing.JLabel();
        Cloud5 = new javax.swing.JLabel();
        Cloud4 = new javax.swing.JLabel();
        Cloud3 = new javax.swing.JLabel();
        Cloud2 = new javax.swing.JLabel();
        Cloud1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        squirpie = new javax.swing.JButton();
        chocolite = new javax.swing.JButton();
        oshacone = new javax.swing.JButton();
        Grass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftpanel.setBackground(new java.awt.Color(246, 246, 199));
        leftpanel.setLayout(null);

        WATER.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        WATER.setForeground(new java.awt.Color(51, 0, 153));
        WATER.setText("WATER TYPE");
        WATER.setName(""); // NOI18N
        WATER.setPreferredSize(new java.awt.Dimension(130, 16));
        leftpanel.add(WATER);
        WATER.setBounds(90, 0, 390, 60);

        squirpiedetails.setBackground(new java.awt.Color(214, 232, 232));

        names.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        names.setText("Name: Squirpie");

        familyb.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        familyb.setText("Family: G");

        watertypes.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        watertypes.setText("Type: Water ");

        level1s.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level1s.setText("Level: 1");

        javax.swing.GroupLayout squirpiedetailsLayout = new javax.swing.GroupLayout(squirpiedetails);
        squirpiedetails.setLayout(squirpiedetailsLayout);
        squirpiedetailsLayout.setHorizontalGroup(
                squirpiedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(squirpiedetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(squirpiedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level1s)
                                        .addComponent(familyb)
                                        .addComponent(names)
                                        .addComponent(watertypes))
                                .addContainerGap(59, Short.MAX_VALUE))
        );
        squirpiedetailsLayout.setVerticalGroup(
                squirpiedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(squirpiedetailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(names)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(familyb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(watertypes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level1s)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        leftpanel.add(squirpiedetails);
        squirpiedetails.setBounds(200, 80, 170, 100);

        chocolitedetails.setBackground(new java.awt.Color(214, 232, 232));

        namec.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        namec.setText("Name: Chocolite");

        familyh.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        familyh.setText("Family: H");

        watertypec.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        watertypec.setText("Type: Water");

        levelc.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        levelc.setText("Level: 1");

        javax.swing.GroupLayout chocolitedetailsLayout = new javax.swing.GroupLayout(chocolitedetails);
        chocolitedetails.setLayout(chocolitedetailsLayout);
        chocolitedetailsLayout.setHorizontalGroup(
                chocolitedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(chocolitedetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(chocolitedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(levelc)
                                        .addComponent(familyh)
                                        .addComponent(namec)
                                        .addComponent(watertypec))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        chocolitedetailsLayout.setVerticalGroup(
                chocolitedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(chocolitedetailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(namec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(familyh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(watertypec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(levelc)
                                .addGap(12, 12, 12))
        );

        leftpanel.add(chocolitedetails);
        chocolitedetails.setBounds(200, 230, 170, 100);

        oshaconedetails.setBackground(new java.awt.Color(214, 232, 232));

        nameo.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        nameo.setText("Name: Oshacone");

        famili.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        famili.setText("Family: I");

        watertypeo.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        watertypeo.setText("Type: Water");

        level10.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level10.setText("Level: 1");

        javax.swing.GroupLayout oshaconedetailsLayout = new javax.swing.GroupLayout(oshaconedetails);
        oshaconedetails.setLayout(oshaconedetailsLayout);
        oshaconedetailsLayout.setHorizontalGroup(
                oshaconedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(oshaconedetailsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(oshaconedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level10)
                                        .addComponent(watertypeo)
                                        .addComponent(famili)
                                        .addComponent(nameo))
                                .addContainerGap(60, Short.MAX_VALUE))
        );
        oshaconedetailsLayout.setVerticalGroup(
                oshaconedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(oshaconedetailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(nameo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(famili)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(watertypeo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level10)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        leftpanel.add(oshaconedetails);
        oshaconedetails.setBounds(200, 370, 170, 100);

        oschaconeimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/water (2).png"))); // NOI18N
        oschaconeimg.setText("jLabel3");
        leftpanel.add(oschaconeimg);
        oschaconeimg.setBounds(-20, 270, 230, 290);

        squirpieimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/squirpie.png"))); // NOI18N
        squirpieimg.setText("jLabel1");
        leftpanel.add(squirpieimg);
        squirpieimg.setBounds(-20, 20, 220, 210);

        chocolireimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chocolite.png"))); // NOI18N
        chocolireimg.setText("jLabel1");
        leftpanel.add(chocolireimg);
        chocolireimg.setBounds(-20, 190, 210, 160);

        waterlogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/water (1).png"))); // NOI18N
        leftpanel.add(waterlogo1);
        waterlogo1.setBounds(160, -150, 416, 375);

        waterlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/water (1).png"))); // NOI18N
        leftpanel.add(waterlogo);
        waterlogo.setBounds(-130, 250, 416, 375);

        Background.setBackground(new java.awt.Color(214, 232, 232));
        Background.setLayout(null);

        WaterType.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        WaterType.setText("WATER Type");
        Background.add(WaterType);
        WaterType.setBounds(560, 130, 230, 22);

        SelectStarter2.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        SelectStarter2.setText("Select Starter Creature");
        Background.add(SelectStarter2);
        SelectStarter2.setBounds(500, 80, 230, 22);

        Cloud5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud5.setText("jLabel1");
        Background.add(Cloud5);
        Cloud5.setBounds(690, -110, 160, 180);

        Cloud4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud4.setText("jLabel1");
        Background.add(Cloud4);
        Cloud4.setBounds(370, -140, 160, 260);

        Cloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud3.setText("jLabel1");
        Background.add(Cloud3);
        Cloud3.setBounds(600, -30, 140, 160);

        Cloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud2.setText("jLabel1");
        Background.add(Cloud2);
        Cloud2.setBounds(450, -100, 140, 160);

        Cloud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud1.setText("jLabel1");
        Background.add(Cloud1);
        Cloud1.setBounds(660, -50, 140, 160);

        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(102, 102, 102));
        back.setText("Back");
        back.setBorderPainted(false);
        back.setFocusPainted(false);
 
        Background.add(back);
        back.setBounds(530, 350, 130, 40);

        squirpie.setBackground(new java.awt.Color(0, 102, 102));
        squirpie.setForeground(new java.awt.Color(255, 255, 255));
        squirpie.setText("Squirpie");
        squirpie.setBorderPainted(false);
        squirpie.setFocusPainted(false);

        Background.add(squirpie);
        squirpie.setBounds(530, 170, 130, 40);

        chocolite.setBackground(new java.awt.Color(0, 102, 102));
        chocolite.setForeground(new java.awt.Color(255, 255, 255));
        chocolite.setText("Chocolite");
        chocolite.setBorderPainted(false);
        chocolite.setFocusPainted(false);

        Background.add(chocolite);
        chocolite.setBounds(530, 220, 130, 40);

        oshacone.setBackground(new java.awt.Color(0, 102, 102));
        oshacone.setForeground(new java.awt.Color(255, 255, 255));
        oshacone.setText("Oshacone");
        oshacone.setBorderPainted(false);
        oshacone.setFocusPainted(false);

        Background.add(oshacone);
        oshacone.setBounds(530, 270, 130, 40);

        Grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        Background.add(Grass1);
        Grass1.setBounds(370, 280, 797, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(leftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 387, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
        );

        pack();
    }

    public void backActionListener(ActionListener listener) {
        back.addActionListener(listener);
    }


    public void squirpieActionListener(ActionListener listener) {
        squirpie.addActionListener(listener);
    }

    public void chocoliteActionListener(ActionListener listener) {
        chocolite.addActionListener(listener);
    }

    public void oshaconeActionListener(ActionListener listener) {
        oshacone.addActionListener(listener);
    }
    // Variables declaration - do not modify
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Cloud1;
    private javax.swing.JLabel Cloud2;
    private javax.swing.JLabel Cloud3;
    private javax.swing.JLabel Cloud4;
    private javax.swing.JLabel Cloud5;
    private javax.swing.JLabel Grass1;
    private javax.swing.JLabel SelectStarter2;
    private javax.swing.JLabel WATER;
    private javax.swing.JLabel WaterType;
    private javax.swing.JButton back;
    private javax.swing.JLabel chocolireimg;
    private javax.swing.JButton chocolite;
    private javax.swing.JPanel chocolitedetails;
    private javax.swing.JLabel famili;
    private javax.swing.JLabel familyb;
    private javax.swing.JLabel familyh;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel level10;
    private javax.swing.JLabel level1s;
    private javax.swing.JLabel levelc;
    private javax.swing.JLabel namec;
    private javax.swing.JLabel nameo;
    private javax.swing.JLabel names;
    private javax.swing.JLabel oschaconeimg;
    private javax.swing.JButton oshacone;
    private javax.swing.JPanel oshaconedetails;
    private javax.swing.JButton squirpie;
    private javax.swing.JPanel squirpiedetails;
    private javax.swing.JLabel squirpieimg;
    private javax.swing.JLabel waterlogo;
    private javax.swing.JLabel waterlogo1;
    private javax.swing.JLabel watertypec;
    private javax.swing.JLabel watertypeo;
    private javax.swing.JLabel watertypes;
    // End of variables declaration
}
