import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String question="What is the capital of Pakistan?";

        String c1="1. Tehran";
        String c2="2. Washington DC";
        String c3="3. Islamabad";

        System.out.println(question+"\n"+c1+"\n"+c2+"\n"+c3);
        System.out.print("\nChoice (1-3) : ");
        int c=sc.nextInt();

        if(c!=3){
            System.out.println("\nAnswer is Incorrect");
        }
        else if(c==3) {
            System.out.println("\nCongrats! The Answer is Correct");
        }

        sc.close();
    }
}
