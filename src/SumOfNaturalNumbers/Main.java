package SumOfNaturalNumbers;

public class Main {
    public static void main(String[] napakapogikotalaga){
        System.out.print("Enter a number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        int i = 1;
        int sum = 0;
        while (i <= number){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum from 1 to "+number+" is: "+sum);
    }
}
