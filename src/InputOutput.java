import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        int num1,num2,num3,num4;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = input.nextInt();
        System.out.print("Enter Fourth Number: ");
        num4 = input.nextInt();
        System.out.println("The average of all the numbers is: "+(num1+num2+num3+num4)/4);
    }
}
