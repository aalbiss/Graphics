package Label;

import javax.swing.*;
import java.awt.*;

public class Label3 extends JFrame {

    public Label3(){
        super("JTextField e GridLayout");
        setSize(250,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Road Rage", Font.TRUETYPE_FONT, 199);
        getContentPane().setBackground(Color.black);
        
        JLabel label1 = new JLabel("Alberto");
//        JLabel label2 = new JLabel("Due");
//        JLabel label3 = new JLabel("Tre");
//        JLabel label4 = new JLabel("Quattro");
//        JLabel label5 = new JLabel("Cinque");
//        JLabel label6 = new JLabel("Sei");
        
        setLayout(null);

        label1.setBounds(100, 100, 1400, 500);
//        label2.setBounds(100, 200, 100, 10);
//        label3.setBounds(100, 300, 100, 10);
//        label4.setBounds(100, 400, 100, 10);
//        label5.setBounds(100, 500, 100, 10);
//        label6.setBounds(100, 600, 100, 10);
        
        
        label1.setForeground(PURPLE);
//        label2.setForeground(Color.yellow);
//        label3.setForeground(PURPLE);
//        label4.setForeground(Color.yellow);
//        label5.setForeground(PURPLE);
//        label6.setForeground(Color.yellow);
        
        label1.setFont(font);
        
        add(label1);
//        add(label2);
//        add(label3);
//        add(label4);
//        add(label5);
//        add(label6);
        

        setVisible(true);
        setLocationRelativeTo(null);
//        setResizable(false);
    
    }

    public static void main(String[] args) {

        Label3 l3 = new Label3();

    }
    
    public static final Color PURPLE = new Color(180, 0, 255);
    
}