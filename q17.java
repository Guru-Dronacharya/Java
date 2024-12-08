import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM is: " + max);
                break;
            }
            max++;
        }
    }
}
