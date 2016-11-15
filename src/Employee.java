/**
 * Created by bigger on 11/8/16.
 */

/**
 * 合同工
 */
public class Employee extends StaffMember {
    private String socialISN;
    private double payRate;

    public Employee(String name, String address, String phone, String socialISN, double payRate){
        super(name, address, phone);
        this.socialISN = socialISN;
        this.payRate = payRate;
    }
    public String toString(){
        return super.toString()+"\n社会安全号："+socialISN+"\n工资：$"+payRate;
    }
    public double pay(){
        return payRate;
    }

    public String getSocialISN() {
        return socialISN;
    }
}
