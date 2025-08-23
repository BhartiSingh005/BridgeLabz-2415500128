// Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations    
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number2: ");
        double number2 = input.nextDouble();
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                           number1 + " and " + number2 + " is " +
                           (number1 + number2) + ", " + (number1 - number2) + ", " +
                           (number1 * number2) + ", " + (number1 / number2));
    }
}