import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter three number:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();


        if (x == y & x == z) System.out.println("all the same");
        else if (x != y & x != z) System.out.println("all different");
        else System.out.println(" neither");

    }
}
