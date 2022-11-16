import javax.swing.*;

public class Q9_Test {
    public static void main(String[] args) {

        JFrame f= new JFrame("my frame");
        f.setSize(500,1000);
        Q9 d=new Q9();
        f.add(d);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // off the program

    }
}
