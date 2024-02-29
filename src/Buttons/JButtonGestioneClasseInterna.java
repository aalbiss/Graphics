package Buttons;

import javax.swing.*;
import java.awt.*;

public class JButtonGestioneClasseInterna extends JFrame {
    
    JButton decrementa;
    JButton incrementa;
    JLabel label;
    
    public JButtonGestioneClasseInterna() {
        
        super("JButton 2");
        setSize(800, 200);
        
        decrementa = new JButton("Decrementa");
        incrementa = new JButton("Incrementa");
        label = new JLabel("0");
        
        setLayout(new GridLayout(1, 3));
        
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Font f1 = new Font("Road rage", Font.PLAIN, 23);
        
        incrementa.setFont(f1);
        decrementa.setFont(f1);
        
        add(decrementa);
        add(label);
        add(incrementa);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
//        incrementa.addActionListener(this);
//        decrementa.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
        Buttons.JButton2 b = new Buttons.JButton2();
    }
    
    
    
}