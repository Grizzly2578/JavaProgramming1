import java.util.Scanner;

public class LoopStatements {
    public static void counter_contolled_loop(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter;
        int sum = 0;

        System.out.print("Enter the number of values to sum: ");
        counter = input.nextInt();

        for (int i = 0; i < counter; i++) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            sum += number;
        }

        System.out.println("The sum is: " + sum);
        input.close();
    }

    public static void sentinelLoop(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        final int SENTINEL = -1; // Define the sentinel value

        System.out.print("Enter a number (or -1 to quit): ");
        number = input.nextInt();

        while (number != SENTINEL) {
            sum += number;
            System.out.print("Enter a number (or -1 to quit): ");
            number = input.nextInt();
        }

        System.out.println("The sum is: " + sum);
        input.close();
    }
    public static void main(String[] args) {
        // Uncomment one of the following lines to test the respective loop
         counter_contolled_loop(args);
//        sentinelLoop(args);
    }
}
