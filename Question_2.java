import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 100;

        try {
            System.out.print("Enter a integer number to divide 100: ");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Cannot divide by zero! " + e.getMessage());
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println("Please enter valid integer. " + e.getMessage());
        }
        sc.close();
    }
}
