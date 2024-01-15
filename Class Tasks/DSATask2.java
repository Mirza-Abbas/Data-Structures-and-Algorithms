import java.util.Scanner;

public class DSATask2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter OOP Marks: ");
        int marks=s.nextInt();
        if(marks>-1 && marks<101){
            System.out.println("Marks set successfully");
        }
        else{
            System.out.println("Marks not set");
        }
        s.close();
    }
}
