import java.util.*;

class Task2 {
    
    static void print(int n){
        if(n>0){
            System.out.println(n);
            print(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter how many numbers to print: ");
        int n=s.nextInt();
        print(n);
    }   
}
