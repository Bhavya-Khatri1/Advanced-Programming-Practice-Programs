// Base class
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name + ", Salary: " + salary);
    }
}

// Manager class derived from Employee
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

// SeniorManager derived from Manager
class SeniorManager extends Manager {
    int teamSize;

    SeniorManager(String name, double salary, String department, int teamSize) {
        super(name, salary, department);
        this.teamSize = teamSize;
    }

    void display() {
        super.display();
        System.out.println("Team Size: " + teamSize);
    }
}

// Class to test
public class EmployeeTest {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager("Bob", 120000, "IT", 10);
        sm.display();
    }
}