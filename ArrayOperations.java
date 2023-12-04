import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create an integer array of size 10
        int[] numbers = {7, 2, 9, 1, 5, 4, 8, 3, 6, 10};

        // Find the maximum and minimum values
        int max = findMax(numbers);
        int min = findMin(numbers);

        // Sort the array
        Arrays.sort(numbers);

        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Print the maximum and minimum values
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }

    // Method to find the maximum value in an array
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the minimum value in an array
    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
