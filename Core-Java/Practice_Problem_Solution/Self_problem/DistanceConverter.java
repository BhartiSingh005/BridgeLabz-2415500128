// Write a program that takes the distance in kilometers as input from the user and converts it into miles using the formula: 
// Miles = Kilometers * 0.621371.
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
        sc.close();
    }
}
