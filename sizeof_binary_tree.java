import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int d){
        data=d;
    }
}
public class sizeof_binary_tree {
    static Scanner sc=null;
    static Node create(){
        Node root=null;
        System.out.println("Enter the data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter left node of "+ data);
        root.left=create();
        System.out.println("Enter right node of "+data);
        root.right=create();

        return root;
        
    }
    static int size(Node root){
        if(root==null){
            return 0;
        }
        return size(root.left)+size(root.right)+1;

    }


    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=create();
        int h=size(root);
        System.out.println("The size of tree is "+h);

    }
    
    
}
