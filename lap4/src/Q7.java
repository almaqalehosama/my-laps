import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
public class Q7 extends JComponent{
    public void paintComponent (Graphics g)
    {
        Rectangle r= new Rectangle(80,100,100,300);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.pink);
        g2.fillRect(50 ,100 ,100 ,50);


        g2.setColor(Color.magenta);
        g2.fillRect(130 ,155 ,100 ,50);

    }

}
