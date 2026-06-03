//Write a program to print multiplication table of given number
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
    int number;
    {
        System.out.println("Multiplication table of" );
        Scanner sc = new Scanner(System.in);
         number = sc.nextInt(); 
        for (int i = 0; i <= 10; i ++)
            System.out.println(number + " * " + i + " = " + (number * i) );
        sc.close();
        }
        
    }
    }
    


