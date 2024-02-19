import javax.swing.*;

public class Label1 extends JFrame {

    public Label1(){

        super("label-JLabel");
        setSize(500,500);

        JLabel label = new JLabel("Prova");
        add(label);
        setVisible(true);

    }

    public static void main(String[] args) {
        Label1 l = new Label1();
    }

}
