import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (num % divisor == 0) {
            System.out.println(num + " is divisible by " + divisor);
        } else {
            System.out.println(num + " is not divisible by " + divisor);
        }
    }
}
