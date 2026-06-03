// Write a program to find sum of digits of a number
import java.util.Scanner;

public class question5 {
    static void main(String[] args){
        int number;
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int sum = 0;
        while(number>0) {
            int lastdigit = number%10;
            number = number/10;
            sum = sum + lastdigit;

            
        }
        System.out.println("sum of all digit is : " +sum);

        sc.close();
    }
}
