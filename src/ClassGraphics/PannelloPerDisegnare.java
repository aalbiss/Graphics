package ClassGraphics;

import javax.swing.*;
import java.awt.*;

public class PannelloPerDisegnare extends JPanel {
    
    public void paintComponent(Graphics graphics){
        
        //BANDIERA ITALIANA
//        graphics.setColor(Color.GREEN);
//        graphics.fillRect(0, 0, 100, 200);
//        graphics.setColor(Color.WHITE);
//        graphics.fillRect(100, 0, 100, 200);
//        graphics.setColor(Color.RED);
//        graphics.fillRect(200, 0, 100, 200);
        
//        graphics.fillRoundRect(20, 100, 300, 350, 150, 150);
        
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(0, 0, 100, 100);
        
        graphics.setColor(Color.RED);
        graphics.fillOval(100, 100, 100, 100);
        
        graphics.setColor(Color.MAGENTA);
        graphics.fillOval(200, 150, 200, 100);
        
        graphics.setColor(Color.CYAN);
        graphics.drawString("CIAO MONDO", 300, 300);
        
        
    }
    
}
