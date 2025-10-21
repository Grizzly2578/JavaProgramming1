package Oct14.VowelSkipper;

public class Main {
    public static void main(String[] napkapogikotalagabro){
        while(true){
            System.out.print("Enter a character: ");
            char letter = new java.util.Scanner(System.in).next().charAt(0);
            if (Character.toLowerCase(letter) == 'a' || Character.toLowerCase(letter) == 'e' || Character.toLowerCase(letter) == 'i' || Character.toLowerCase(letter) == 'o' || Character.toLowerCase(letter) == 'u'){
                continue;
            }
            else if (Character.toLowerCase(letter) == 'x'){
                break;
            }
            System.out.println("Character: " + letter);
        }
    }
}
