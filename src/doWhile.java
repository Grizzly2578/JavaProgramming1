import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("Factors of " + number + ": ");

        int i = 1; // Initialize the counter for checking factors
        do {
            if (number % i == 0) { // Check if 'i' divides 'number' without a remainder
                System.out.print(i + " "); // If it's a factor, print it
            }
            i++; // Increment the counter
        } while (i <= number); // Continue the loop as long as 'i' is less than or equal to 'number'

        input.close(); // Close the scanner
    }
}