package Queue.circularqueueUsingSinglyLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

6
public class CircularQueue {
    Node front;
    Node rear;

    void enqueue(int val){
        Node newnode=new Node(val);

        if(front==null){
            front=newnode;
            rear=newnode;
            rear.next=front;
            return;
        }
        rear.next=newnode;
        rear=newnode;
        rear.next=front;
    }

    void dequeue(){
        if(front==null){
            return;
        }
        if(front==rear){
            front=null;
            rear=null;
            return;
        }
        front=front.next;
        rear.next=front;
    }
    void display(){
        Node temp=front;
        if(front==null){
            return;
        }
        while(temp.next!=front){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args){
        CircularQueue cq=new CircularQueue();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();
        System.out.println();
        cq.dequeue();
        cq.display();
        System.out.println();
        cq.enqueue(10);
        cq.display();
    }
}
