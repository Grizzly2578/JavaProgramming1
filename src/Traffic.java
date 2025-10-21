import java.util.Scanner;
public class Traffic {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the traffic level: ");
        String traffic = i.nextLine();

        switch (traffic) {
            case "Clear":
                System.out.println("Suggestion: Smooth driving");
                break;
            case "Moderate":
                System.out.println("Suggestion: Plan for some Delays");
                break;
            case "Heavy":
                System.out.println("Suggestion: Consider alternate routes");
                break;
            default:
                System.out.println("Invalid traffic level.");
                break;
        }


    }
}
