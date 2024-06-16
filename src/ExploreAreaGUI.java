/**The given class, ExploreAreaGUI is the GUI for exploring area
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import java.awt.event.ActionListener;

public class ExploreAreaGUI extends javax.swing.JFrame {

    /**
     * Creates new form SelectArea
     */
    public ExploreAreaGUI() {
        initComponents();
        setSize(800, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        selectoption = new javax.swing.JLabel();
        Area1 = new javax.swing.JButton();
        Area3 = new javax.swing.JButton();
        Area4 = new javax.swing.JButton();
        Area2 = new javax.swing.JButton();
        inventory = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        selectoption.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        selectoption.setText("Select Option");
        jPanel1.add(selectoption);
        selectoption.setBounds(330, 180, 230, 22);

        Area1.setForeground(new java.awt.Color(102, 102, 102));
        Area1.setText("Back");
        Area1.setFocusPainted(false);

        jPanel1.add(Area1);
        Area1.setBounds(310, 390, 160, 40);

        Area3.setBackground(new java.awt.Color(51, 102, 0));
        Area3.setForeground(new java.awt.Color(255, 255, 255));
        Area3.setText("Area 3 (4 X 4)");
        Area3.setFocusPainted(false);

        jPanel1.add(Area3);
        Area3.setBounds(310, 330, 160, 40);

        Area4.setBackground(new java.awt.Color(51, 102, 0));
        Area4.setForeground(new java.awt.Color(255, 255, 255));
        Area4.setText("Area 2 (3 X 3)");
        Area4.setFocusPainted(false);

        jPanel1.add(Area4);
        Area4.setBounds(310, 270, 160, 40);

        Area2.setBackground(new java.awt.Color(51, 102, 0));
        Area2.setForeground(new java.awt.Color(255, 255, 255));
        Area2.setText("Area 1 (5 X 1)");
        Area2.setFocusPainted(false);

        jPanel1.add(Area2);
        Area2.setBounds(310, 210, 160, 40);

        inventory.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        inventory.setForeground(new java.awt.Color(0, 102, 51));
        inventory.setText("Exploring an Area");
        inventory.setName(""); // NOI18N
        inventory.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel1.add(inventory);
        inventory.setBounds(250, 100, 370, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/area (1).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 800, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 500, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    public void backActionListener(ActionListener listener) {
        Area1.addActionListener(listener);
    }

    public void Area2ActionListener(ActionListener listener) {
        Area4.addActionListener(listener);
    }

    public void Area3ActionListener(ActionListener listener) {
        Area3.addActionListener(listener);
    }

    public void Area1ActionListener(ActionListener listener) {
        Area2.addActionListener(listener);
    }

    public void setArea(String Area){
        area=Area;
    }
    public String getArea(){
        return area;
    }



    // Variables declaration - do not modify
    private String area;
    private javax.swing.JButton Area1;
    private javax.swing.JButton Area2;
    private javax.swing.JButton Area3;
    private javax.swing.JButton Area4;
    private javax.swing.JLabel inventory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel selectoption;
    // End of variables declaration
}
