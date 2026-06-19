//Write a program to Find duplicates in array
import java.util.Scanner;

public class question56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean isDuplicatePrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicatePrinted = true;
                    break;
                }
            }

            if (isDuplicatePrinted) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}
