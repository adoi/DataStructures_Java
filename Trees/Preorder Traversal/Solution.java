//Author: Adonis Murati

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    Node pre;
    if(root == null)
        return;
    Node current = root;
    while(current != null){
        if(current.left == null){
            System.out.print(current.data+" ");
            current = current.right;
        }else{
             pre = current.left;
             while(pre.right != null && pre.right != current){ pre = pre.right; }

             if(pre.right == null){
                 pre.right = current;
                 System.out.print(current.data+" ");
                 current = current.left;
             }else{
                 pre.right = null;
                 current = current.right;
             }
        }
    }
}
