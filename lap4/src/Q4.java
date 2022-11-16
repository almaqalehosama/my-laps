import java.awt.*;

public class Q4 {
    public static void main(String[] args) {

        Rectangle box= new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("x="+box.getX());
        System.out.println("Expected (X) = 0");
        System.out.println("y="+box.getY());
        System.out.println("Expected (y) = 0");
        System.out.println("width="+box.getWidth());
        System.out.println("Expected (width) = 25");
        System.out.println("height="+box.getHeight());
        System.out.println("Expected (height) = 40");



    }
}
