/**
 * Created by bigger on 11/8/16.
 */

public class Staff {
    private StaffMember[] staffList;

    public static void main(String[] args){
        Staff test = new Staff();
        test.payDetail();

    }


    public Staff() {
        staffList = new StaffMember[6];
        staffList[0] = new Manager("Sam", "123 Main Line", "55-0469", "123-45-6789", 2423.07, 500);
        staffList[1] = new Employee("Peter", "456 OffLine", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee("Marry", "789 OffRocker", "555-0690", "010-20-3040", 1169.23);
        staffList[3] = new Hourly("Cliff", "678 Fifth Ave.", "555-0000", "958-47-3625", 10.55, 40);
        staffList[4] = new Volunteer("Al", "987 Suds Ave.", "555-8374");
        staffList[5] = new Volunteer("Gus", "321 Off Line", "555-7282");
    }
    public void payDetail() {
        for (int i=0; i<6; i++) {
            System.out.println(staffList[i]);
            System.out.println("-----------------------------------------");
        }
    }
}
