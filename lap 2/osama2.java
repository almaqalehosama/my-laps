import java.util.Scanner;

public class osama2 {
    public static void main(String[] args) {

        double x, y, os;
        final double bay =13.4;
        Scanner in =new Scanner(System.in);
        System.out.println("input nq:");
        os =in.nextDouble();

        x =2*bay*os;
        System.out.println("x ="+x);
        y =bay*(os*os);
        System.out.println("y ="+y);

    }
}
