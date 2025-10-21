import java.util.Scanner;

public class TakeStudentNumericalGradeAsInput {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();

        if (grade>80){
            System.out.println("Very Good");
        } else if (grade < 60) {
            System.out.println("Poor");
        } else if (grade>60||grade<79) {
            System.out.println("Good");
        }
    }
}
