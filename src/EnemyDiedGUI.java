/**The given class, EnemyDied is the GUI when the enemy died from the battlephase
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */


import java.awt.event.ActionListener;

public class EnemyDiedGUI extends javax.swing.JFrame {

    /**
     * Creates new form enemy died
     */
    public EnemyDiedGUI() {
        initComponents();
        setSize(420, 240);
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        background = new javax.swing.JPanel();
        returntomenu = new javax.swing.JButton();
        returntoarea = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        cloud3 = new javax.swing.JLabel();
        cloud2 = new javax.swing.JLabel();
        clouds = new javax.swing.JLabel();
        clouds1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(214, 232, 232));
        background.setLayout(null);

        returntomenu.setBackground(new java.awt.Color(0, 102, 102));
        returntomenu.setForeground(new java.awt.Color(255, 255, 255));
        returntomenu.setText("Return to menu");

        background.add(returntomenu);
        returntomenu.setBounds(40, 140, 140, 30);

        returntoarea.setBackground(new java.awt.Color(0, 102, 102));
        returntoarea.setForeground(new java.awt.Color(255, 255, 255));
        returntoarea.setText("Return to Area");

        background.add(returntoarea);
        returntoarea.setBounds(220, 140, 140, 30);

        message.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        message.setForeground(new java.awt.Color(204, 0, 51));
        message.setText("Oh no! Enemy fainted!");
        message.setName(""); // NOI18N
        message.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(message);
        message.setBounds(100, 40, 430, 60);

        cloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud3.setText("jLabel1");
        background.add(cloud3);
        cloud3.setBounds(220, 0, 240, 100);

        cloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud2.setText("jLabel1");
        background.add(cloud2);
        cloud2.setBounds(0, 0, 240, 140);

        clouds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        clouds.setText("jLabel1");
        background.add(clouds);
        clouds.setBounds(-10, 50, 150, 290);

        clouds1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        clouds1.setText("jLabel1");
        background.add(clouds1);
        clouds1.setBounds(260, 50, 240, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>


    public void setReturntoarea (ActionListener listener){
        this.returntoarea.addActionListener(listener);
    }

    public void setReturntomenu (ActionListener listener){
        this.returntomenu.addActionListener(listener);
    }
    // Variables declaration - do not modify
    private javax.swing.JPanel background;
    private javax.swing.JLabel cloud2;
    private javax.swing.JLabel cloud3;
    private javax.swing.JLabel clouds;
    private javax.swing.JLabel clouds1;
    private javax.swing.JLabel message;
    private javax.swing.JButton returntoarea;
    private javax.swing.JButton returntomenu;
    // End of variables declaration
}

