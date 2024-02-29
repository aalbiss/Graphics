package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton1 extends JFrame {
    
    JButton decrementa;
    JButton incrementa;
    
    public JButton1() {
        
        super("JButton 1");
        setSize(500, 500);
        
        decrementa = new JButton("Decrementa");
        incrementa = new JButton("Incrementa");
        JLabel label = new JLabel("1");
        
        String string = "";
        
        incrementa.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String numString = label.getText();
                        int numero = Integer.parseInt(numString);
                        numero++;
                        label.setText(Integer.toString(numero));
                    }
                }
        );
        
        decrementa.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String numString;
                        numString = label.getText();
                        int numero = Integer.parseInt(numString);
                        numero--;
                        label.setText(Integer.toString(numero));
                    }
                }
        );
        
        setLayout(new GridLayout(1, 3));
        
        add(decrementa);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
        add(incrementa);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        JButton1 b = new JButton1();
        
    }
    
}
