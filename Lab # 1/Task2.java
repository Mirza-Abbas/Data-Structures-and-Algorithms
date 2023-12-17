import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age=sc.nextInt();

        if(age>0 && age<14){
            System.out.println("Ticket Price: $5");
        }
        else if(age>13 && age<65){
            System.out.println("Ticket Price: $10");
        }
        else if(age>64){
            System.out.println("Ticket Price: $7");
        }
        else{
            System.out.println("Invalid age");
        }
        sc.close();
    }
}
