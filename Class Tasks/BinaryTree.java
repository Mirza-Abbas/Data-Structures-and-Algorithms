 class BinaryTree {
    Object Root;
    BinaryTree Left,Right;
    int size;
    int height;
    int lh,rh;

    BinaryTree(Object r){
        Root=r;
    }

    BinaryTree(Object r, BinaryTree L, BinaryTree R){
        Root=r;
        Left=L;
        Right=R;
    }

    Object getRoot(){
        return Root;
    }

    BinaryTree getLeft(){
        return Left;
    }

    BinaryTree getRight(){
        return Right;
    }

    public String toString(){
        StringBuffer t=new StringBuffer();
        if(Left!=null){
            t.append(Left + ", ");
        }

        t.append(Root);

        if(Right!=null){
            t.append(", " + Right);
        }

        return (t + "");
    }

    void Search(Object x){
        if(Root.equals(x)){
            System.out.println(x + " Found");
        }
        if(Left!=null){
            Left.Search(x);
        }
        if(Right!=null){
            Right.Search(x);
        }
    }

    int size(){
        if(Root!=null){
            size++;
        }
        if(Left!=null){
            size+=Left.size();
        }
        if(Right!=null){
            size+=Right.size();
        }
        return size;
    }

    

    public static void main(String[] args) {


        BinaryTree D=new BinaryTree("D");
        BinaryTree E=new BinaryTree("E");
        BinaryTree B=new BinaryTree("B", D, E);
        BinaryTree G=new BinaryTree("G");
        BinaryTree H=new BinaryTree("H");
        BinaryTree F=new BinaryTree("F", G, H);
        BinaryTree C=new BinaryTree("C", null, F);
        BinaryTree A=new BinaryTree("A", B, C);

        System.out.println(A);
        //System.out.println(A.height(A));

        A.Search("F");
        A.Search("L");

        System.out.println("Size: " + A.size());
    }
}
