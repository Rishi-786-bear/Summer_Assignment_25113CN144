//Write a program to Rotate array left. 
import java.util.Scanner;

public class question58 {
     public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Left rotate by one position
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        System.out.println("\nArray after Left Rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
