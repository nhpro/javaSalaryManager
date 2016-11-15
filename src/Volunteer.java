/**
 * Created by bigger on 11/8/16.
 */
public class Volunteer extends StaffMember {
    public Volunteer(String name, String address, String phone) {
        super(name, address, phone);
    }
    @Override
    public double pay() {
        return 0;
    }
    public String toString() {
        return super.toString() + "\n多谢！";
    }
}
