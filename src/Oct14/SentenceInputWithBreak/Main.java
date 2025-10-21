package Oct14.SentenceInputWithBreak;

public class Main {
    public static void main(String[] sheeesh){
        String sentence = "";
        while(true) {
            System.out.print("Enter a character: ");
            char letter = new java.util.Scanner(System.in).next().charAt(0);
            if (letter!= '!'){
                sentence += letter;
            } else {
                sentence += letter;
                break;
            }
        }
        System.out.println("Entered sequence: " + sentence);
    }
}
