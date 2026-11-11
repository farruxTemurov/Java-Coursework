public class Task1M {
    public static void main(String[] args) {
        Staff staffMember = new Staff();

        staffMember.initialize1();

        staffMember.print1();
        double regularSalary = staffMember.salaryToPay_Temurov77503(160, 45.0);
        System.out.println("Regular Salary: $" + regularSalary);

        double overtimeSalary = staffMember.salaryForOvertime_Temurov77503(10, 45.0);
        System.out.println("Overtime Salary: $" + overtimeSalary);

        boolean receivesBonus = Salary.shouldReceiveBonus_Temurov77503(staffMember.getYearsOfExperience());
        System.out.println("Experience: " + staffMember.getYearsOfExperience() + " years -> Bonus Eligible? " + receivesBonus);
    }
}