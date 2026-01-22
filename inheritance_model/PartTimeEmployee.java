package inheritance_model;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate * hoursWorked);
    }

    /* @Override
    public double calculateSalary() {
        return super.calculateSalary();
    } */
}
