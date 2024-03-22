package ClassGraphics;

import javax.swing.*;

public class IntroDisegno extends JFrame {
    
    public IntroDisegno() {
        super("Area di disegno");
        
        //  BANDIERA ITALIANA setSize(300, 200);
        setSize(600, 600);
        
        add(new PannelloPerDisegnare());
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new IntroDisegno();
    }
    
}
