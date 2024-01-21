class LinkedStack{

    static class Node{
        Node next;
        String data;

        public Node(String d){
            data=d;
        }
    }

    Node top;
    int size;

    public LinkedStack(){
        top=null;
        size=0;
    }
    void push(String data){
        Node temp=new Node(data);
        temp.next=top;
        size++;
        top=temp;
    }
    String peek(){
        if(top==null){
            System.out.println("List is empty");
        }
        return top.data;
    }
    String pop(){
        if(top==null){
            System.out.println("List is empty");
        }
        String result=top.data;
        top=top.next;
        --size;
        return result;
    }
    boolean isEmpty(){
        return (top==null);
    }
    int size(){
        return size;
    }
   
    public void display(){
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
  
                // print node data
                System.out.print(temp.data);
  
                // assign temp link to temp
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }


    public static void main(String[] args) {
        LinkedStack list=new LinkedStack();
        list.push("Apples");
        list.push("Kiwis");
        list.push("Dragon Fruit");
        list.push("Pomegrnate");
        list.push("Grapes");
        list.push("Peach");
        list.push("Orange");       
        list.push("Guava");
        list.push("Chikoo");
        list.push("Malta");
        // System.out.println(list.peek());
        // list.pop();
        // System.out.println(list.peek());
        // System.out.println(list.isEmpty());
        // System.out.println(list.size());
        list.display();
        
    }
}