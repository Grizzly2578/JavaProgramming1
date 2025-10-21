import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        int digitalRoot = n;

        while (digitalRoot >= 10) {
            int sum = 0;
            while (digitalRoot > 0) {
                sum += digitalRoot % 10;
                digitalRoot /= 10;
            }
            digitalRoot = sum;
        }

        System.out.println("The digital root of " + n + " is " + digitalRoot);
    }
}

