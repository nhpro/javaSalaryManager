/**
 * Created by bigger on 11/8/16.
 */

/**
 * 经理类
 */
public class Manager extends Employee {
    double bonus;       //红利

    public Manager(String name, String address, String phone, String socialISN, double payRate, double bonus) {
        super(name, address, phone, socialISN, payRate);
        this.bonus = bonus;
    }
    /* 增加红利 */
    public void awardBonus(double bonus) {
        this.bonus += bonus;
    }
    public double pay() {
        return super.pay()+bonus;
    }

    public String toString() {
       return "姓名："+getName()+"\n地址："+getAddress()+"\n电话："+getPhone()
               +"\n社会安全号："+getSocialISN()+"\n工资：$"+pay();
    }
}
