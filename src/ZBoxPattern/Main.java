package ZBoxPattern;

public class Main {
    public static void main(String[] angpogikoparin){
        System.out.print("Enter the size of the box: ");
        int size = new java.util.Scanner(System.in).nextInt();

        for (int x = 1; x <=size; x++){
            for(int y = 1; y <= size; y++){
                System.out.print("z ");
            }
            System.out.println();
        }
    }
}
