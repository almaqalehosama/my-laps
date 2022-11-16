public class payment {

    double dept;
 private int current_read=0;
  static double kilo_price=300;
  static   int  previous_read=0;
  int number_of_kilos_for_this_month=0;

    public payment() {


    }
     //function1
    public void setKilo_price(double kilo_price) {
        this.kilo_price = kilo_price;
    }
    //function2
    public double getKilo_price() {
        return kilo_price;
    }
    //function3
    public int getcurrent_read() {
        return current_read;
    }

    public int getNumber_of_kilos_for_this_month(){
        number_of_kilos_for_this_month=current_read-previous_read;
        return number_of_kilos_for_this_month;
    }

    //function4
    public boolean set_current_read(int d){
        if(d>0&&d>previous_read)
        {
            current_read=d;
            return true;
        }
        else

            return false;

    }
    //after reading
    public double set_dept(){
        dept=number_of_kilos_for_this_month*kilo_price;
   return dept;
    }
    public void set_dept_to_zero()
    {dept=0;}



    //after payment1
    public void afterpaymeny(){
        previous_read=current_read;

    }








}