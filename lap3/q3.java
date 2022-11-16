import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        System.out.println("enter the number plaese");
        long x = o.nextLong();
        if (x<0){x*=-1;}

        System.out.print("the number of digits contains(");
        if (x<10) System.out.println(x+"):1");
        else if (x<100) System.out.println(x+"):2");
        else if (x<1000) System.out.println(x+"):3");
        else if (x<10000) System.out.println(x+"):4");
        else if (x<100000) System.out.println(x+"):5");
        else if (x<1000000) System.out.println(x+"):6");
        else if (x<10000000) System.out.println(x+"):7");
        else if (x<100000000) System.out.println(x+"):8");
        else if (x<1000000000) System.out.println(x+"):9");



    }
}
