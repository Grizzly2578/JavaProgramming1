package Oct14.CharacterRepeater;

public class Main {
    public static void main(String[] napakapogikotalaga){
        while (true){
            System.out.print("Enter a character: ");
            char letter = new java.util.Scanner(System.in).next().charAt(0);
            if (letter == 'q' || letter == 'Q'){
                System.out.println("Loop ended!");
                break;
            }
        }
    }
}
