public interface Salary {

    double salaryToPay_Temurov77503(double hours_77503, double rate_77503);

    default double salaryForOvertime_Temurov77503(double overtimeHours_77503, double overtimeRate_77503) {
        return overtimeHours_77503 * overtimeRate_77503 * 1.5; // 1.5x pay for overtime
    }

    static boolean shouldReceiveBonus_Temurov77503(int yearsOfExperience_77503) {
        return yearsOfExperience_77503 >= 5;
    }
}