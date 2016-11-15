/**
 * Created by bigger on 11/8/16.
 */
public abstract class StaffMember {
    private String name;
    private String address;
    private String phone;

    public StaffMember(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }
    public  String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    public String toString(){
        return "姓名："+name+"\n地址："+address+"\n电话："+phone;
    }
    public abstract double pay();
}
