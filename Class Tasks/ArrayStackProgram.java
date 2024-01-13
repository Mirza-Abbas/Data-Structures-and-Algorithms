import java.io.IOException;

interface Stack{
    public Object peak();
    public Object pop();
    public void push(Object O);
    public int Size();
}

class ArrayStack implements Stack{
    private Object[] a;
    private int size, cap;

    public ArrayStack(int c){
        cap=c;
        a=new Object[c];
    }

    public boolean isEmpty(){
        return (size==cap);
    }

    //Equals Method
    public boolean equals(ArrayStack s){
        if(this.size==s.size){
            for(int i=0;i<size;i++){
                if(!a[i].equals(s.a[i])){
                   return false;
                }
            }
            return true;
        }
        return false;
    }

    //ToString Method
    public String toString () {
        int i=0;
        StringBuilder temp=new StringBuilder("[");
        while(a[i]!=null){
            temp.append((String)a[i]);
            i++;
            if((i)==size){
                temp.append(" ");
                break;
            }
            temp.append(", ");
        }
        temp.append("]");

        String t=new String(temp);

        return t;
    }

    //Remove method
    public Object remove(){
        Object obj=a[0];
        System.arraycopy(a, 1, a, 0, size--);

        // Object[] temp=a;
        // Object obj=a[0];
        // a=new Object[size];
        // System.arraycopy(temp, 1, a, 0, size);
        return obj;
    }

    void reverse(ArrayStack s){
        Object[] temp = new Object[s.size];
        int j = s.size-1;
        for (int i = 0; i < s.size; i++) {
            temp[j] = a[i];
            j--;
        }
        System.arraycopy(temp, 0, s.a, 0, size);
    }    

    public Object peak(){

        if(size==0){

            try {
                throw new Exception();
            } 
            catch (Exception e) {

            }
        }

        return a[size-1];
    }

    public Object pop(){
        Object obj=a[--size];
        a[size]=null;
        return obj;
    }

    public void push(Object O){
        if(size==a.length){
            resize();
        }
        a[size++]=O;
    }

    public int Size(){
        return size;
    }

    public void resize(){
        Object[] aa = a;
        a=new Object[2*aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }
}

public class ArrayStackProgram {
    public static void main(String[] args) {
        ArrayStack Fruit_Crates=new ArrayStack(6);

        Fruit_Crates.push("Apples");
        Fruit_Crates.isEmpty();
        Fruit_Crates.push("Kiwis");
        Fruit_Crates.push("DragonFruit");
        System.out.println(Fruit_Crates.peak());
        Fruit_Crates.pop();
        System.out.println(Fruit_Crates.peak());
        Fruit_Crates.push("Pomegrante");
        Fruit_Crates.push("Grapes");
        Fruit_Crates.push("Peach");
        Fruit_Crates.push("Orange");
        Fruit_Crates.push("Banana");
        System.out.println(Fruit_Crates.equals(Fruit_Crates));
        Fruit_Crates.remove();
        Fruit_Crates.reverse(Fruit_Crates);
        System.out.println(Fruit_Crates);
    }
}
