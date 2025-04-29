
/*Write a program that attempts to access an element at an invalid index in an array. 
Use a try-catch block to catch the ArrayIndexOutOfBoundsException and print a custom message such as "Invalid index access!".
*/
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 23, 34, 45, 56, 67, 78, 89 };
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        try {
            System.out.println("\nEnter index value to access element: ");
            int index = sc.nextInt();
            System.out.println("Element is: " + arr[index] + " at index " + index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index access! " + e.getMessage());
            // TODO: handle exception
        }
        sc.close();
    }
}
