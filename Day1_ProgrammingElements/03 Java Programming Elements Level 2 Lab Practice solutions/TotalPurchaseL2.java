// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
import java.util.Scanner;
class TotalPurchaseL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Unit Price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice
                + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
