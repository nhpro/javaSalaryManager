/**
 * Created by bigger on 11/8/16.
 */
public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String name, String address, String phone, String socialISN, double payRate, int hoursWorked) {
        super(name, address, phone, socialISN, payRate);
        this.hoursWorked = hoursWorked;
    }
    public void addHours(int hours) {
        this.hoursWorked += hours;
    }
    public double pay() {
        return super.pay()*hoursWorked;
    }

    public String toString() {
        return super.toString()+"\n工作小时数："+hoursWorked + "\n工资：$" + pay();
    }
}
