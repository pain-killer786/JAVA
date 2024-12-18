/**
 * This program determines if a given integer is even or odd.
 * 
 * The program prompts the user to input an integer, then checks if the integer
 * is even or odd by using the modulus operator (%). If the integer is divisible
 * by 2 with no remainder, it is considered even; otherwise, it is considered odd.
 * 
 * The result is printed to the console.
 * 
 * Usage:
 * - Run the program.
 * - Enter an integer when prompted.
 * - The program will output whether the entered integer is even or odd.
 * 
 * Example:
 * Input: 4
 * Output: 4 is Even
 * 
 * Input: 7
 * Output: 7 is Odd
 * 
 * Note: There is a missing space in the output message between the number and
 * the "is Even" or "is Odd" text.
 */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

}
