//Write a program to Rotate array right.
import java.util.Scanner;

public class question59 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Right rotate by one position
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        System.out.println("\nArray after Right Rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
