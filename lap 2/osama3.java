import java.util.Scanner;

public class osama3 {
    public static void main(String[] args) {

        double x, y, o, s;
        final double bay =13.4;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the width:");
        o=in.nextDouble();

        System.out.println("enter the height:");
        s=in.nextDouble();

        x =2*(o+s);
        System.out.println("x ="+x);
        y =o*s;
        System.out.println("y ="+y);

    }
}
