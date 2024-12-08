import java.util.Scanner;

// Class definition with instance variable and method
class Commission {
    private double sales;

    // Parameterized constructor to initialize sales
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate commission based on sales amount
    public double commission() {
        if (sales >= 10000) {
            return sales * 0.1; // 10% commission
        } else if (sales >= 5000) {
            return sales * 0.07; // 7% commission
        } else {
            return sales * 0.05; // 5% commission
        }
    }
}

// Demo class to test Commission class
public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object and calculate commission
            Commission commissionObj = new Commission(sales);
            double commission = commissionObj.commission();
            System.out.println("Commission earned: " + commission);
        }
    }
}
