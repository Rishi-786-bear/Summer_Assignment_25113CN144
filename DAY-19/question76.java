//Write a program to Find diagonal sum. 
import java.util.Scanner;
public class question76 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Sum of primary diagonal elements
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);

        sc.close();
    }
    
}
