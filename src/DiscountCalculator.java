import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String[] args){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: ");
        double purchase = i.nextDouble();

        System.out.println("Total Amount: $" + purchase);
        if (purchase >= 500 ){
            System.out.println("Discount: $"+ String.format("%.2f",(purchase * 0.20)));
        } else if (200<= purchase && purchase <= 499) {
            System.out.println("Discount: $"+ String.format("%.2f",(purchase * 0.10)));
        }
    }
}
