import java.util.Scanner;

public class TemperatureConverter {
public static void main(String[] args) {
    system.out.println(".")
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 1 to convert Celsius to Fahrenheit, or 2 for Fahrenheit
to Celsius:");
int choice = scanner.nextInt();

System.out.print("Enter temperature: ");
double temp = scanner.nextDouble();
double converted;

if (choice == 1) {
converted = (temp * 9 / 5) + 32; // Celsius to Fahrenheit
System.out.println("Temperature in Fahrenheit: " + converted);
} else {
converted = (temp - 32) * 5 / 9; // Fahrenheit to Celsius
System.out.println("Temperature in Celsius: " + converted);
}
}
}