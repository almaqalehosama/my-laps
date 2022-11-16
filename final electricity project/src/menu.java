import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    connection c;
    Scanner in=new Scanner(System.in);
int choose;
    public menu() {
        c=new connection();
    }

    public void show_menu(){
        header();
        System.out.println("choose one of the following please to perform a task");
        System.out.println("1-adding a new user ");
        System.out.println("2-display users");
        System.out.println("3-search for user by id");
        System.out.println("4- reading");
        System.out.println("5-paying");
        header();



for (;;) {
    choose=in.nextInt();
    switch (choose) {
        case 1:
            add();
            break;
        case 2:
            display();
            break;
        case 3:
            lookFor();break;
        case 4:
        editing();break;
        case 5:
            seting_user_conter_read();break;
        case 6:
            payment();break;
    }
}






       /* else if(choose==2)
        display();
*/




    }
private void header(){
    System.out.println("___________________________________________________________________________");


}


public void add(){

       String name;
       long phone;
       String address;

       name=in.next();
       phone=in.nextLong();
       address=in.next();

       if(c.add(name,phone,address))
    {

         System.out.println("added successfully !");

    }
    else
    System.out.println("some thing is wrong please try again  later");



}
public void display()
 {

     ArrayList<user>displayAll=c.display();
     for (int i = 0; i < displayAll.size(); i++) {
        System.out.println(displayAll.get(i).Display());

    }

 }

 public void lookFor(){
     System.out.println("enter the number of your Kilo counter:");
    int k;
    k= in.nextInt();
    user s;
   s=c.search(k);



     if(s==null)
     {
         System.out.println("sorry but there is no user with this id");
     }

     else
     {

         System.out.println("we found the user");
         System.out.println(s.Display());

     }


 }

public void editing(){
    System.out.println("enter the id for the user u want to edit");
    int d= in.nextInt();
        if (c.search(d)!=null) {
            System.out.println("what do you want to  edit?");
            System.out.println("1-name\n2-phone\n3-address");
            int s;
            s = in.nextInt();
            switch (s) {
                case 1:{
                    System.out.println("enter tha name please");
                    String n=in.next();
                    c.editName(d,n);
                    if (c.editName(d,n))
                        System.out.println("change successfully! ");
                    else
                        System.out.println("sorry user doesn't exist");
                } break;
                case 2:{
                    System.out.println("enter tha phone number");
                    long p=in.nextLong();
                    c.editPhone(d,p);
                    if (c.editPhone(d,p))
                        System.out.println("change successfully! ");
                    else
                        System.out.println("sorry user doesn't exist");
                } break;
                case 3:{
                    System.out.println("enter tha address");
                    String a=in.next();
                    c.editAddress(d,a);
                    if (c.editAddress(d,a))
                        System.out.println("change successfully! ");
                    else
                        System.out.println("sorry user doesn't exist");
                }
            }
        }


}
public void payment(){
    System.out.println("enter the id for the user please:");
        int id=in.nextInt();
 user u=c.search(id);
        if(c.search(id)!=null)
        {
            System.out.println("enter the amount of money please:");
            double money= in.nextDouble();

            if(c.paying(id,money))
            {
                System.out.println(u.Display());
                System.out.println("\nhas paid his pill");
            }

            else
                System.out.println("doesn't pay");


        }
        else System.out.println("sorry something went wrong payment menu");




}


public void seting_user_conter_read(){
    System.out.print("enter the user id:");
    int id=in.nextInt();
    user d=c.search(id);


        if(d!=null){
            System.out.println("enter the last read you take");
            int k=in.nextInt();
            d.set_current_read(k);

        }
        else
            System.out.println("user not found");



}






}
