package Queue;
import java.util.*;

import java.util.Stack;

public class ImplementationOfQueueBy2Stack { 

    Stack<Integer> stack1;
    Stack<Integer> stack2;

public ImplementationOfQueueBy2Stack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

public void enqueue(int data) {
        stack1.push(data);
    }

public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public static void main(String[] args) {
        ImplementationOfQueueBy2Stack q = new ImplementationOfQueueBy2Stack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
