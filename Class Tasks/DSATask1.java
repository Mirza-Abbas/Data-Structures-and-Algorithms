class Parent{

}
class Child extends Parent{

}

class DSATask1{
    public static void main(String[] args) {
        Child c1=new Child();
        Child c2=new Child();
        Child c3=new Child();
        Parent[] ParentArray={c1,c2,c3};
        System.out.println(ParentArray.getClass());
    }
}

