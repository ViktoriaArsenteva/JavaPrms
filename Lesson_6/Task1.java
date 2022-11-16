package Lesson_6;

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
    
    public static void preorder(Node root)
    {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void print(Node root) {
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }
    public static Node createTree() {
            //         1
            //        /   \
            //       2      3
            //      /     /   \
            //     4     5     6
            //   /   \        / \
            //  7     9     11   20
        
 
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
            return root;
        
    }
    
 
    public static void main(String[] args)
    {
        Node root = createTree();

        print(root);
    }
}


