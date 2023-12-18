import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int hrs, amount, vacation, total_hrs;

        System.out.print("Enter No of Hours the employee works per week: ");
        hrs=s.nextInt();

        System.out.print("\nEnter amount of money employee makes per hour: $");
        amount=s.nextInt();

        System.out.print("\nEnter vacation days: ");
        vacation=s.nextInt();

        vacation*=8;
        total_hrs=hrs*52;       //approx. 52 weeks in a year
        total_hrs-=vacation;

        System.out.println("\nGross Yearly Salary is $" + (total_hrs*amount));
        s.close();
    }
}
