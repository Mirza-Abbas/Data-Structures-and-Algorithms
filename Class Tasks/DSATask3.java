import java.util.Arrays;
import java.util.Scanner;

public class DSATask3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(arr));

        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Index No.: ");
        int index=s.nextInt();
        
        System.out.println("Enter New Number: ");
        int no=s.nextInt();

        arr[index]=no;
        
        System.out.println("No. changed successfully");

        System.out.println(Arrays.toString(arr));
    }
}
