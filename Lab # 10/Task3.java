import java.util.*;

class Task3 {
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n>1){
        return (fibonacci(n-1)+fibonacci(n-2));
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number to print fibonacci series: ");
        int n=s.nextInt();
        
        for(int i=1;i<=n;i++){
            if(i==(n-1)){
                System.out.print(fibonacci(i));
                break;
            }
            else{
                System.out.print(fibonacci(i) + " -> ");
            }
        }
    }
}


