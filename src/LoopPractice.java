import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args){
//        Scanner i = new Scanner(System.in);
//        System.out.print("Enter how many times to print Hello World: ");
//        int counter = 15;
//        for (int x = 35; x >= counter; x--){
//            System.out.println("Hello World "+x);
//        }
//        for (int counter = 35; counter >= 15; counter --){
//            System.out.println(counter);
//        }
        for (int x = 1; x <=25 ; x++){
            if (x %2 ==0){
                System.out.println(x);
            }
        }
        System.out.println("Loop done");
    }
}
