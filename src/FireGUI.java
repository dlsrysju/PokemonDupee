/**The given class, FireGUI is the GUI for choosing fire type creatures
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */

import java.awt.event.ActionListener;

/**
 *
 * @author Justin Delos Reyes
 */
public class FireGUI extends javax.swing.JFrame {

    /**
     * Creates new form FireGUI
     */
    public FireGUI() {
        initComponents();
        setSize(800, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {

        leftpanel = new javax.swing.JPanel();
        FIRE = new javax.swing.JLabel();
        parfwitimg = new javax.swing.JLabel();
        strawanderimg = new javax.swing.JLabel();
        chocowoolimg = new javax.swing.JLabel();
        strawanderdetails = new javax.swing.JPanel();
        names = new javax.swing.JLabel();
        familya = new javax.swing.JLabel();
        firetypes = new javax.swing.JLabel();
        level1s = new javax.swing.JLabel();
        chocowooldeytails = new javax.swing.JPanel();
        chocowoolc = new javax.swing.JLabel();
        familyb = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        parfwitdetails = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        firelogo = new javax.swing.JLabel();
        firelogo2 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        Firetype = new javax.swing.JLabel();
        SelectStarter1 = new javax.swing.JLabel();
        Cloud5 = new javax.swing.JLabel();
        Cloud4 = new javax.swing.JLabel();
        Cloud3 = new javax.swing.JLabel();
        Cloud2 = new javax.swing.JLabel();
        Cloud1 = new javax.swing.JLabel();
        FireType = new javax.swing.JButton();
        Strawander = new javax.swing.JButton();
        Chocowool = new javax.swing.JButton();
        Parfwit = new javax.swing.JButton();
        Grass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 534));

        leftpanel.setBackground(new java.awt.Color(246, 246, 199));
        leftpanel.setLayout(null);

        FIRE.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        FIRE.setForeground(new java.awt.Color(204, 0, 51));
        FIRE.setText("FIRE TYPE");
        FIRE.setName(""); // NOI18N
        FIRE.setPreferredSize(new java.awt.Dimension(130, 16));
        leftpanel.add(FIRE);
        FIRE.setBounds(120, 0, 390, 60);

        parfwitimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parfwit.png"))); // NOI18N
        parfwitimg.setText("jLabel1");
        leftpanel.add(parfwitimg);
        parfwitimg.setBounds(-20, 320, 220, 190);

        strawanderimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/charmander(updated) (3).png"))); // NOI18N
        strawanderimg.setText("jLabel4");
        leftpanel.add(strawanderimg);
        strawanderimg.setBounds(-20, 40, 220, 170);

        chocowoolimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mareep (1).png"))); // NOI18N
        chocowoolimg.setText("jLabel5");
        leftpanel.add(chocowoolimg);
        chocowoolimg.setBounds(-20, 150, 210, 240);

        strawanderdetails.setBackground(new java.awt.Color(214, 232, 232));

        names.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        names.setText("Name: Strawander");

        familya.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        familya.setText("Family: A");

        firetypes.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        firetypes.setText("Type: Fire ");

        level1s.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        level1s.setText("Level: 1");

        javax.swing.GroupLayout strawanderdetailsLayout = new javax.swing.GroupLayout(strawanderdetails);
        strawanderdetails.setLayout(strawanderdetailsLayout);
        strawanderdetailsLayout.setHorizontalGroup(
                strawanderdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(strawanderdetailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(strawanderdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(level1s)
                                        .addComponent(familya)
                                        .addComponent(names)
                                        .addComponent(firetypes))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        strawanderdetailsLayout.setVerticalGroup(
                strawanderdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(strawanderdetailsLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(names)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(familya)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firetypes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(level1s)
                                .addContainerGap(10, Short.MAX_VALUE))
        );

        leftpanel.add(strawanderdetails);
        strawanderdetails.setBounds(200, 80, 170, 100);

        chocowooldeytails.setBackground(new java.awt.Color(214, 232, 232));

        chocowoolc.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        chocowoolc.setText("Name: Chocowool");

        familyb.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        familyb.setText("Family: B");

        jLabel15.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel15.setText("Type: Fire");

        jLabel16.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel16.setText("Level: 1");

        javax.swing.GroupLayout chocowooldeytailsLayout = new javax.swing.GroupLayout(chocowooldeytails);
        chocowooldeytails.setLayout(chocowooldeytailsLayout);
        chocowooldeytailsLayout.setHorizontalGroup(
                chocowooldeytailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(chocowooldeytailsLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(chocowooldeytailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addComponent(familyb)
                                        .addComponent(chocowoolc)
                                        .addComponent(jLabel15))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        chocowooldeytailsLayout.setVerticalGroup(
                chocowooldeytailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(chocowooldeytailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(chocowoolc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(familyb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addGap(12, 12, 12))
        );

        leftpanel.add(chocowooldeytails);
        chocowooldeytails.setBounds(200, 230, 170, 100);

        parfwitdetails.setBackground(new java.awt.Color(214, 232, 232));

        jLabel17.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel17.setText("Name: Parfwit");

        jLabel18.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel18.setText("Family: B");

        jLabel19.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel19.setText("Type: Fire");

        jLabel20.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jLabel20.setText("Level: 1");

        javax.swing.GroupLayout parfwitdetailsLayout = new javax.swing.GroupLayout(parfwitdetails);
        parfwitdetails.setLayout(parfwitdetailsLayout);
        parfwitdetailsLayout.setHorizontalGroup(
                parfwitdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(parfwitdetailsLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(parfwitdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel17))
                                .addContainerGap(66, Short.MAX_VALUE))
        );
        parfwitdetailsLayout.setVerticalGroup(
                parfwitdetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(parfwitdetailsLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        leftpanel.add(parfwitdetails);
        parfwitdetails.setBounds(200, 370, 170, 100);

        firelogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (13).png"))); // NOI18N
        leftpanel.add(firelogo);
        firelogo.setBounds(-130, 250, 375, 375);

        firelogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (13).png"))); // NOI18N
        leftpanel.add(firelogo2);
        firelogo2.setBounds(160, -150, 375, 375);

        Background.setBackground(new java.awt.Color(214, 232, 232));
        Background.setLayout(null);

        Firetype.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        Firetype.setText("FIRE Type");
        Background.add(Firetype);
        Firetype.setBounds(560, 130, 230, 22);

        SelectStarter1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        SelectStarter1.setText("Select Starter Creature");
        Background.add(SelectStarter1);
        SelectStarter1.setBounds(500, 80, 230, 22);

        Cloud5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud5.setText("jLabel1");
        Background.add(Cloud5);
        Cloud5.setBounds(690, -110, 160, 180);

        Cloud4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud4.setText("jLabel1");
        Background.add(Cloud4);
        Cloud4.setBounds(370, -140, 160, 260);

        Cloud3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud3.setText("jLabel1");
        Background.add(Cloud3);
        Cloud3.setBounds(600, -30, 140, 160);

        Cloud2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud2.setText("jLabel1");
        Background.add(Cloud2);
        Cloud2.setBounds(450, -100, 140, 160);

        Cloud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("images/Orange and Green Modern Icons Food Logo (5).png"))); // NOI18N
        Cloud1.setText("jLabel1");
        Background.add(Cloud1);
        Cloud1.setBounds(660, -50, 140, 160);

        FireType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FireType.setForeground(new java.awt.Color(102, 102, 102));
        FireType.setText("Back");
        FireType.setBorderPainted(false);
        FireType.setFocusPainted(false);

        Background.add(FireType);
        FireType.setBounds(530, 350, 130, 40);

        Strawander.setBackground(new java.awt.Color(0, 102, 102));
        Strawander.setForeground(new java.awt.Color(255, 255, 255));
        Strawander.setText("Strawander");
        Strawander.setBorderPainted(false);
        Strawander.setFocusPainted(false);

        Background.add(Strawander);
        Strawander.setBounds(530, 170, 130, 40);

        Chocowool.setBackground(new java.awt.Color(0, 102, 102));
        Chocowool.setForeground(new java.awt.Color(255, 255, 255));
        Chocowool.setText("Chocowool");
        Chocowool.setBorderPainted(false);
        Chocowool.setFocusPainted(false);

        Background.add(Chocowool);
        Chocowool.setBounds(530, 220, 130, 40);

        Parfwit.setBackground(new java.awt.Color(0, 102, 102));
        Parfwit.setForeground(new java.awt.Color(255, 255, 255));
        Parfwit.setText("Parfwit");
        Parfwit.setBorderPainted(false);
        Parfwit.setFocusPainted(false);

        Background.add(Parfwit);
        Parfwit.setBounds(530, 270, 130, 40);

        Grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png"))); // NOI18N
        Background.add(Grass1);
        Grass1.setBounds(370, 280, 797, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(leftpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 387, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(leftpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    //back button


    public void FireTypeActionListener(ActionListener listener) {
        FireType.addActionListener(listener);
    }


    public void StrawanderActionListener(ActionListener listener) {
        Strawander.addActionListener(listener);
    }

    public void ChocowoolActionListener(ActionListener listener) {
        Chocowool.addActionListener(listener);
    }

    public void ParfwitActionListener(ActionListener listener) {
        Parfwit.addActionListener(listener);
    }


    // Variables declaration - do not modify
    private javax.swing.JPanel Background;
    private javax.swing.JButton Chocowool;
    private javax.swing.JLabel Cloud1;
    private javax.swing.JLabel Cloud2;
    private javax.swing.JLabel Cloud3;
    private javax.swing.JLabel Cloud4;
    private javax.swing.JLabel Cloud5;
    private javax.swing.JLabel FIRE;
    private javax.swing.JButton FireType;
    private javax.swing.JLabel Firetype;
    private javax.swing.JLabel Grass1;
    private javax.swing.JButton Parfwit;
    private javax.swing.JLabel SelectStarter1;
    private javax.swing.JButton Strawander;
    private javax.swing.JLabel chocowoolc;
    private javax.swing.JPanel chocowooldeytails;
    private javax.swing.JLabel chocowoolimg;
    private javax.swing.JLabel familya;
    private javax.swing.JLabel familyb;
    private javax.swing.JLabel firelogo;
    private javax.swing.JLabel firelogo2;
    private javax.swing.JLabel firetypes;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel level1s;
    private javax.swing.JLabel names;
    private javax.swing.JPanel parfwitdetails;
    private javax.swing.JLabel parfwitimg;
    private javax.swing.JPanel strawanderdetails;
    private javax.swing.JLabel strawanderimg;
    // End of variables declaration
}
