import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();
        int bill = 0;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = 500 + ((units - 100) * 7);
        } else if (units <= 300) {
            bill = 500 + 700 + ((units - 200) * 10);
        } else {
            bill = 500 + 700 + 1000 + ((units - 300) * 15);
        }

        System.out.println("Total bill: " + bill + " pesos");
        scanner.close();
    }
}
