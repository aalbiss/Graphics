import javax.swing.*;

public class Intro2 extends JFrame {

    public Intro2(){
        super("Title");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Intro2 in = new Intro2();
    }

}
