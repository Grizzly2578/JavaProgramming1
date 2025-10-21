package Oct14.PasswordStrengthChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] angpogikotalgapri){
        Scanner i = new Scanner(System.in);

        while (true){
            System.out.print("Enter a password: ");
            String password = i.nextLine();
            char[] passwordArray = password.toCharArray();
            int uppercase = 0;
            int lowercase = 0;
            int digits = 0;
            int special = 0;
            for (char letter: passwordArray) {
                if (Character.isUpperCase(letter)){
                    uppercase ++;
                } else if (Character.isLowerCase(letter)) {
                    lowercase ++;
                } else if (Character.isDigit(letter)) {
                    digits ++;
                } else if (!Character.isLetterOrDigit(letter)) {
                    special ++;
                }
            }
            if (uppercase >= 1 && lowercase >=1 && digits >=1 && special >=1){
                System.out.println("Password stremgth confirmed!");
                break;
            }
            else {
                System.out.println("Weak password. Please try again.");
            }
        }

    }
}
