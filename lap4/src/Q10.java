import java.awt.*;
import javax.swing.*;

public class Q10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(2000, 2000);
        JLabel label = new JLabel("Hello, Osama!");
        label.setOpaque(true);
        label.setBackground(Color.green);
        frame.add(label);

         // ImageIcon image;
        //  ImageIcon image = new ImageIcon("image2.jpg");
       //   frame.add(image);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
