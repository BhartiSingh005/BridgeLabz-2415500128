package HashmapHashFunctions;

import java.util.*;

public class PairSum {
    static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (set.contains(target - x))
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(hasPair(arr, target)); // true
    }
}