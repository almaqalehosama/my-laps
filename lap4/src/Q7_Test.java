import javax.swing.*;

public class Q7_Test {

    public static void main(String[] args) {

        JFrame f= new JFrame("my frame");
        f.setSize(500,500);
        Q7 d = new Q7();
        f.add(d);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // off the program

    }

}
