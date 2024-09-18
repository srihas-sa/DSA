public class DOublyLinkedList {
  
  public static Node head;
  
  public static class Node {
    int data;
    Node prev;
    Node next;
  
  Node(int data){
    this.data=data;
    this.next=next;
    this.prev=prev;
  }
  }
  public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    head=new Node(arr[0]);
   head.prev=null;
    head.next=null;
    Node curr=head;
    
    for(int i=1;i<arr.length;i++){
      Node newNode=new Node(arr[i]);
      
      newNode.prev=curr;
      curr.next=newNode;
      curr=curr.next;
      
    }
    
    Node curr1=head;
    while(curr1!=null){
      System.out.print(curr1.data);
      curr1=curr1.next;
    }
}
}
