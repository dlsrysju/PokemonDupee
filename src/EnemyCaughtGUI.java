/**The given class, EnemyCaughtGUI is the GUI when enemy where caught
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

public class EnemyCaughtGUI extends javax.swing.JFrame {

    /**
     * Creates new form CaughtCreatureGUI
     */
    public EnemyCaughtGUI() {
        initComponents();
        setSize(420, 339);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enemydetails = new javax.swing.JPanel();
        enemyname = new javax.swing.JLabel();
        enemyfamily = new javax.swing.JLabel();
        enemytype = new javax.swing.JLabel();
        enemylevel = new javax.swing.JLabel();
        enemycreatureimg = new javax.swing.JLabel();
        returntoarea = new javax.swing.JButton();
        view = new javax.swing.JButton();
        enemyencountered = new javax.swing.JLabel();
        cloud3 = new javax.swing.JLabel();
        cloud2 = new javax.swing.JLabel();
        cloud1 = new javax.swing.JLabel();
        clouds = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(214, 232, 232));
        background.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pokeballsmall.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        background.add(jLabel1);
        jLabel1.setBounds(-50, 100, 190, 150);

        enemydetails.setBackground(new java.awt.Color(246, 246, 199));

        enemyname.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemyname.setText("Name: Strawander");

        enemyfamily.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemyfamily.setText("Family: A");

        enemytype.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemytype.setText("Type: Fire ");

        enemylevel.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        enemylevel.setText("Level: 1");

        javax.swing.GroupLayout enemydetailsLayout = new javax.swing.GroupLayout(enemydetails);
        enemydetails.setLayout(enemydetailsLayout);
        enemydetailsLayout.setHorizontalGroup(
                enemydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enemydetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(enemydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(enemylevel)
                                        .addComponent(enemyfamily)
                                        .addComponent(enemyname)
                                        .addComponent(enemytype))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        enemydetailsLayout.setVerticalGroup(
                enemydetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(enemydetailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(enemyname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemyfamily)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemytype)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enemylevel)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        background.add(enemydetails);
        enemydetails.setBounds(200, 80, 170, 100);

        enemycreatureimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander(updated) (3).png"))); // NOI18N
        enemycreatureimg.setText("jLabel4");
        background.add(enemycreatureimg);
        enemycreatureimg.setBounds(-10, 40, 220, 170);

        returntoarea.setBackground(new java.awt.Color(0, 102, 102));
        returntoarea.setForeground(new java.awt.Color(255, 255, 255));
        returntoarea.setText("Return to Area");
        background.add(returntoarea);
        returntoarea.setBounds(230, 220, 120, 40);
        returntoarea.setFocusPainted(false);

        view.setBackground(new java.awt.Color(0, 102, 102));
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setFont(new Font("Lucida Sans", Font.BOLD, 10));
        view.setText("View Inventory");
        background.add(view);
        view.setBounds(60, 220, 120, 40);
        view.setFocusPainted(false);

        enemyencountered.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        enemyencountered.setForeground(new java.awt.Color(0, 153, 0));
        enemyencountered.setText("Enemy Caught!");
        enemyencountered.setName(""); // NOI18N
        enemyencountered.setPreferredSize(new java.awt.Dimension(130, 16));
        background.add(enemyencountered);
        enemyencountered.setBounds(110, 0, 310, 60);

        cloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud3.setText("jLabel1");
        background.add(cloud3);
        cloud3.setBounds(-100, 50, 240, 290);

        cloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (4).png"))); // NOI18N
        cloud2.setText("jLabel1");
        background.add(cloud2);
        cloud2.setBounds(-20, 0, 240, 140);

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

    public void setReturntoarea(ActionListener listener) {
        returntoarea.addActionListener(listener);
    }

    public String getEnemyFamily(){
        return this.enemyfamily.getText();
    }

    public String getEnemylevel(){
        return this.enemylevel.getText();
    }

    public String getEnemyName(){
        return this.enemyname.getText();
    }

    public String getEnemyType(){
        return this.enemytype.getText();
    }

    public String getEnemyTextFile(){
        return this.EnemyFilename;
    }

    public void setEnemyfamily(String text) {
        this.enemyfamily.setText( text);
    }
    public void setEnemylevel(String text) {
        this.enemylevel.setText(text);
    }
    public void setEnemytype(String text) {
        this.enemytype.setText(text);
    }
    public void setEnemyname(String text) {
        this.enemyname.setText(text);
    }
    public void setEnemycreatureimg(String filename){
            try {
                ImageIcon icon = new ImageIcon(getClass().getResource(filename));
                enemycreatureimg.setIcon(icon);
                EnemyFilename = filename;
            } catch (NullPointerException e) {
                System.err.println("Error loading image: " + e.getMessage());
            }
        }

    // Variables declaration - do not modify
    private javax.swing.JPanel background;
    private javax.swing.JLabel cloud1;
    private javax.swing.JLabel cloud2;
    private javax.swing.JLabel cloud3;
    private javax.swing.JLabel clouds;
    private javax.swing.JLabel enemycreatureimg;
    private javax.swing.JPanel enemydetails;
    private javax.swing.JLabel enemyencountered;
    private javax.swing.JLabel enemyfamily;
    private javax.swing.JLabel enemylevel;
    private javax.swing.JLabel enemyname;
    private javax.swing.JLabel enemytype;
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton returntoarea;
    private javax.swing.JButton view;
    private String EnemyFilename;
    // End of variables declaration
}
