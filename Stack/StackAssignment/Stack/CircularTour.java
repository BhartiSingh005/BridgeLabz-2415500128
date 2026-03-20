package Stacks_Queues;

public class CircularTour {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = findStart(petrol, distance);
        System.out.println("Starting point: " + start);
    }

    static int findStart(int[] petrol, int[] distance) {
        int n = petrol.length;
        int start = 0, deficit = 0, capacity = 0;

        for (int i = 0; i < n; i++) {
            capacity += petrol[i] - distance[i];
            if (capacity < 0) {
                start = i + 1;
                deficit += capacity;
                capacity = 0;
            }
        }
        return (capacity + deficit >= 0) ? start : -1;
    }
}
