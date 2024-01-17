class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
    }
}

class Methods{
    float sum;
    float counter;
    float Sum(Node n){
        sum=0;
        counter=1;
        sum+=n.data;
        for(Node p=n.next;p!=null;p=p.next){
            sum+=p.data;
            counter++;
        }
        return sum;
    }
    float Average(Node n){
        Sum(n);
        return (sum/counter);
    }
}

class DSATask5{
    public static void main(String[] args) {
        int[] a={11,22,33,44,55};
        Methods m=new Methods();
        Node start=new Node(11);
        start.data=a[0];
        Node p=start;
        for(int i=1;i<a.length;i++){
            p.next=new Node(a[i]);
            p=p.next;
        }
        System.out.println("Sum: " + m.Sum(start));
        System.out.println("Average: " + m.Average(start));
    }
}