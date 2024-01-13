class Array_Stack{
    Object[] a;
    int size;

    Array_Stack(int s){
        a=new Object[s];
        size=0;
    }

    void push(Object d){
        if(size == a.length){
            resize();
        }
        a[size++]=d;
    }

    void peek(){
        if(a.length>=1){
            System.out.println(a[size-1]);
        }
    }

    Object pop(){
        if(a.length>=1){
            Object t=a[a.length-1];
            return t;
        }
        return -1;
    }

    void resize(){
        Object[] t=a;
        a=new Object[2*size];
        System.arraycopy(t, 0, a, 0, size);
    }
}

class ArrStack{
    public static void main(String[] args) {
            Array_Stack s=new Array_Stack(4);
            s.push("A");
            s.push("L");
            s.push("R");
            s.push("B");
            s.peek();
    }
}