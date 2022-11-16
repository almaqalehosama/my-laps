import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input three number:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();


        if (x < y & y < z) System.out.println("increasing ");
        else if (x > y & y > z) System.out.println("  decreasing  ");
        else System.out.println(" neither  ");


    }
}
