package StackQueue;

import java.util.*;

public class SlidingWindowMax {
    static void maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!dq.isEmpty() && dq.peek() == i - k)
                dq.poll();

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offer(i);

            if (i >= k - 1)
                System.out.print(arr[dq.peek()] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        maxSlidingWindow(arr, k);
        // Output: 3 3 5 5 6 7
    }
}
