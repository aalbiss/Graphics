package PannelliPrefatti;

import javax.swing.*;
import java.awt.*;

public class OptionPane1 extends JFrame {
    
    public OptionPane1(){
        super("JOptionPane");
        int confirm;
        String input;
        
        
//        confirm = JOptionPane.showConfirmDialog(null, "Messaggio", "Titolo", JOptionPane.YES_NO_CANCEL_OPTION);
        
//        input = JOptionPane.showInputDialog(null, "Messaggio", "Titolo", JOptionPane.INFORMATION_MESSAGE);
                                                                                                                                              //null --> icona
        confirm = JOptionPane.showOptionDialog(null, "Messaggio", "Titolo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE,  new ImageIcon("download.png"), null, null);
        
        System.out.println(confirm);
        
    }
    
    public static void main(String[] args) {
        new OptionPane1();
    }
    
}
