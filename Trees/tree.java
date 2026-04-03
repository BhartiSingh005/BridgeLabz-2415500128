package Trees;

class Node{

    int data;

    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class tree {
    
    public static void main(String[] args){
        //Level 0
        Node root = new Node(25);
       
        //Level 1
        root.left = new Node(10);
        root.right = new Node(35);

        //Level 2
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(30);
        root.right.right = new Node(40);

        //Level 3
        root.left.right.left = new Node(13);
        root.left.right.right = new Node(20);

    }
    
}
