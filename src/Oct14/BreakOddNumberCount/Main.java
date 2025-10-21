package Oct14.BreakOddNumberCount;

public class Main {
    public static void main(String[] napakapogikopre){
        System.out.print("Enter a number: ");
        int n = new java.util.Scanner(System.in).nextInt();
        for (int x = 1; x <= n; x++){
            if (x % 2 != 0){
                if (x == 13){
                    System.out.println("\nEncountered 13.");
                    System.out.println("Breaking out of the loop.");
                    break;
                }
                System.out.print(x+" ");
            }
        }
    }
}
