package Queue;

public class QueueImplementationUsingList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node front, rear;

        Queue() {
            this.front = this.rear = null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = front.data;
            front = front.next;
            if (front == null) rear = null;
            return data;
        }

        void printQueue() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();
        System.out.println("Dequeued: " + q.dequeue());
        q.printQueue();
    }
}
