/**The given class, Start is the GUI for the Beginning of the program
 * <p>
 * It consists attributes that handles for the actions in each GUI
 * <ul>
 * </ul>
 * @author De los Reyes, Carl Justin B.
 * </p>
 * */
import java.awt.event.ActionListener;

public class Start extends javax.swing.JFrame {

    public Start() {
        initComponents();
        setSize(800, 535);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        Background = new javax.swing.JPanel();
        majorcourseoutput = new javax.swing.JLabel();
        roleplaying = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        creatures = new javax.swing.JLabel();
        grass1 = new javax.swing.JLabel();
        grass2 = new javax.swing.JLabel();
        clouds3 = new javax.swing.JLabel();
        clouds2 = new javax.swing.JLabel();
        clouds1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Background.setBackground(new java.awt.Color(214, 239, 239));
        Background.setLayout(null);

        majorcourseoutput.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 48));
        majorcourseoutput.setForeground(new java.awt.Color(0, 102, 153));
        majorcourseoutput.setText("Major Course Output 2");
        majorcourseoutput.setBounds(130, 20, 590, 60);
        Background.add(majorcourseoutput);

        roleplaying.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18));
        roleplaying.setText("Role-Playing Game");
        roleplaying.setBounds(330, 360, 190, 40);
        Background.add(roleplaying);

        play.setBackground(new java.awt.Color(0, 102, 153));
        play.setForeground(new java.awt.Color(255, 255, 255));
        play.setText("Play");
        play.setBounds(360, 400, 90, 30);
        play.setFocusPainted(false);

        Background.add(play);

        name.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12));
        name.setText("by DE LOS REYES, Carl Justin");
        name.setBounds(520, 70, 190, 30);
        Background.add(name);

        creatures.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Creatures (2).png")));
        creatures.setBounds(210, 30, 375, 375);
        Background.add(creatures);

        grass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png")));
        grass1.setBounds(370, 250, 750, 280);
        Background.add(grass1);

        grass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (10).png")));
        grass2.setBounds(-310, 170, 750, 440);
        Background.add(grass2);

        clouds3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (6).png")));
        clouds3.setBounds(-10, 20, 500, 210);
        Background.add(clouds3);

        clouds2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (6).png")));
        clouds2.setBounds(550, -30, 500, 210);
        Background.add(clouds2);

        clouds1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orange and Green Modern Icons Food Logo (6).png")));
        clouds1.setBounds(450, 60, 541, 210);
        Background.add(clouds1);

        getContentPane().add(Background);

        pack();
    }

    public void playActionListener(ActionListener listener) {
        play.addActionListener(listener);
    }

    private javax.swing.JPanel Background;
    private javax.swing.JLabel clouds1;
    private javax.swing.JLabel clouds2;
    private javax.swing.JLabel clouds3;
    private javax.swing.JLabel creatures;
    private javax.swing.JLabel grass1;
    private javax.swing.JLabel grass2;
    private javax.swing.JLabel majorcourseoutput;
    private javax.swing.JLabel name;
    private javax.swing.JButton play;
    private javax.swing.JLabel roleplaying;
}
