/**The given class, ErrorEvolution is the GUI when actions an error appears in evolution
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */

import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * @author Justin Delos Reyes
 */
public class ErrorEvolutionGUI extends javax.swing.JFrame {

    /**
     * Creates new form ErrorEvolutionGUI
     */
    public ErrorEvolutionGUI() {
        initComponents();
        setSize(420, 240);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        background = new javax.swing.JPanel();
        returntomenu = new javax.swing.JButton();
        returntoevolve = new javax.swing.JButton();
        message1 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        cloud3 = new javax.swing.JLabel();
        cloud2 = new javax.swing.JLabel();
        clouds = new javax.swing.JLabel();
        clouds1 = new javax.swing.JLabel();
        cloud4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(214, 232, 232));
        background.setLayout(null);

        returntomenu.setBackground(new java.awt.Color(0, 102, 102));
        returntomenu.setForeground(new java.awt.Color(255, 255, 255));
        returntomenu.setText("Return to menu");
        returntomenu.setFont(new Font("Lucida Sans", 1, 10));
        background.add(returntomenu);
        returntomenu.setBounds(40, 140, 140, 30);
        returntomenu.setFocusPainted(false);
        returntomenu.setBorderPainted(false);

        returntoevolve.setBackground(new java.awt.Color(0, 102, 102));
        returntoevolve.setForeground(new java.awt.Color(255, 255, 255));
        returntoevolve.setText("Return to Evolve");
        returntoevolve.setFont(new Font("Lucida Sans", 1, 10));
        background.add(returntoevolve);
        returntoevolve.setBounds(220, 140, 140, 30);
        returntoevolve.setFocusPainted(false);
        returntoevolve.setBorderPainted(false);

        message1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        message1.setForeground(new java.awt.Color(204, 0, 51));
        message1.setText("Both creatures are not compatible");
        message1.setName(""); // NOI18N
        message1.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(message1);
        message1.setBounds(50, 50, 430, 60);

        message3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        message3.setForeground(new java.awt.Color(204, 0, 51));
        message3.setText("EVOLUTION FAILED!");
        message3.setName(""); // NOI18N
        message3.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(message3);
        message3.setBounds(110, 10, 430, 60);

        message2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        message2.setForeground(new java.awt.Color(204, 0, 51));
        message2.setText("with each other!");
        message2.setName(""); // NOI18N
        message2.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(message2);
        message2.setBounds(120, 70, 430, 60);

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

        cloud4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud4.setText("jLabel1");
        background.add(cloud4);
        cloud4.setBounds(0, 0, 240, 140);

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


    public void setMessage1(String text){
        message1.setText(text);
    }
    public void setMessage2(String text){
        message2.setText(text);
    }
    public void setMessage3(String text){
        message3.setText(text);
    }

    public void setReturntomenu(ActionListener listener) {
        returntomenu.addActionListener(listener);
    }

    public void setReturntoevolve(ActionListener listener) {
        returntoevolve.addActionListener(listener);
    }
    // Variables declaration - do not modify
    private javax.swing.JPanel background;
    private javax.swing.JLabel cloud2;
    private javax.swing.JLabel cloud3;
    private javax.swing.JLabel cloud4;
    private javax.swing.JLabel clouds;
    private javax.swing.JLabel clouds1;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JLabel message3;
    private javax.swing.JButton returntoevolve;
    private javax.swing.JButton returntomenu;
    // End of variables declaration
}
