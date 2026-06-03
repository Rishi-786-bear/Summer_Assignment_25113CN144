// write a program to reverse a number
import java.util.Scanner;

public class question6 {
    static void main(String[] args){
        int number;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        int answer = 0;
        while(number > 0){
            int lastdigit = number % 10;
            answer = answer * 10 + lastdigit;
            number = number / 10;

            System.out.println("Reverse number : " + answer);

          sc.close();
        }
    }

}
