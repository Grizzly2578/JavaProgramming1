import java.util.ArrayList;
import java.util.Scanner;

public class July31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter Your First Name: ");
        list.add(input.nextLine());

        System.out.print("Enter Your Last Name: ");
        list.add(input.nextLine());

        System.out.print("Enter Your Program: ");
        list.add(input.nextLine());

        System.out.print("Enter Your Year Level: ");
        list.add(String.valueOf(input.nextInt()));
        input.nextLine();

        System.out.print("Enter Your School: ");
        list.add(input.nextLine());

//        System.out.println(list);

        System.out.println("\nHello "+list.get(0)+" "+list.get(1)+"\nThank you for choosing "+ list.get(2) +" at year level " +list.get(3) + " in "+list.get(4));

//        for (String i : list){
//            System.out.println(i);
//        }

        input.close();


    }
}
