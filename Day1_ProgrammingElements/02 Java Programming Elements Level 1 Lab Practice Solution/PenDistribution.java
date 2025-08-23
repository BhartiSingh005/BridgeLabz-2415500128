// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens
// each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
class PenDistribution {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int penPerStudent = pens / students;
        int remainingPens = pens % students;
        System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}