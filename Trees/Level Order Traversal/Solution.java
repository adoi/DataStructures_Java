    //Author: Adonis Murati
    /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
      
       Queue<Node> queue = new LinkedList<Node>();
       if(root != null){
           queue.add(root);
       }
       while(!queue.isEmpty()){
           Node tree = queue.remove();
           System.out.print(tree.data+" ");
           
           if(tree.left != null){
               queue.add(tree.left);
           }
           if(tree.right != null){
               queue.add(tree.right);
           }
       }
      
    }
