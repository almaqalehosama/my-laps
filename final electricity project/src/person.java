public class person {
    private String name;
    private long phone;
    private String address;

    public person(String name, long phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public person() {
        this.name = null;
        this.address = null;
        this.phone = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String Display() {
        return "person{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\''
                ;
    }



}





