import java.util.ArrayList;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}

class Test_Program{
    public static void main(String[] args) {
        int[] a={4,5,6};
        int[] b={7,8,9};

        System.out.println("Using Array: ");
        System.out.println(a[a.length-1]+b[b.length-1]);

        Node start1=new Node(a[0]);
        Node p=start1.next;

        for(int i=1;i<a.length;i++){
            p=new Node(a[i]);
            if(i==a.length-1){
                break;
            }
            p=p.next;
        }
        

        Node start2=new Node(b[0]);
        Node q=start2.next;

        for(int i=1;i<a.length;i++){
            q=new Node(b[i]);
            if(i==a.length-1){
                break;
            }
            q=q.next;
        }
        
        System.out.println("Using Linkkedlist: ");
        System.out.println(p.data+q.data);
    }
}