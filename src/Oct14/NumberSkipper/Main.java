package Oct14.NumberSkipper;

public class Main {
    public static void main(String[] napkapogikotalagabro){
        System.out.print("Enter a number: ");
        int number = new java.util.Scanner(System.in).nextInt();
        for (int x = 1; x <= number; x++){

            if (String.valueOf(x).contains("7")){
                continue;
            }
            System.out.print(x + " ");
        }
    }
}
