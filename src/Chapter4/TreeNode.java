package Chapter4;

class TreeNode{

   TreeNode left,right;
   int data;
   
   TreeNode(int data){
     this.data = data;
     left=null;
     right=null;  
   }
}

class Tree{
   
   TreeNode root; 
      
   public static int maxDepth(TreeNode root){
      
      if(root==null){
        return 0; 
      }
      
      return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
   }
   
   public static int minDepth(TreeNode root){
      
      if(root==null){
        return 0;  
      }
      
      return 1+Math.min(minDepth(root.left),minDepth(root.right));
   }
   
   public static boolean IsBalanced(TreeNode root){
   
     if(maxDepth(root)-minDepth(root)<=1){
        System.out.println("Tree Is Ballanced");
        return true;
     }
     
     System.out.println("Tree Is NOT Ballanced");
     return false;
   }
   
   
   public static void main(String[] args){
   
      Tree tree = new Tree();
      tree.root = new TreeNode(1);
      tree.root.left = new TreeNode(2);
      tree.root.right = new TreeNode(3);
      //tree.root.left.left = new TreeNode(4);
      //tree.root.left.right = new TreeNode(5);
      //tree.root.left.left.left = new TreeNode(8);
      
      tree.IsBalanced(tree.root);
   }
}

