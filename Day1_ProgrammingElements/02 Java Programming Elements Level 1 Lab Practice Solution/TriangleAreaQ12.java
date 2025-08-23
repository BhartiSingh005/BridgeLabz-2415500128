import java.util.Scanner;
class TriangleAreaQ12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaInch2 = areaCm2 / (2.54 * 2.54);
        System.out.println("The area of triangle is " + areaCm2 + " cm² and " + areaInch2 + " in²");
    }
}