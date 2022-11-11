package Lesson_5;

    class Node
{
    int data;
    Node left, right;
 
    public Node(int key)
    {
        data = key;
        left = right = null;
    }
}
 
class Main
{
    
    public static void postorder(Node root)
    {
        if (root == null) {
            return;
        }
    
        postorder(root.left);
    
        postorder(root.right);
    
        System.out.print(root.data + " ");
    }
 
    public static void main(String[] args)
    {
        
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(9);
        root.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(11);
        root.right.right.right = new Node(20);
 
        postorder(root);
    }
}

    

