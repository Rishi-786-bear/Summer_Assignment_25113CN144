// Write a program to find largest prime factor
import java.util.Scanner;

public class question20 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long largestPrimeFactor = 0;

        while (num % 2 == 0) {
            largestPrimeFactor = 2;
            num /= 2;
        }

        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                largestPrimeFactor = i;
                num /= i;
            }
        }

        if (num > 2) {
            largestPrimeFactor = num;
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
    
}
