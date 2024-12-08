import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal representation: " + decimal);

        // Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNum = scanner.nextInt();
        String binaryNum = Integer.toBinaryString(decimalNum);
        System.out.println("Binary representation: " + binaryNum);
    }
}
