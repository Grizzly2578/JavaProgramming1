package Oct14.PalindromePrinter;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter a word: ");
            String word = new java.util.Scanner(System.in).next();

            boolean isPalindrome = word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
            if (isPalindrome) {
                System.out.println("Palindrome: " + word);
            } else if (word.equals("stop")) {
                break;
            }
        }
    }
}
