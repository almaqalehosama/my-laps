import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Q9 extends JComponent {
    public void paintComponent (Graphics g)
    {
        Rectangle r= new Rectangle(80,100,100,300);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(r);

        Ellipse2D.Double green =new Ellipse2D.Double(98,100,70,70);
        g2.setColor(Color.green);
        g2.fill(green);

        Ellipse2D.Double yellow =new Ellipse2D.Double(98,200,70,70);
        g2.setColor(Color.yellow);
        g2.fill(yellow);


        Ellipse2D.Double red =new Ellipse2D.Double(98,300,70,70);
        g2.setColor(Color.red);
        g2.fill(red);



    }
}
