// Interface for Prime Features
interface PrimeFeatures {
    void showPrimeBenefits();
}

// Base class
class User {
    String name;
    String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void display() {
        System.out.println("Name: " + name + ", Email: " + email);
    }
}

// Customer subclass
class Customer extends User {
    Customer(String name, String email) {
        super(name, email);
    }
}

// Seller subclass
class Seller extends User {
    Seller(String name, String email) {
        super(name, email);
    }
}

// PrimeCustomer subclass inherits Customer and implements PrimeFeatures
class PrimeCustomer extends Customer implements PrimeFeatures {
    PrimeCustomer(String name, String email) {
        super(name, email);
    }

    public void showPrimeBenefits() {
        System.out.println(name + " gets free delivery and discounts!");
    }
}

// Class to test
public class UserTest {
    public static void main(String[] args) {
        PrimeCustomer pc = new PrimeCustomer("Alice", "alice@email.com");
        pc.display();
        pc.showPrimeBenefits();
    }
}