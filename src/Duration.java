import java.util.Scanner;
public class Duration {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        int hour0,minute0,second0,hour1,minute1, second1, total_time0, total_time1, total_time;

        System.out.print("Enter the initial hour: ");
        hour0 = i.nextInt();
        System.out.print("Enter the initial minute: ");
        minute0  = i.nextInt();
        System.out.print("Enter the initial second: ");
        second0  = i.nextInt();

        System.out.print("Enter the final hour: ");
        hour1  = i.nextInt();
        System.out.print("Enter the final minute: ");
        minute1 = i.nextInt();
        System.out.print("Enter the final second: ");
        second1  = i.nextInt();

        if (hour1<hour0 || (hour1==hour0 && minute1<minute0) || (hour1==hour0 && minute1==minute0 && second1<second0)){
            System.out.println("Error invalid input.");
            return;
        }

        total_time0 = (hour0*3600) + (minute0*60)+ second0;
        total_time1 = (hour1*3600) + (minute1*60)+ second1;

        total_time = total_time1-total_time0;

        int total_hours = total_time / 3600;
        int total_minutes = (total_time % 3600) / 60;
        int total_seconds = total_time % 60;

        System.out.println("Hours : " + total_hours);
        System.out.println("Minutes : " + total_minutes);
        System.out.println("Seconds : " + total_seconds);
    }
}
