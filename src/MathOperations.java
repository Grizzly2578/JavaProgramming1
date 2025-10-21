import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        // Find the square of an integer
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to square: ");
        num = in.nextInt();
        System.out.println("The square of the number is: "+num*num);
    }
}
