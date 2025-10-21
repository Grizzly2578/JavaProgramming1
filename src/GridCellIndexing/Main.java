package GridCellIndexing;

import java.util.Scanner;

public class Main {
    public static void main(String[] napakapogikotalaga){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = i.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = i.nextInt();

        for (int x = 1; x <= rows; x++){
            for (int y = 1; y <= columns; y++){
                System.out.println("Row: "+x+", Column: "+y);
            }
        }
    }
}
