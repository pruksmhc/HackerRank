Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node firstNode = head; 
      Node dataNode = new Node(); 
        dataNode.data = data; 
        dataNode.next = null; 
     if (head != null){
        while(head.next != null){
            head = head.next; 
        }
          
        head.next =dataNode; 
            return firstNode;     
    }else{
         //if it's an empty string. 
         head.next = dataNode; 
         return firstNode;   
     }
  // Complete this method
  
}