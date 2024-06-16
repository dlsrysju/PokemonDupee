/**The given class, Game GUI is for the GUI at the beginning
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import java.awt.event.ActionListener;

public class GameGUI extends javax.swing.JFrame {

    /**
     * Creates new form GameController
     */
    public GameGUI() {
        initComponents();
        setSize(800, 528); // Set the size of the JFrame
        setLocationRelativeTo(null);

    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        WelcometotheGame = new javax.swing.JLabel();
        SelectStarter = new javax.swing.JLabel();
        ChooseType = new javax.swing.JLabel();
        WaterType = new javax.swing.JButton();
        FireType = new javax.swing.JButton();
        GrassType = new javax.swing.JButton();
        Grass1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Grass2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(214, 239, 239));
        setPreferredSize(new java.awt.Dimension(800, 535));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(214, 232, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 528));
        jPanel1.setLayout(null);

        WelcometotheGame.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        WelcometotheGame.setForeground(new java.awt.Color(0, 102, 153));
        WelcometotheGame.setText("Welcome to the game!");
        WelcometotheGame.setName(""); // NOI18N
        WelcometotheGame.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(WelcometotheGame);
        WelcometotheGame.setBounds(210, 70, 390, 60);

        SelectStarter.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        SelectStarter.setText("Select Starter Creature");
        jPanel1.add(SelectStarter);
        SelectStarter.setBounds(303, 140, 230, 22);

        ChooseType.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        ChooseType.setText("Choose Type");
        jPanel1.add(ChooseType);
        ChooseType.setBounds(355, 180, 90, 17);

        WaterType.setBackground(new java.awt.Color(0, 102, 102));
        WaterType.setForeground(new java.awt.Color(255, 255, 255));
        WaterType.setText("Water Type");
        WaterType.setBorderPainted(false); // Remove the border
        WaterType.setFocusPainted(false);

        jPanel1.add(WaterType);
        WaterType.setBounds(333, 310, 130, 40);

        FireType.setBackground(new java.awt.Color(0, 102, 102));
        FireType.setForeground(new java.awt.Color(255, 255, 255));
        FireType.setText("Fire Type");
        FireType.setBorderPainted(false); // Remove the border
        FireType.setFocusPainted(false);

        jPanel1.add(FireType);
        FireType.setBounds(333, 210, 130, 40);

        GrassType.setBackground(new java.awt.Color(0, 102, 102));
        GrassType.setForeground(new java.awt.Color(255, 255, 255));
        GrassType.setText("Grass Type");
        GrassType.setBorderPainted(false); // Remove the border
        GrassType.setFocusPainted(false);

        jPanel1.add(GrassType);
        GrassType.setBounds(333, 260, 130, 40);

        Grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        jPanel1.add(Grass1);
        Grass1.setBounds(310, 270, 797, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 30, 160, 180);

        Grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        jPanel1.add(Grass2);
        Grass2.setBounds(-10, 150, 797, 470);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jLabel2.setText("jLabel1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-20, -160, 160, 260);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, -150, 150, 260);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, -100, 150, 180);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jLabel5.setText("jLabel1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, -100, 250, 150);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(640, -30, 140, 160);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        jLabel7.setText("jLabel1");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(630, 30, 140, 160);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>

    public void WaterTypeActionListener(ActionListener listener) {
        WaterType.addActionListener(listener);
    }

    public void GrassTypeActionListener(ActionListener listener) {
        GrassType.addActionListener(listener);
    }

    public void FireTypeActionListener(ActionListener listener) {
        FireType.addActionListener(listener);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel ChooseType;
    private javax.swing.JButton FireType;
    private javax.swing.JLabel Grass1;
    private javax.swing.JLabel Grass2;
    private javax.swing.JButton GrassType;
    private javax.swing.JLabel SelectStarter;
    private javax.swing.JButton WaterType;
    private javax.swing.JLabel WelcometotheGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration
}
