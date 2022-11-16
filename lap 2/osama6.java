import java.util.Scanner;

public class osama6 {
    public static void main(String[] args) {

        long x, y, r, s;
        Scanner in =new Scanner(System.in);
        System.out.println("input the number:");
        x=in.nextLong();

        y =x*x;
        r =x*x*x;
        s =x*x*x*x;

        System.out.println("the a is:"+y);
        System.out.println("the b is:"+r);
        System.out.println("the c is:"+s);
    }
}
