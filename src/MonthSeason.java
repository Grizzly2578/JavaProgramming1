import java.util.Scanner;
public class MonthSeason {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = i.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                break;
        }
    }
}
