// Parent class
class Bank {
    double rateOfInterest() {
        return 0; // default rate
    }
}

// Subclasses
class SBI extends Bank {
    @Override
    double rateOfInterest() {
        return 6.5;
    }
}

class ICICI extends Bank {
    @Override
    double rateOfInterest() {
        return 7.0;
    }
}

class HDFC extends Bank {
    @Override
    double rateOfInterest() {
        return 6.8;
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new ICICI();
        Bank b3 = new HDFC();

        System.out.println("SBI Rate: " + b1.rateOfInterest() + "%");
        System.out.println("ICICI Rate: " + b2.rateOfInterest() + "%");
        System.out.println("HDFC Rate: " + b3.rateOfInterest() + "%");
    }
}