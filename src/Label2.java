import javax.swing.*;
import java.awt.*;

public class Label2 extends JFrame {

    public Label2(){
        super("JTextField e GridLayout");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Uno");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label2 = new JLabel("Due");
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label3 = new JLabel("Tre");
        label3.setHorizontalAlignment(SwingConstants.CENTER);
        label3.setVerticalAlignment(SwingConstants.BOTTOM);

        JLabel label4 = new JLabel("Quattro");
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel label5 = new JLabel("Cinque");
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new BorderLayout());

        add(label1, BorderLayout.NORTH);
        add(label2, BorderLayout.WEST);
        add(label3, BorderLayout.CENTER);
        add(label4, BorderLayout.EAST);
        add(label5, BorderLayout.SOUTH);

        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        Label2 l2 = new Label2();

    }

}
