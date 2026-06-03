// Write a program to count digit in a number
import java.util.Scanner;

public class question4 {
    public static void main(String[] args)
    {
        int number;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int count = 0;
        while(number!=0) {
            number = number/10;
            count++;
        }
        System.out.println("Number of digits: " + count );
        sc.close();

    }
    
}
