/**The given class, EvolveCreatureConfirmation is the GUI for confirmation on evolution
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EvolveCreatureConfirmationGUI extends javax.swing.JFrame {

    /**
     * Creates new form EvolveCreature
     */
    public EvolveCreatureConfirmationGUI() {
        initComponents();
        setSize(420, 339);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        background = new javax.swing.JPanel();
        evolvedcreaturedetails = new javax.swing.JPanel();
        activecreaturename = new javax.swing.JLabel();
        activecreatureFamily = new javax.swing.JLabel();
        activecreatureType = new javax.swing.JLabel();
        activecreatureLevel = new javax.swing.JLabel();
        returntomenu = new javax.swing.JButton();
        evolvedcreatureimg = new javax.swing.JLabel();
        creatureevolved = new javax.swing.JLabel();
        evolvecreature = new javax.swing.JButton();
        cloud3 = new javax.swing.JLabel();
        cloud2 = new javax.swing.JLabel();
        cloud1 = new javax.swing.JLabel();
        clouds = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(214, 232, 232));
        background.setLayout(null);

        evolvedcreaturedetails.setBackground(new java.awt.Color(246, 246, 199));

        activecreaturename.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreaturename.setText("");

        activecreatureFamily.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreatureFamily.setText("");

        activecreatureType.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreatureType.setText("");

        activecreatureLevel.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        activecreatureLevel.setText("");

        javax.swing.GroupLayout evolvedcreaturedetailsLayout = new javax.swing.GroupLayout(evolvedcreaturedetails);
        evolvedcreaturedetails.setLayout(evolvedcreaturedetailsLayout);
        evolvedcreaturedetailsLayout.setHorizontalGroup(
                evolvedcreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(evolvedcreaturedetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(evolvedcreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(activecreatureLevel)
                                        .addComponent(activecreatureFamily)
                                        .addComponent(activecreaturename)
                                        .addComponent(activecreatureType))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        evolvedcreaturedetailsLayout.setVerticalGroup(
                evolvedcreaturedetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(evolvedcreaturedetailsLayout.createSequentialGroup()
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

        background.add(evolvedcreaturedetails);
        evolvedcreaturedetails.setBounds(200, 80, 170, 100);

        returntomenu.setBackground(new java.awt.Color(0, 102, 102));
        returntomenu.setForeground(new java.awt.Color(255, 255, 255));
        returntomenu.setText("Return to Menu");
        returntomenu.setFont(new Font("Lucida Sans", 1, 10));
        background.add(returntomenu);
        returntomenu.setBorderPainted(false);
        returntomenu.setFocusPainted(false);
        returntomenu.setBounds(220, 230, 120, 30);

        evolvedcreatureimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander(updated) (3).png"))); // NOI18N
        evolvedcreatureimg.setText("jLabel4");
        background.add(evolvedcreatureimg);
        evolvedcreatureimg.setBounds(-10, 40, 220, 170);

        creatureevolved.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        creatureevolved.setForeground(new java.awt.Color(0, 102, 102));
        creatureevolved.setText("Creature evolved!");
        creatureevolved.setName(""); // NOI18N
        creatureevolved.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(creatureevolved);
        creatureevolved.setBounds(150, 10, 340, 60);

        evolvecreature.setBackground(new java.awt.Color(0, 102, 102));
        evolvecreature.setForeground(new java.awt.Color(255, 255, 255));
        evolvecreature.setText("Evolve Creature");
        evolvecreature.setFont(new Font("Lucida Sans", 1, 10));
        background.add(evolvecreature);
        evolvecreature.setBorderPainted(false);
        evolvecreature.setFocusPainted(false);
        evolvecreature.setBounds(60, 230, 120, 30);

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

    public void setevolvecreaturename(String text){
        this.activecreaturename.setText("Name: "+text);
    }
    public void setevolvecreaturefamily(String text){
        this.activecreatureFamily.setText("Family: "+text);
    }
    public void setevolvecreaturetype(String text){
        this.activecreatureType.setText("Type: "+text);
    }
    public void setevolvecreaturelevel(String text){
        this.activecreatureLevel.setText("Level: "+text);
    }

    public void setEvolvedcreatureimg (String filename){
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource(filename));
            evolvedcreatureimg.setIcon(icon);
        } catch (NullPointerException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    public void setReturntomenu(ActionListener listener) {
        returntomenu.addActionListener(listener);
    }
    public void setEvolvecreature(ActionListener listener) {
        evolvecreature.addActionListener(listener);
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel activecreatureFamily;
    private javax.swing.JLabel activecreatureLevel;
    private javax.swing.JLabel activecreatureType;
    private javax.swing.JLabel activecreaturename;
    private javax.swing.JPanel background;
    private javax.swing.JLabel cloud1;
    private javax.swing.JLabel cloud2;
    private javax.swing.JLabel cloud3;
    private javax.swing.JLabel clouds;
    private javax.swing.JLabel creatureevolved;
    private javax.swing.JButton evolvecreature;
    private javax.swing.JPanel evolvedcreaturedetails;
    private javax.swing.JLabel evolvedcreatureimg;
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass2;
    private javax.swing.JButton returntomenu;
    // End of variables declaration
}
