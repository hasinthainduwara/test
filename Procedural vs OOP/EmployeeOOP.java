// Employee Class
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to add bonus
    public void addBonus(double bonus) {
        this.salary += bonus;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Main Class
public class EmployeeOOP {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee(101, "Alice", 50000);
        Employee emp2 = new Employee(102, "Bob", 60000);
        Employee emp3 = new Employee(103, "Charlie", 70000);
        

        // Adding bonus and displaying details
        emp1.addBonus(5000);
        emp2.addBonus(5000);
        emp3.addBonus(5000);

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
