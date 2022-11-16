import java.util.Scanner;

public class osama7 {
    public static void main(String[] args) {
        int x, y;

        Scanner in =new Scanner(System.in);
        System.out.print("enter please the x:");
        x=in.nextInt();

        System.out.print("enter plases the y:");
        y=in.nextInt();

        System.out.println("The sum ="+(x+y));
        System.out.println("The difference ="+(x-y));
        System.out.println("The product ="+(x*y));
        System.out.println("The average ="+((x+y)/2.0));

        if ((x-y)<0)
        {
            System.out.print("The distance :");
            System.out.println(-(x-y));
        }
        else System.out.println(x-y);

        if (x>y) System.out.println("The max :"+x);
        else System.out.println("The max :"+y);

        if (x<y) System.out.println("The min :"+x);
        else System.out.println("The min :"+x);


    }
}
