import java.util.HashMap;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 4, 4};
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (int key : frequency.keySet()) {
            if (frequency.get(key) > 1) {
                System.out.println("Element: " + key + ", Frequency: " + frequency.get(key));
            }
        }
    }
}
