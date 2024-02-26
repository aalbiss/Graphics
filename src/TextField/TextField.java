package TextField;

import javax.swing.*;
import java.awt.*;

public class TextField extends JFrame {

    public TextField(){
        super("JTextField e GridLayout");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField field1 = new JTextField("Uno");
        JTextField field2 = new JTextField("Due");
        JTextField field3 = new JTextField("Tre");
        JTextField field4 = new JTextField("Quattro");
        JTextField field5 = new JTextField("Cinque");
        JTextField field6 = new JTextField("Sei");

        setLayout(new GridLayout(3,2));

        add(field1);
        add(field2);
        add(field3);
        add(field4);
        add(field5);
        add(field6);

        setVisible(true);
        setLocationRelativeTo(null);
    }


    public static void main(String[] args) {
        TextField t = new TextField();
    }

}
