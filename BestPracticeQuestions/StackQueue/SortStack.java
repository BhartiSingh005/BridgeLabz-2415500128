package StackQueue;

import java.util.*;

public class SortStack {

    static void insert(Stack<Integer> s, int x) {
        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        insert(s, x);
        s.push(temp);
    }

    static void sort(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            insert(s, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);

        sort(s);

        System.out.println(s); // [1, 2, 3, 4]
    }
}
