package RaiseTheFlag;

public class Main {
    public static void main(String[] angpogikotalaga){
        System.out.print("Enter a number: ");
        int n = new java.util.Scanner(System.in).nextInt();

        for (int x = 1; x < n+1; x++){
            // up left side
            for (int y = 0; y <x; y++) {
                System.out.print("*");
            }
            for (int space = n; space > x; space--) {
                System.out.print(" ");
            }

            //right side
            for (int space = n; space > x; space--) {
                System.out.print(" ");
            }
            for (int y = 0; y <x; y++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int x = n; x >= 1; x--){
            // up left side
            for (int y = 0; y <x; y++) {
                System.out.print("*");
            }
            for (int y = n; y > x; y--) {
                System.out.print(" ");
            }

            //right side
            for (int y = n; y > x; y--) {
                System.out.print(" ");
            }
            for (int y = 0; y <x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
