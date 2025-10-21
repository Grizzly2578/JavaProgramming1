import java.util.Scanner;

public class DayOfTheWeekSwitch {
    public static  void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = i.nextInt();
        System.out.println(switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid input. Please enter a number between 1 and 7.";
        });
    }
}
