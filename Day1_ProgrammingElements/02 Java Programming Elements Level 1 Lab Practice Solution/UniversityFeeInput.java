// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount

import java.util.Scanner;
class UniversityFeeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = input.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}