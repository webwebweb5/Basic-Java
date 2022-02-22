import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        // declare variables
        int n, i, j, swap;
        Scanner input = new Scanner(System.in);

        System.out.println("Input number of integers to sort");
        n = input.nextInt();

        // declare array
        int array[] = new int[n];

        System.out.println("Enter " + n + " integers");

        // input n integers
        for (i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) // Ascending order
                {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");

        for (i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        input.close();

    }
}
