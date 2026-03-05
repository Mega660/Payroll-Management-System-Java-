public class Employee {

    private int id;
    private String name;
    private String designation;
    private double basicSalary;

    public Employee(int id, String name, String designation, double basicSalary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}