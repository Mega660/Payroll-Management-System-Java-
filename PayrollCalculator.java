public class PayrollCalculator {

    public static double calculateNetSalary(double basicSalary) {
        double tax = basicSalary * 0.10;      // 10% tax
        double pension = basicSalary * 0.05;  // 5% pension
        double bonus = basicSalary * 0.03;    // 3% bonus

        return basicSalary - tax - pension + bonus;
    }
}