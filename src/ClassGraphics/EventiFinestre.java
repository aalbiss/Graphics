package ClassGraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventiFinestre extends JFrame implements WindowListener {
    
    public EventiFinestre() {
        super("Prova eventi finestra");
        setSize(400, 500);
        setVisible(true);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        addWindowListener(this);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("opened");
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("closing");
    }
    
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("closed");
    }
    
    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("iconified");
    }
    
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("deiconified");
    }
    
    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("activated");
    }
    
    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("deactivated");
    }
    
    public static void main(String[] args) {
        new EventiFinestre();
    }
    
}
