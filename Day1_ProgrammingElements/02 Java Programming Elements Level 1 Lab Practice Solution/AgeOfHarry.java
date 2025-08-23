// Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
class AgeOfHarry {
    public static void main(String[] args) {
        int birthYear = 2000, currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
