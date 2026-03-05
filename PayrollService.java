import java.util.ArrayList;
import java.util.List;

public class PayrollService {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {

        // Prevent duplicate ID
        for (Employee e : employees) {
            if (e.getId() == emp.getId()) {
                System.out.println("Error: Employee ID already exists.");
                return;
            }
        }

        employees.add(emp);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee e : employees) {
            System.out.println(
                "ID: " + e.getId() +
                ", Name: " + e.getName() +
                ", Designation: " + e.getDesignation() +
                ", Basic Salary: " + e.getBasicSalary()
            );
        }
    }

    public void generatePayroll(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {

                double netSalary =
                        PayrollCalculator.calculateNetSalary(e.getBasicSalary());

                System.out.println("\n--- Salary Slip ---");
                System.out.println("Employee ID: " + e.getId());
                System.out.println("Name: " + e.getName());
                System.out.println("Designation: " + e.getDesignation());
                System.out.println("Basic Salary: " + e.getBasicSalary());
                System.out.println("Net Salary: " + netSalary);
                return;
            }
        }

        System.out.println("Employee not found.");
    }

    public void deleteEmployee(int id) {

        boolean removed = employees.removeIf(e -> e.getId() == id);

        if (removed) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}