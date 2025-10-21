import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = i.nextInt();

        if (age <= 12) {
            System.out.println("Child.");
        } else if (age <= 19){
            System.out.println("Teenager.");
        } else if (age <= 59) {
            System.out.println("Adult.");
        }
        else {
            System.out.println("Senior.");
        }
    }
}
