//Author: Adonis Murati

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node pointer = head;
    int index = 0;
    
    while(head.next != null){
        head = head.next;
        if(index < n){
            index++;
        }else{
            pointer = pointer.next;
        }
    }
    return pointer.data;
}