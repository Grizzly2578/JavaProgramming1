import java.util.InputMismatchException;
import java.util.Scanner;

public class ActivityNila {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {

            System.out.print("Enter your first number: ");
            int num1 = input.nextInt();
            System.out.print("Enter your second number: ");
            int num2 = input.nextInt();

            if (num1>num2){
                System.out.println(num1+" is greater");
                
            } else if (num2>num1) {
                System.out.println(num2+" is greater");
            }
            else {
                System.out.println("The number is "+num1+" for they are equal.");

            }
        }
        catch (InputMismatchException e){
//            System.out.println(e);
            System.out.println("Error you must input an Integer");
        }



    }
}
