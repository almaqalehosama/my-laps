import java.util.Objects;

public class user extends person {
     private int id=0;
     payment p;
/*just to try
* */
    public user() {
        id=0;
        p=new payment();
    }

    public user(String name, long phone, String address) {
        super(name, phone, address);
        setId();
    }

 private   void setId() {
     this.id = connection.num_of_user;
   }

    public int getId() {
        return id;
    }
//    @Override


    @Override
    public String Display() {

        return super.Display()+"ID:"+getId()+"}\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return id == user.id;
    }
    public void set_current_read(int d){
        p.set_current_read(d);
        p.getNumber_of_kilos_for_this_month();
        p.set_dept();
    }


    public boolean payment(double money){
        if(money==p.set_dept())
        {
            p.afterpaymeny();
            p.set_dept_to_zero();
            return true;
        }
       /* else if (money>p.getNumber_of_kilos_for_this_month()*p.getKilo_price())
        {

        }*/
        else{return false;}
    }


}
