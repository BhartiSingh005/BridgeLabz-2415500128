package HashmapHashFunctions;

import java.util.*;

public class LongestConsecutive {
    static int longest(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;

        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int current = n;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longest(nums)); // 4
    }
}
