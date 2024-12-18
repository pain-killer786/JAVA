/**
 * This program calculates and prints the cumulative sum of numbers from 1 to a user-provided number.
 * 
 * The user is prompted to enter a number, and the program then calculates the sum of all numbers 
 * from 1 to that number, printing the intermediate sums at each step.
 * 
 * The program uses a Scanner to read the user input and a for loop to calculate the sum.
 * 
 * Steps:
 * 1. Prompt the user to enter a number.
 * 2. Read the number from the user input.
 * 3. Initialize a variable to store the sum.
 * 4. Use a for loop to iterate from 1 to the entered number.
 * 5. In each iteration, add the current number to the sum and print the intermediate sum.
 * 
 * Example:
 * If the user enters 5, the output will be:
 * Sum of first 1 numbers is: 1
 * Sum of first 2 numbers is: 3
 * Sum of first 3 numbers is: 6
 * Sum of first 4 numbers is: 10
 * Sum of first 5 numbers is: 15
 * 
 * Note: The program assumes that the user will enter a valid integer.
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int sum = 0;

        for (int i=1;i<=num;i++){
            sum+=i;
            System.out.println("Sum of first "+i+" numbers is: "+sum);
        }
    }
}
