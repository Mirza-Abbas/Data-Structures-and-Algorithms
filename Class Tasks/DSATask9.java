class AVL{
    private int key, height;
    private AVL Left, Right;

    private AVL(){
        Left=Right=this;
        height=-1;
    }

    private AVL(int k, AVL L, AVL R){

        key=k;
        Left=L;
        Right=R;

        height=1+Math.max(Left.height, Right.height);
    }

    public static final AVL Nil=new AVL();

    public AVL(int k){
        key=k;
        Left=Right=Nil;
    }

    public boolean add(int k){
        int oldsize=size();
        grow(k);
        return (size()>oldsize);
    }

    public int size(){
        if(this==Nil){
            return 0;
        }
        return (1+Left.size()+Right.size());
    }

    public AVL grow(int k){
        if(this==Nil){
            return new AVL(k);
        }
        if(k==this.key){
            return this;
        }
        if(k<this.key){
            Left=Left.grow(k);
        }
        else{
            Right=Right.grow(k);
        }

        // rebalance();

        height=1+Math.max(Left.height, Right.height);

        return this;
    }

    public String toString(){
        if(this==Nil){
            return " ";
        }
        return (Left + " " + key + " " + Right);
    }
}

public class DSATask9 {
    public static void main(String[] args) {
        AVL A=new AVL(2000);
        A.add(1000);
        A.add(3000);
        A.add(1500);
        A.add(1750);
        A.add(2500);
        A.add(1900);
        A.add(3100);
        A.add(2100);
        A.add(2350);
        A.add(1700);
        A.add(1200);
        A.add(2);
        System.out.println(A);
    }
}
