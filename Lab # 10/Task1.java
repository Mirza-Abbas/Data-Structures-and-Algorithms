import java.util.*;

class Task1{
    static long factorial(long n){
        if(n>=0){
            if(n<2){
                return 1;
            }
            else{
                return (n*factorial(n-1));
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number to calculate factorial: ");
        long n=s.nextLong();
        System.out.println(factorial(n));
    }
}