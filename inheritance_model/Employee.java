package inheritance_model;

public abstract class Employee {
    String name;
    int id;
    double baseSalary;
    
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return this.baseSalary;
    }

    public void displayInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + calculateSalary());
    }
}
