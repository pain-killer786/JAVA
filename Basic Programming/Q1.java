/**
 * This program reads an integer input from the user and determines whether the number is positive, negative, or zero.
 * It then prints the result to the console.
 * 
 * The program performs the following steps:
 * 1. Reads an integer input from the user.
 * 2. Checks if the number is greater than zero, less than zero, or equal to zero.
 * 3. Prints a message indicating whether the number is positive, negative, or zero.
 * 
 * Usage:
 * - Run the program.
 * - Enter an integer when prompted.
 * - The program will output whether the entered number is positive, negative, or zero.
 * 
 * Example:
 * Input: 5
 * Output: The number is positive: 5
 * 
 * Input: -3
 * Output: The number is negative: -3
 * 
 * Input: 0
 * Output: Zero
 * 
 * Note: This program uses the Scanner class to read input from the console.
 */

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is positive: " + num);
        } else if (num < 0) {
            System.out.println("The number is negative: " + num);
        } else {
            System.out.println("Zero");
        }
    }
}
