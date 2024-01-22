import java.io.IOException;

interface Stack{
    public Object peek();
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
        return (size==0);
    }

    //Equals Method
    public boolean equals(ArrayStack s){
        return (this.a==s.a);
    }

    //ToString Method
    public String toString () {
        int i=0;
        String temp="[";
        while(a[i]!=null){
            temp+=(String)a[i];
            i++;
        }
        temp+="]";
        return temp;
    }

    //Remove method
    public Object remove(){
        Object obj=a[--size];
        a[size]=null;
        return obj;
    }

    public Object peek(){
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

public class RPN_Program {
    RPN_Program(String[] args){
        ArrayStack stack = new ArrayStack(args.length);
        for(int i=0;i<args.length;i++){
            String input=args[i];
            if(isAnOperator(input)){
                double y=Double.parseDouble((String)stack.pop());
                double x=Double.parseDouble((String)stack.pop());
                double z=evaluate(x,y,input);
                stack.push("" + z);
            }
            else{
                stack.push(input);
            }
        }
        System.out.println(stack.toString());       //Calling To String Method
        // System.out.println((String)stack.remove()); //Calling Remove Method
    }

    private boolean isAnOperator(String s){
        return (s.length()==1 && "ASMD".indexOf(s)>=0);
    }

    private double evaluate(double x, double y, String op){
        double z=0;
        if(op.equals("A")){
            z=x+y;
            System.out.println(x + " + "  + y + " " + " = " + z);
        }
        else if(op.equals("S")){
            z=x-y;
            System.out.println(x + " - "  + y + " " + " = " + z);
        }
        else if(op.equals("M")){
            z=x*y;
            System.out.println(x + " * "  + y + " " + " = " + z);
        }
        else if(op.equals("D")){
            z=x/y;
            System.out.println(x + " / "  + y + " " + " = " + z);
        }
        else{
            System.out.println(x + " " + op + " "  + y + " " + " = " + z);
        }
        return z;
    }

    public static void main(String[] args) {
        new RPN_Program(args);
    }
}
