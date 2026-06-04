// Write a program to Find nth Fibonacci term
import java.util.Scanner;

public class question14 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, fib = 0;

        if (n == 1) {
            fib = 0;
        } else if (n == 2) {
            fib = 1;
        } else {
            for (int i = 3; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }
        }

        System.out.println("The " + n + "th Fibonacci term is: " + fib);

        sc.close();
    }
    
}
