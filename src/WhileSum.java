import java.util.Scanner;

public class WhileSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        int sum = 0;
        int number = 1;
        while (number <= upperLimit) {
            sum += number;
            number++;
        }
        System.out.println("The sum of the numbers from 1 to " + upperLimit + " is: " + sum);
    }
}
