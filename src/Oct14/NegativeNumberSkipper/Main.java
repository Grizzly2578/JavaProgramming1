package Oct14.NegativeNumberSkipper;

public class Main {
    public static void main(String[] sheeeshpreiii){
        while (true){
            System.out.print("Enter a number: ");
            int number = new java.util.Scanner(System.in).nextInt();
            if (number < 0){
                continue;
            } else if (number == 0) {
                break;
            }
            System.out.println("Number: " + number);

        }
    }
}
