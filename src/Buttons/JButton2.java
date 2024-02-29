package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButton2 extends JFrame implements ActionListener {
    
    JButton decrementa;
    JButton incrementa;
    JLabel label;
    
    public JButton2() {
        
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
        
        incrementa.addActionListener(this);
        decrementa.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementa) {
            
            String numString = label.getText();
            int numero = Integer.parseInt(numString);
            numero++;
            
            if (numero == 0)
                label.setForeground(Color.BLACK);
            else if (numero > 0)
                label.setForeground(Color.GREEN);
            else
                label.setForeground(Color.RED);
            
            label.setText(Integer.toString(numero));
            
        } else {
            
            String numString = label.getText();
            int numero = Integer.parseInt(numString);
            numero--;
            
            if (numero == 0)
                label.setForeground(Color.BLACK);
            else if (numero > 0)
                label.setForeground(Color.GREEN);
            else
                label.setForeground(Color.RED);
            
            label.setText(Integer.toString(numero));
            
        }
    }
    
    public static void main(String[] args) {
        JButton2 b = new Buttons.JButton2();
    }
    
}