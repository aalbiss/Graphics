package ClasseTimer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClasseTimer extends JFrame implements ActionListener {
  
    JButton button1;
    JLabel label1;
    
    Timer timer;
    
    public ClasseTimer() {
        super("Timer");
        setSize(500, 500);
        Font font = new Font("Arial Black", Font.PLAIN, 20 );
        
        button1 = new JButton("START");
        add(button1);
        label1 = new JLabel("0");
        label1.setFont(font);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        add(label1);
        
        
        timer = new Timer(200, this);
        
        button1.addActionListener(this);
        setLayout(new GridLayout(1,2));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == timer){
            String numString = label1.getText();
            int numero = Integer.parseInt(numString);
            numero++;
            label1.setText(Integer.toString(numero));
        }
        
        if(e.getSource() == button1){
            if(timer.isRunning()){
                timer.stop();
                button1.setText("START");
            } else if (!timer.isRunning()) {
                timer.start();
                button1.setText("STOP");
            }
        }
    }
    
    public static void main(String[] args) {
        new ClasseTimer();
    }
    
}
