package PracticeCoding;

class BinaryTree { 
 Node root; 

 // Returns the max value in a binary tree 
 static int findMax(Node node) 
 { 
     if (node == null) 
         return Integer.MIN_VALUE; 

     int current = node.key; 
     int left = findMax(node.left); 
     int right = findMax(node.right); 

     if (left > right) 
         current = left; 
     if (right > res) 
         current = right; 
     return current; 
 } 

 /* Driver program to test above functions */
 public static void main(String args[]) 
 { 
     BinaryTree tree = new BinaryTree(); 
     tree.root = new Node(2); 
     tree.root.left = new Node(7); 
     tree.root.right = new Node(5); 
     tree.root.left.right = new Node(6); 
     tree.root.left.right.left = new Node(1); 
     tree.root.left.right.right = new Node(11); 
     tree.root.right.right = new Node(9); 
     tree.root.right.right.left = new Node(4); 

     System.out.println("Maximum element is " + 
                      tree.findMax(tree.root)); 
 } 
} 

