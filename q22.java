import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        double median;
        if (n % 2 == 0) {
            median = (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            median = arr[n/2];
        }
        System.out.println("Median: " + median);
    }
}
