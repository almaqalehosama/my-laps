import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("name the employee: ");
        String name = in.next();

        double sal = 9.25;


        System.out.println("how many hours the employee worked in the past week:");
        double hours = in.nextDouble();

        System.out.println("Name the employee : "+name);
        System.out.println("your deserve is  = "+(hours * sal)+"$");

    }

}
