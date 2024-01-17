class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}
public class DSATask6 {
    static boolean Search(Node start, int x){
        if(start==null){
            return false;
        }
        if(start.data==x){
            return true;
        }
        for(Node p=start;p!=null;p=p.next){
            if(p.next.data==x){
                return true;
            }
            if(p.next==null){
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node start=new Node(0);
        Node P=start;

        for(int i=1;i<10;i++){
            P.next=new Node(i);
            P=P.next;
        }
        System.out.println(Search(start, 5));
    }
}
