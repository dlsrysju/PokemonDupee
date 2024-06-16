/**The given class, Area1GUI is the GUI for the Area 1 under Explore Area option in Main Menu
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */

import java.awt.*;
import java.awt.event.ActionListener;
public class Area1GUI extends javax.swing.JFrame {

    /**
     * Creates new form Area1GUI
     */
    public Area1GUI() {
        initComponents();
        setSize(812, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        areapanel = new javax.swing.JPanel();
        selectoption1 = new javax.swing.JLabel();
        size = new javax.swing.JLabel();
        tomove = new javax.swing.JLabel();
        Area1 = new javax.swing.JButton();
        arrowright = new javax.swing.JButton();
        arrowdown = new javax.swing.JButton();
        arrowup = new javax.swing.JButton();
        arrowleft = new javax.swing.JButton();
        exploring = new javax.swing.JLabel();
        chracter = new javax.swing.JLabel();
        area1 = new javax.swing.JLabel();
        backdrop = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areapanel.setLayout(null);

        selectoption1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        selectoption1.setText("Select Option");
        areapanel.add(selectoption1);
        selectoption1.setBounds(580, 150, 130, 22);

        size.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        size.setText("(Size: 5x1)");
        areapanel.add(size);
        size.setBounds(610, 120, 80, 17);

        tomove.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        tomove.setText("to move your character");
        areapanel.add(tomove);
        tomove.setBounds(560, 170, 190, 17);

        Area1.setText("Back");
        Area1.setFocusPainted(false);
        areapanel.add(Area1);
        Area1.setBounds(690, 10, 100, 30);

        arrowright.setBackground(new java.awt.Color(26, 121, 28));
        arrowright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowright.png"))); // NOI18N
        arrowright.setText("jButton2");
        areapanel.add(arrowright);
        arrowright.setBounds(690, 290, 87, 76);
        arrowright.setFocusPainted(false);

        arrowdown.setBackground(new java.awt.Color(26, 121, 28));
        arrowdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrwodown.png"))); // NOI18N
        arrowdown.setText("jButton2");
        areapanel.add(arrowdown);
        arrowdown.setBounds(600, 370, 87, 76);
        arrowdown.setFocusPainted(false);

        arrowup.setBackground(new java.awt.Color(26, 121, 28));
        arrowup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowup.png"))); // NOI18N
        arrowup.setText("jButton2");
        areapanel.add(arrowup);
        arrowup.setBounds(600, 210, 87, 76);
        arrowup.setFocusPainted(false);

        arrowleft.setBackground(new java.awt.Color(26, 121, 28));
        arrowleft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowleft.png"))); // NOI18N
        arrowleft.setText("jButton2");
        areapanel.add(arrowleft);
        arrowleft.setBounds(510, 290, 87, 76);
        arrowleft.setFocusPainted(false);

        exploring.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        exploring.setForeground(new java.awt.Color(0, 102, 51));
        exploring.setText("Exploring Area 1");
        exploring.setName(""); // NOI18N
        exploring.setPreferredSize(new java.awt.Dimension(130, 16));
        areapanel.add(exploring);
        exploring.setBounds(550, 70, 210, 60);

        chracter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tao.png"))); // NOI18N
        chracter.setText("jLabel1");
        areapanel.add(chracter);
        chracter.setBounds(60, -100, 240, 230);

        area1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/area1 (1).png"))); // NOI18N
        areapanel.add(area1);
        area1.setBounds(0, -10, 490, 520);

        backdrop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/area (1).png"))); // NOI18N
        backdrop.setText("jLabel2");
        areapanel.add(backdrop);
        backdrop.setBounds(490, 0, 310, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(areapanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(areapanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }

    public void setbackActionListener(ActionListener listener){
        Area1.addActionListener(listener);
    }
    public void setArrowrightActionListener(ActionListener listener) {
        arrowright.addActionListener(listener);
    }

    public void setArrowleftActionListener(ActionListener listener) {
        arrowleft.addActionListener(listener);
    }

    public void setArrowupActionListener(ActionListener listener) {
        arrowup.addActionListener(listener);
    }

    public void setArrowdownActionListener(ActionListener listener) {
        arrowdown.addActionListener(listener);
    }

    public void setChracterPosition(int x, int y, int width, int height){
        chracter.setBounds(x, y, width, height);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton Area1;
    private javax.swing.JLabel area1;
    private javax.swing.JPanel areapanel;
    private javax.swing.JButton arrowdown;
    private javax.swing.JButton arrowleft;
    private javax.swing.JButton arrowright;
    private javax.swing.JButton arrowup;
    private javax.swing.JLabel backdrop;
    private javax.swing.JLabel chracter;
    private javax.swing.JLabel exploring;
    private javax.swing.JLabel selectoption1;
    private javax.swing.JLabel size;
    private javax.swing.JLabel tomove;
    // End of variables declaration
}
