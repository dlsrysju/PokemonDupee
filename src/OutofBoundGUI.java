/**The given class, Out of Bounds GUI is for the Out of Bounds on Explore Area
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import java.awt.event.ActionListener;

public class OutofBoundGUI extends javax.swing.JFrame {

    /**
     * Creates new form OutofBoundsGUI
     */
    public OutofBoundGUI() {
        initComponents();
        setSize(415, 235);
        setLocationRelativeTo(null);
    }


    private void initComponents() {

        background = new javax.swing.JPanel();
        returntoinventory = new javax.swing.JButton();
        returntomenu = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(214, 232, 232));
        background.setLayout(null);

        returntoinventory.setBackground(new java.awt.Color(26, 121, 28));
        returntoinventory.setForeground(new java.awt.Color(255, 255, 255));
        returntoinventory.setText("Select another Area");

        background.add(returntoinventory);
        returntoinventory.setBounds(20, 140, 160, 30);
        returntoinventory.setFocusPainted(false);

        returntomenu.setBackground(new java.awt.Color(26, 121, 28));
        returntomenu.setForeground(new java.awt.Color(255, 255, 255));
        returntomenu.setText("Return to Area");
        returntomenu.setFocusPainted(false);
        background.add(returntomenu);
        returntomenu.setBounds(220, 140, 160, 30);

        error.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        error.setForeground(new java.awt.Color(204, 0, 51));
        error.setText("Please select a valid movement!");
        error.setName(""); // NOI18N
        error.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(error);
        error.setBounds(70, 50, 430, 60);

        error1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        error1.setForeground(new java.awt.Color(204, 0, 51));
        error1.setText("Your movement is out of bounds!");
        error1.setName(""); // NOI18N
        error1.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(error1);
        error1.setBounds(70, 30, 430, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/area (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        background.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 200, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void selectanotherareaActionListener(ActionListener listener) {
        returntoinventory.addActionListener(listener);
    }
    public void returntoareaActionListener(ActionListener listener) {
        returntomenu.addActionListener(listener);
    }


    // Variables declaration - do not modify
    private javax.swing.JPanel background;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton returntoinventory;
    private javax.swing.JButton returntomenu;
    // End of variables declaration
}
