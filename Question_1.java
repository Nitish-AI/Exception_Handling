
/*Q: Write a program that takes two numbers as input from the user and divides them. 
Use a try-catch block to handle the ArithmeticException if the user tries to divide by zero*/
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Divide\nEnter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        try {
            int result = num1 / num2;
            System.out.print("Result is: " + result);
        } catch (ArithmeticException e) { // catch block will handle arithmetic error
            // TODO: handle exception
            System.out.print("Cannot divide by zero!" + e.getMessage());
        }

        sc.close();
    }
}
