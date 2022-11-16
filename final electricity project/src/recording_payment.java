public class recording_payment {
    String date;
    int all_kilos;

    public recording_payment() {
        this.date = null;
        this.all_kilos = 0;
    }
public int record_kilo(int kilos){
        while(kilos>0)
            all_kilos=kilos;
            return all_kilos;





}
public String recording(int k,String d){

        return record_kilo(k)+""+record_date(d);



}

    public String record_date(String date) {
       return this.date=date;
    }

    public String display() {
        return "recording_payment{" +
                "date='" + date + '\'' +
                ", all_kilos=" + all_kilos +
                '}';
    }
}
