package inheritance_model;

public class FullTimeEmployee extends Employee {
    double bonus;
    
    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary() {
        // Returns baseSalary (from Employee) + bonus
        return baseSalary + bonus;
    }
}

