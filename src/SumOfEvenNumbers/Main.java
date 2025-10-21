package SumOfEvenNumbers;

public class Main {
    public static void main(String[] napakapogikotalaga){
        System.out.print("Enter a positive integer: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int i = 1;
        int sum = 0;
        while (i <= number){
            if (i % 2 == 0){
            sum = sum +i;
            }
            i++;
        }
        System.out.println("Sum of even numbers: "+sum);
    }
}
