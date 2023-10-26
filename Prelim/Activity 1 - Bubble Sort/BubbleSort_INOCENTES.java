import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort_INOCENTES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ArrayOfNum = new int[5];

        // Input five integers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            ArrayOfNum[i] = scanner.nextInt();
        }

        // Sort in ascending order / descending order
        bubbleSortAscending(ArrayOfNum);
        System.out.println("Sorted in ascending order: " + Arrays.toString(ArrayOfNum));

        bubbleSortDescending(ArrayOfNum);
        System.out.println("Sorted in descending order: " + Arrays.toString(ArrayOfNum));
    }

    // Method to sort using Bubble Sort in ascending order
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    // Method to sort using Bubble Sort in descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - pass - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}

