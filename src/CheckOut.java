import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double totalCost = 0.0;
        boolean moreItems = true;

        while (moreItems) {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 to $10.00)", 0.50, 10.00);
            totalCost += itemPrice;

            boolean continueShopping = SafeInput.getYNConfirm(in, "Do you have more items to add (Y/N)?");
            moreItems = continueShopping;
        }

        System.out.printf("Total cost of items: $%.2f%n", totalCost);
    }
}
