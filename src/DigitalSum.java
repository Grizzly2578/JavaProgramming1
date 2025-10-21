import java.util.Scanner;
public class DigitalSum {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = i.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit from number
        }
        System.out.println("The digital sum is: " + sum);
    }
}
