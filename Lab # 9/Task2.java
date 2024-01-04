class LinkedStack<T> {
    private Node<T> top;
    private int size;
 
    private class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedStack() {
        top = null;
        size=0;
    }
    
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    public T pop() {
        if (isEmpty()) {
            System.out.println("Undeflow");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Underfloe");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return (top==null);
    }

    public int search(T target) {
        int index = 0;
        Node<T> temp = top;
        while (temp != null) {
            if (temp.data.equals(target)) {
                return (size-index);
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    int getsize(){
        return size;
    }

    void display(){
        Node<T> temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

class Task2{
    public static void main(String[] args) {

        LinkedStack a=new LinkedStack<>();
        a.push("A");
        a.push("B");
        a.push("C");
        a.push("D");
        a.push("E");
        a.push("F");
        a.push("G");
        a.push("H");
        a.push("I");
        a.push("J");
        
        System.out.println("\nStack Empty: " + a.isEmpty());
        System.out.println("\nStack Size: " + a.getsize());
        System.out.println("\nElement found at position: " + a.search("A"));
        System.out.println("\nElement at top: " + a.peek());
        a.pop();
        System.out.println("\nElement at top: " + a.peek());
        a.display();
        System.out.println("\n");
    }
}