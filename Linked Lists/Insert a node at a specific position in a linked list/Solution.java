//Author: Adonis Murati

/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
    // This is a "method-only" submission. 
    // You only need to complete this method. 
     
    Node headNode = head;
    
    Node newNode = new Node(); 
    newNode.data = data;
    
    if(head == null){
        return newNode;
    }

    if(position == 0){
        newNode.next = head; 
        return newNode;
    }    
    
    int currPosition = 0;
    
    while(currPosition < position -1 && head.next != null){
        head = head.next;        
        currPosition++;       
    }

    Node nodeAtPosition = head.next;
    head.next = newNode;
    head = head.next;
    head.next = nodeAtPosition;
        
    return headNode;
    
}
