import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter Triangle Side A: ");
        int a = i.nextInt();
        System.out.print("Enter Triangle Side B: ");
        int b = i.nextInt();
        System.out.print("Enter Triangle Side C: ");
        int c = i.nextInt();
        
        if (a +b <= c || a + c <= b || b+c <= a){
            System.out.println("Invalid.");
        } else if (a == b && b == c) {
            System.out.println("Equilateral.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isoceles.");
        } else {
            System.out.println("Scalene");
        }
    }
}
