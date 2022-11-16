import java.util.ArrayList;

public  class connection {

    ArrayList<user> allusers;
     static int num_of_user=1;

    public connection() {
        allusers = new ArrayList<>();

    }

    public boolean add(String n, long ph, String address) {
        if (true) {


            user U = new user(n, ph, address);
            allusers.add(U);
            num_of_user++;
            return true;
        } else
            return false;

    }

    public ArrayList<user> display() {


        return allusers;


    }

    public user search(int id){
        boolean sign=false;
int i=0;
        user s=new user("0",0,"0");
        user d=null;

        while(!sign&&i<=allusers.size()) {
            if (allusers.get(i)!=null) {

                if (allusers.get(i).getId() == id) {
                    sign = true;
                    d=allusers.get(i);
                }else
                {i++;
               }


            }
            else {break;}

       }
        if(sign)
        {
            return d;}
         else
             return d;


    }






   //function4
    public boolean editName(int id,String name){
       user s=search( id);
if (s!=null){s.setName(name);
return true;}
      else
          return false;
    }
    //function5
    public boolean editPhone(int id,long phone){
        user s=search(id);

        if (s!=null) {
            s.setPhone(phone);
            return true;
        }else
            return false;
    }
    //function6
    public boolean editAddress(int id,String address){
        user s=search( id);

        if (s!=null) {
            s.setAddress(address);
            return true;
        }else
            return false;

    }
    //function7
  //  public boolean set_theprice_of_kilo;

    //function8
    public boolean paying(int id,double money){

        if (allusers.get(id).payment(money))
        {
         return true;
        }
        else return false;





    }
    public boolean set_c_read(int d,int id){
        allusers.get(id).set_current_read(d);
        return true;
    }



}