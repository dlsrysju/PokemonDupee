/**The given class, MenuGUI is the GUI for the MainMenu
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import java.awt.event.ActionListener;

public class MenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MenuGUI() {
        initComponents();
        setSize(800, 535);
        setLocationRelativeTo(null);

    }

    private void initComponents() {

        background = new javax.swing.JPanel();
        mainmenu = new javax.swing.JLabel();
        selectoption = new javax.swing.JLabel();
        evolve = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        explore = new javax.swing.JButton();
        cloud8 = new javax.swing.JLabel();
        cloud7 = new javax.swing.JLabel();
        cloud6 = new javax.swing.JLabel();
        cloud5 = new javax.swing.JLabel();
        cloud4 = new javax.swing.JLabel();
        cloud3 = new javax.swing.JLabel();
        viewinventory = new javax.swing.JButton();
        cloud1 = new javax.swing.JLabel();
        cloud2 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(214, 232, 232));
        background.setPreferredSize(new java.awt.Dimension(800, 540));
        background.setLayout(null);

        mainmenu.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        mainmenu.setForeground(new java.awt.Color(0, 102, 153));
        mainmenu.setText("MAIN MENU");
        mainmenu.setName(""); // NOI18N
        mainmenu.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(mainmenu);
        mainmenu.setBounds(290, 50, 390, 60);

        selectoption.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        selectoption.setText("Select Option");
        background.add(selectoption);
        selectoption.setBounds(330, 120, 230, 22);

        evolve.setBackground(new java.awt.Color(0, 102, 102));
        evolve.setForeground(new java.awt.Color(255, 255, 255));
        evolve.setText("Evolve a Creature");
        evolve.setBorderPainted(false);
        evolve.setFocusPainted(false);

        background.add(evolve);
        evolve.setBounds(300, 280, 180, 40);

        exit.setBackground(new java.awt.Color(0, 102, 102));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("Exit");
        exit.setFocusPainted(false);

        background.add(exit);
        exit.setBounds(300, 340, 180, 40);

        explore.setBackground(new java.awt.Color(0, 102, 102));
        explore.setForeground(new java.awt.Color(255, 255, 255));
        explore.setText("Explore an Area");
        explore.setBorderPainted(false);
        explore.setFocusPainted(false);

        background.add(explore);
        explore.setBounds(300, 220, 180, 40);

        cloud8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud8.setText("jLabel1");
        background.add(cloud8);
        cloud8.setBounds(140, -60, 160, 180);

        cloud7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud7.setText("jLabel1");
        background.add(cloud7);
        cloud7.setBounds(0, -140, 150, 260);

        cloud6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud6.setText("jLabel1");
        background.add(cloud6);
        cloud6.setBounds(430, -100, 150, 180);

        cloud5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud5.setText("jLabel1");
        background.add(cloud5);
        cloud5.setBounds(590, -100, 250, 150);

        cloud4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud4.setText("jLabel1");
        background.add(cloud4);
        cloud4.setBounds(640, -30, 140, 160);

        cloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud3.setText("jLabel1");
        background.add(cloud3);
        cloud3.setBounds(630, 30, 140, 160);

        viewinventory.setBackground(new java.awt.Color(0, 102, 102));
        viewinventory.setForeground(new java.awt.Color(255, 255, 255));
        viewinventory.setText("View Inventory");
        viewinventory.setBorderPainted(false);
        viewinventory.setFocusPainted(false);

        background.add(viewinventory);
        viewinventory.setBounds(300, 160, 180, 40);

        cloud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud1.setText("jLabel1");
        background.add(cloud1);
        cloud1.setBounds(210, -150, 150, 260);

        cloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        cloud2.setText("jLabel1");
        background.add(cloud2);
        cloud2.setBounds(60, 30, 160, 180);

        grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        background.add(grass2);
        grass2.setBounds(310, 280, 820, 230);

        grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        background.add(grass1);
        grass1.setBounds(-10, 260, 820, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>


    public void evolveActionListener(ActionListener listener) {
        evolve.addActionListener(listener);
    }


    public void exitActionListener(ActionListener listener) {
        exit.addActionListener(listener);
    }


    public void exploreActionListener(ActionListener listener) {
        explore.addActionListener(listener);
    }

    public void viewinventoryActionListener(ActionListener listener) {
        viewinventory.addActionListener(listener);
    }

    // Variables declaration - do not modify
    private javax.swing.JPanel background;
    private javax.swing.JLabel cloud1;
    private javax.swing.JLabel cloud2;
    private javax.swing.JLabel cloud3;
    private javax.swing.JLabel cloud4;
    private javax.swing.JLabel cloud5;
    private javax.swing.JLabel cloud6;
    private javax.swing.JLabel cloud7;
    private javax.swing.JLabel cloud8;
    private javax.swing.JButton evolve;
    private javax.swing.JButton exit;
    private javax.swing.JButton explore;
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass2;
    private javax.swing.JLabel mainmenu;
    private javax.swing.JLabel selectoption;
    private javax.swing.JButton viewinventory;
    // End of variables declaration


}
