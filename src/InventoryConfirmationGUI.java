/**The given class, InventoryConfiramtionGUI is for the GUI of confiriming changing creatures
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */

import javax.swing.*;
import java.awt.event.ActionListener;

public class InventoryConfirmationGUI extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmChangeCreature
     */
    public InventoryConfirmationGUI() {
        initComponents();
        setSize(420, 339);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        background = new javax.swing.JPanel();
        activecreaturedetails = new javax.swing.JPanel();
        activecreaturename = new javax.swing.JLabel();
        activecreatureFamily = new javax.swing.JLabel();
        activecreatureType = new javax.swing.JLabel();
        activecreatureLevel = new javax.swing.JLabel();
        activecreatureimg = new javax.swing.JLabel();
        no = new javax.swing.JButton();
        question = new javax.swing.JLabel();
        yes = new javax.swing.JButton();
        cloud3 = new javax.swing.JLabel();
        cloud2 = new javax.swing.JLabel();
        cloud1 = new javax.swing.JLabel();
        clouds = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(214, 232, 232));
        background.setLayout(null);

        activecreaturedetails.setBackground(new java.awt.Color(246, 246, 199));

        activecreaturename.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreaturename.setText("Name: Strawander");

        activecreatureFamily.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreatureFamily.setText("Family: A");

        activecreatureType.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreatureType.setText("Type: Fire ");

        activecreatureLevel.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreatureLevel.setText("Level: 1");

        javax.swing.GroupLayout activecreaturedetailsLayout = new javax.swing.GroupLayout(activecreaturedetails);
        activecreaturedetails.setLayout(activecreaturedetailsLayout);
        activecreaturedetailsLayout.setHorizontalGroup(
                activecreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(activecreaturedetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(activecreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(activecreatureLevel)
                                        .addComponent(activecreatureFamily)
                                        .addComponent(activecreaturename)
                                        .addComponent(activecreatureType))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        activecreaturedetailsLayout.setVerticalGroup(
                activecreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(activecreaturedetailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(activecreaturename)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activecreatureFamily)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activecreatureType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activecreatureLevel)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        background.add(activecreaturedetails);
        activecreaturedetails.setBounds(200, 80, 170, 100);

        activecreatureimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander(updated) (3).png"))); // NOI18N
        activecreatureimg.setText("jLabel4");
        background.add(activecreatureimg);
        activecreatureimg.setBounds(-10, 40, 220, 170);

        no.setBackground(new java.awt.Color(0, 102, 102));
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setText("No");
        background.add(no);
        no.setFocusPainted(false);
        no.setBounds(230, 230, 90, 30);

        question.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        question.setForeground(new java.awt.Color(0, 102, 102));
        question.setText("Are you sure you want to change your active creature?");
        question.setName(""); // NOI18N
        question.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(question);
        question.setBounds(40, 0, 340, 60);

        yes.setBackground(new java.awt.Color(0, 102, 102));
        yes.setForeground(new java.awt.Color(255, 255, 255));
        yes.setText("Yes");
        background.add(yes);
        yes.setFocusPainted(false);
        yes.setBounds(90, 230, 90, 30);

        cloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud3.setText("jLabel1");
        background.add(cloud3);
        cloud3.setBounds(-80, 50, 240, 290);

        cloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud2.setText("jLabel1");
        background.add(cloud2);
        cloud2.setBounds(0, 0, 240, 140);

        cloud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud1.setText("jLabel1");
        background.add(cloud1);
        cloud1.setBounds(220, -10, 240, 140);

        clouds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        clouds.setText("jLabel1");
        background.add(clouds);
        clouds.setBounds(250, 20, 240, 290);

        grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (8).png"))); // NOI18N
        background.add(grass1);
        grass1.setBounds(0, 130, 390, 290);

        grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (8).png"))); // NOI18N
        background.add(grass2);
        grass2.setBounds(190, 130, 390, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    public void setActivecreatureimg(String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            activecreatureimg.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }
    public void setActivename(String text){
        this.activecreaturename.setText(text);
    }
    public void setActivefamily(String text){
        this.activecreatureFamily.setText(text);
    }
    public void setActivetype(String text){
        this.activecreatureType.setText(text);
    }
    public void setActivelevel(String text){
        this.activecreatureLevel.setText(text);
    }
    public void yesInventoryListener(ActionListener listener) {
        yes.addActionListener(listener);
    }
    public void noInventoryListener(ActionListener listener) {
        no.addActionListener(listener);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel activecreatureFamily;
    private javax.swing.JLabel activecreatureLevel;
    private javax.swing.JLabel activecreatureType;
    private javax.swing.JPanel activecreaturedetails;
    private javax.swing.JLabel activecreatureimg;
    private javax.swing.JLabel activecreaturename;
    private javax.swing.JPanel background;
    private javax.swing.JLabel cloud1;
    private javax.swing.JLabel cloud2;
    private javax.swing.JLabel cloud3;
    private javax.swing.JLabel clouds;
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass2;
    private javax.swing.JButton no;
    private javax.swing.JLabel question;
    private javax.swing.JButton yes;
    // End of variables declaration
}
