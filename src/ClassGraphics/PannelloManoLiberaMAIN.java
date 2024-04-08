package ClassGraphics;

import javax.swing.*;

public class PannelloManoLiberaMAIN extends JFrame {
    
    public PannelloManoLiberaMAIN() {
        super("Area di disegno");
        setSize(800, 800);
        
        add(new PannelloManoLibera());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new PannelloManoLiberaMAIN();
    }
    
}
