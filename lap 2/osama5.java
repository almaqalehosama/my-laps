import java.util.Scanner;

public class osama5 {
    public static void main(String[] args) {

        int x, y, z;
        Scanner in =new Scanner(System.in);
        System.out.print("enter x:");
        x=in.nextInt();

        System.out.print("enter y:");
        y=in.nextInt();

        z=x;
        x=y;
        y=z;

        System.out.println(" x ="+x);
        System.out.println(" x  ="+y);

    }
}
