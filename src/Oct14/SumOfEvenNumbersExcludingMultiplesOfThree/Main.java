package Oct14.SumOfEvenNumbersExcludingMultiplesOfThree;

public class Main {
    public static void main(String[] args){
        System.out.print("Enter a positive integer: ");
        int n = new java.util.Scanner(System.in).nextInt();

        int sum = 0;
        for (int x = 1; x <= n; x++) {
            if (x % 2 != 0 || x % 3 == 0) {
                continue;
            }
            sum += x;
        }
        System.out.println("The sum of even numbers: " + sum);
    }
}
