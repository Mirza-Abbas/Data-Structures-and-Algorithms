class linkedList<L> { 
    private static class Node<T>{
        T data;
        Node<T> nextNode;
        Node<T> preNode;
        Node(T data){
            this.data=data;
            nextNode=null;
            preNode=null;
        }
    }
 
    int size; 
    Node<L> head;
  
    linkedList(){
        size=0;
        head=null;
    }
  
    public void insertAtFirst(L data){
        Node<L> newNode=new Node<L>(data); 
        if(size==0)
            head=newNode;
        else{
            head.preNode=newNode;
            newNode.nextNode=head;
            head=newNode;
        }
        size++;
    } 
  
    public void DisplayForward(){
        
        if(size==0)
            System.out.println("Linked list is empty, nothing to display");
        else{
            Node<L> tempNode=head;
            while(tempNode!=null){
                System.out.print(tempNode.data+", ");
                tempNode=tempNode.nextNode;
            }
        }
      
    }
 
}

public class Generic_LinkedList {
    public static void main(String[] args) {
        //create linked list
        linkedList<String> list1=new linkedList<String>();
        list1.insertAtFirst("Student1");
        list1.insertAtFirst("Student2");
        list1.DisplayForward();
    }
}