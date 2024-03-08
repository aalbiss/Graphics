package GestioneMouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JLabelMouseListener extends JFrame {
    
    JLabel uno;
    JLabel due;
    
    public JLabelMouseListener(){
        
        super("label-JLabel");
        setSize(500,500);
        uno = new JLabel("uno");
        uno.setHorizontalAlignment(SwingConstants.CENTER);
        uno.setBackground(Color.YELLOW);
        uno.setOpaque(true);
        add(uno);
        
        due = new JLabel("due");
        due.setHorizontalAlignment(SwingConstants.CENTER);
        due.setBackground(Color.MAGENTA);
        due.setOpaque(true);
        add(due);
        
        uno.addMouseListener(new AscoltaMouse());
        due.addMouseListener(new listenMouse());
        setLayout(new GridLayout(1,2));
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    class AscoltaMouse implements MouseListener{
        
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("mouseClicked");
            if(e.getSource() == uno)
                uno.setBackground(Color.BLACK);
            else
                uno.setBackground(Color.YELLOW);
        }
        
        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("mousePressed");
            if(e.getSource() == uno)
                uno.setBackground(Color.RED);
            else
                uno.setBackground(Color.YELLOW);
        }
        
        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("mouseReleased");
            if(e.getSource() == uno)
                uno.setBackground(Color.GREEN);
            else
                uno.setBackground(Color.YELLOW);
        }
        
        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("mouseEntered");
            if(e.getSource() == uno)
                uno.setBackground(Color.ORANGE);
            else
                uno.setBackground(Color.YELLOW);
        }
        
        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("mouseExited");
            if(e.getSource() == uno)
                uno.setBackground(Color.PINK);
            else
                uno.setBackground(Color.YELLOW);
        }
    }
    
    class listenMouse extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("mouseClicked");
            if(e.getSource() == due)
                due.setBackground(Color.GRAY);
            else
                due.setBackground(Color.MAGENTA);
        }
    }
    
    public static void main(String[] args) {
        new JLabelMouseListener();
    }
    
}
