package Tastiera;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TastoPremuto extends JFrame implements KeyListener {
    
    public TastoPremuto(){
        super("Prova eventi finestra");
        setSize(400, 500);
        setVisible(true);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        addKeyListener(this);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
        System.out.println(e.getKeyChar());
        if(e.isShiftDown() && e.getKeyChar() == KeyEvent.VK_TAB){
            System.out.println("SHIFT TAB");
        }
        //        e.getKeyCode();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println("keyPressed");
//        e.getKeyChar();
//        e.getKeyCode();
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println("keyReleased");
//        e.getKeyChar();
//        e.getKeyCode();
    }
    
    public static void main(String[] args) {
        new TastoPremuto();
    }
}
