/*Write a program that takes a string from the user and tries to convert it into an integer. 
Use a try-catch block to handle NumberFormatException and print "Invalid number format" if an error occurs*/

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter string: ");
            String str = sc.next();
            int num = Integer.parseInt(str);
            System.out.println("Entered string converted into integer. " + num);
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Invalid number format. " + e.getMessage());
        }
        sc.close();
    }
}
