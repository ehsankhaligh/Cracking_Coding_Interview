class Node{
   
   int data;
   Node left, right;

   Node(int data){
     this.data = data;
   }
   
}
class BinaryTree{
   
   Node root;
   
   void InOrder(Node node){
   
      if(node==null){
        return;
      }
      
      InOrder(node.left);
      System.out.println(node.data);
      InOrder(node.right);
   
   }
   
   void preOrder(Node node){
     
      
      if(node==null){
        return;
      }
      
      System.out.println(node.data+ " ");
      preOrder(node.left);
      preOrder(node.right);

      
   }
   
   void postOrder(Node node){
   
     if(node == null)return;
     
     postOrder(node.left);
     postOrder(node.right);
     System.out.println(node.data+" ");
     
   }
   
   public static void main(String[] args){
    
      BinaryTree tree = new BinaryTree();
      
      tree.root = new Node(3);
      tree.root.left = new Node(2);
      tree.root.left.left = new Node(1);
      tree.root.right = new Node(4);
      
      tree.InOrder(tree.root);
      System.out.println("-------");
      tree.preOrder(tree.root);
      System.out.println("-------");
      tree.postOrder(tree.root);
   }
}


/*
 Preorder traversal of binary tree is 
 3 2 1 4 
 Inorder traversal of binary tree is 
 1 2 3 4 
 Postorder traversal of binary tree is 
 1 2 4 3 

*/