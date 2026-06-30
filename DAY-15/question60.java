//Write a program to Move zeroes to end. 
import java.util.Scanner;

public class question60 {
     public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Move zeroes to the end
        int index = 0;

        // Place all non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining positions with zeroes
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("\nArray after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
