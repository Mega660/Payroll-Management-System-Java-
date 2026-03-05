import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PayrollService service = new PayrollService();

        while (true) {
            System.out.println("\n=== Payroll Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Generate Payroll");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice;

            // Prevent crash if user enters text instead of number
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input.");
                scanner.next();
                continue;
            }

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation = scanner.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double salary = scanner.nextDouble();

                    service.addEmployee(
                            new Employee(id, name, designation, salary)
                    );
                }

                case 2 -> service.viewEmployees();

                case 3 -> {
                    System.out.print("Enter Employee ID: ");
                    service.generatePayroll(scanner.nextInt());
                }

                case 4 -> {
                    System.out.print("Enter Employee ID: ");
                    service.deleteEmployee(scanner.nextInt());
                }

                case 5 -> {
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}