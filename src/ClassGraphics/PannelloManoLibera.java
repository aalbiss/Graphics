package ClassGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class PannelloManoLibera extends JPanel {
    
    int x, y;
    
    public PannelloManoLibera() {
        addMouseMotionListener(new AscoltaMouse());
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        //super.paintComponent(g); CANCELLA IL DISEGNO
        
        g.fillOval(x, y, 10, 10);
    
    
    }
    
    class AscoltaMouse implements MouseMotionListener{
        
        @Override
        public void mouseDragged(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            repaint();
        }
        
        @Override
        public void mouseMoved(MouseEvent e) {
        
        }
    }
}
