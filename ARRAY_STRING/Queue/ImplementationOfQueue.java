package Queue;
import java.util.*;

public class ImplementationOfQueue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int front = 0;
        int rear = 0;
        list.add(rear++,3);
        list.add(rear++,5);
        list.add(rear++, 7);
        System.out.println(list);
        list.remove(front);
        list.remove(front);
        System.out.println(list);
    }
}

