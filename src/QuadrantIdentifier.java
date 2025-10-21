import java.util.Scanner;
public class QuadrantIdentifier {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the x-coordinate: ");
        int x = i.nextInt();
        System.out.print("Enter the y-coordinate: ");
        int y = i.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant 1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Quadrant 2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Quadrant 3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Quadrant 4");
        }
    }
}
