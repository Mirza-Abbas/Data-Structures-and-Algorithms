public class Linkedlist_Program {

    static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val =val;
        }
    }    // end of class Node

    public static void print(Node head){
        for(Node p=head; p!=null; p=p.next){
            System.out.print(p.val+"  ");
        }
        System.out.println();
    }

    public static Node reverse(Node head){
        Node current = head;
        Node prev = null, next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static Node merge(Node list1, Node list2){
        Node p=list1;
        for(p=list1;p.next!=null;p=p.next){

        }
        p.next=list2;
        return list1;
    }
    public static Node copy(Node head){
        Node a=new Node(head.val);
        Node b=head;
        Node start = b;
        Node temp=a;
        start=start.next;
        while(start!=null){
            temp.next=new Node(start.val);
            start=start.next;
            temp=temp.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        Node start = new Node(1);
        Node p = start;
        p.next = new Node(2);
        p = p.next;
        p.next = new Node(5);
        p = p.next;
        p.next = new Node(10);
        p = p.next;
        print(start);

        Node start2 = new Node(15);
        Node q = start2;
        q.next = new Node(25);
        q = q.next;
        q.next = new Node(55);
        q = q.next;
        q.next = new Node(105);
        q = q.next;
        Node c=copy(start);
        print(c);
        Node b= merge(start, start2);
        print(b);
        Node a = reverse(start);
        print(a);
    }  
}