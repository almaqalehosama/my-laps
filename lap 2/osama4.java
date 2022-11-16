import java.util.Scanner;

public class osama4 {
    public static void main(String[] args) {
        double a, x, y, z;
        Scanner in =new Scanner(System.in);
        System.out.println("input three number:");
        x=in.nextDouble();
        y=in.nextDouble();
        z=in.nextDouble();

        a = (x + y + z)/3;
        System.out.println("the average :"+a);

    }
}
