package HashmapHashFunctions;

import java.util.*;

public class ZeroSumSubarray {
    static boolean hasZeroSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int x : arr) {
            sum += x;

            if (sum == 0 || set.contains(sum))
                return true;

            set.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        System.out.println(hasZeroSum(arr)); // true
    }
}
