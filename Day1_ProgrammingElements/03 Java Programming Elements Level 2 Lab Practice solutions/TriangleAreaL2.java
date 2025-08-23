// Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 

import java.util.Scanner;
class TriangleAreaL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInch2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaCm2
                + " and in sq inches is " + areaInch2);
    }
}
