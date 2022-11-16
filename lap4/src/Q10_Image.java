import javax.swing.*;
import java.awt.*;

public class Q10_Image extends JFrame {

    JFrame frame;
    JLabel displayField;
    ImageIcon image;

    public Q10_Image(){
        frame = new JFrame("Image Display test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            image = new ImageIcon(getClass().getResource("image2.jpg"));
            displayField = new JLabel(image);
            frame.add(displayField);
        }  catch (Exception e){
            System.out.println("Image cannot be found");
        }

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Q10_Image i = new Q10_Image();

    }
}








