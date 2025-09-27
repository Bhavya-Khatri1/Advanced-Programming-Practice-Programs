class BillingCounter {

    // Generate bill for 2 items
    void generateBill(double item1, double item2) {
        double total = item1 + item2;
        System.out.println("Bill for 2 items: " + total);
    }

    // Generate bill for 3 items
    void generateBill(double item1, double item2, double item3) {
        double total = item1 + item2 + item3;
        System.out.println("Bill for 3 items: " + total);
    }

    // Generate bill for 4 items
    void generateBill(double item1, double item2, double item3, double item4) {
        double total = item1 + item2 + item3 + item4;
        System.out.println("Bill for 4 items: " + total);
    }
}

public class BillingCounterTest {
    public static void main(String[] args) {
        BillingCounter counter = new BillingCounter();

        counter.generateBill(100, 200);                  // 2 items
        counter.generateBill(50, 70, 80);                // 3 items
        counter.generateBill(10, 20, 30, 40);           // 4 items
    }
}