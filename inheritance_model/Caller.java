package inheritance_model;

public class Caller {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee(1, "Aidan Hoo", 50000.0, 1000.0);
        employees[1] = new PartTimeEmployee(2, "John Doe", 20.0, 80);
        
        for (Employee employee : employees) {   
            employee.displayInfo();
            System.out.println("-----" );
        }
    }
}