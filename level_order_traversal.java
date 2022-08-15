import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int d){
        data=d;
    }
}

public class level_order_traversal {
    static Scanner sc=null;
    static Node create(){
        Node root=null;
        System.out.println("Enter the data");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("Enter the left node of "+data);
        root.left=create();
        System.out.println("Enter the right node of "+data);
        root.right=create();

        return root;
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }

    static void level_order(Node root,int level){
        if(root==null){
            return ;
        }
        if(level==1){
            System.out.print(root.data+" ");
        }
        if(level>1){
            level_order(root.left,level-1);
            level_order(root.right,level-1);
            
        }
    }
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node root;
        root=create();
        int h=height(root);
        for(int i=1;i<=h;i++){
            level_order(root,i);
        }
        
    }
    
}
