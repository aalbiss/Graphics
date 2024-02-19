import javax.swing.*;
import java.awt.*;

public class Label1 extends JFrame {

    public Label1(){

        super("label-JLabel");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel prova = new JLabel("Prova");
        add(prova);

        JLabel mondo = new JLabel("Mondo");
        add(mondo);



        setLayout(new GridLayout(3,2));

        setVisible(true);


    }

    public static void main(String[] args) {
        Label1 l = new Label1();
    }

}
