// Write a program to calculate sum of first N natural number in java

import java.util.Scanner ;

public class question1 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Sum = " + sum);

        sc.close();
        }

    }

