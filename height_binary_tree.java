import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int d){
        data=d;
    }
}
public class height_binary_tree {
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
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root=create();
        int h=height(root);
        System.out.println("The height of tree is "+h);

    }
    
}

    

