// Base class
class Bank {
    double interestRate = 5.0;

    void displayRate() {
        System.out.println("Bank Interest Rate: " + interestRate + "%");
    }
}

// Subclass SBI
class SBI extends Bank {
    double interestRate = 6.5; // own rate

    void displayRate() {
        System.out.println("SBI Interest Rate: " + interestRate + "%");
        System.out.println("Parent Bank Rate using super: " + super.interestRate + "%");
    }
}

// Class to test
public class BankTest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.displayRate();
    }
}