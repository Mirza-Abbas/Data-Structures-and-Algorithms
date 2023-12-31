class Task3<T> {
    Node<T> head;
    int size;

    static class Node<T> {          //Node Class  
        T data;
        Node<T> next;

        public Node(T d) {      //Node Constructor
            data = d;
            this.next = null;
        }
    }

    public Task3() {                //Task3 Constructor
        head = null;
        size = 0;
    }

    public boolean isEmpty() {                 
        return (head == null);
    }

    public int getSize() {                      
        return size;
    }

    public void add(T data) {                   // Method to add elements in Node
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtFirst(T data) {         // Method to add element at the start of linked list 
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(T data) {          // Method to add element at the end of linked list
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }

    public void insertAtPosition(T data, int position) {        // Method to insert element at any position
        Node<T> newNode = new Node<T>(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public void deleteFirst() {             // Method to delete the first element in linked list
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {          // Method to delete the last element in linked list
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
            } else {
                Node<T> temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
            size--;
        }
    }

    public void deleteAtPosition(int position) {            /// Method to delete element at any position in linked list
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            int count = 0;
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            current.next = current.next.next;
        }
        size--;
    }


    public void deleteValue(T value) {          // Method to delete element by value in linked list
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            if (current.data.equals(value)) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
                break;
            }
            previous = current;
            current = current.next;
        }
    }
    
    public boolean search(T value) {            // Method to search an element by value in linked list
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {             
        Node<T> current = head;
        System.out.print(" [ ");
       for(current=head;current!=null;current=current.next){
        if(current.next==null){
            System.out.print(current.data);
            break;
        }
        System.out.print(current.data+" , ");
       }
       System.out.println(" ] ");
    }

    public static void main(String[] args) {    //Main method

        Task3<Integer> t=new Task3<Integer>();

        t.add(2);
        t.add(7);
        t.add(8);

        t.display();
        System.out.println(t.isEmpty());
        System.out.println(t.getSize());
        t.insertAtLast(10);
        t.insertAtFirst(1);
        t.insertAtPosition(4, 5);
        t.deleteFirst();
        t.deleteLast();
        t.deleteAtPosition(2);
        System.out.println(t.search(7));
        t.deleteValue(2);
        t.display();
        
    }
}