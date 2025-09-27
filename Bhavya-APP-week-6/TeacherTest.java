// Base class
class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Subject: " + subject);
    }
}

// Derived class
class MathTeacher extends Teacher {
    int numberOfClasses;

    MathTeacher(String name, String subject, int numberOfClasses) {
        super(name, subject); // call base constructor
        this.numberOfClasses = numberOfClasses;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Classes: " + numberOfClasses);
    }
}

// Class to test
public class TeacherTest {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher("Alice", "Math", 5);
        mt.displayDetails();
    }
}