import java.util.ArrayList;

class Task1{
    public static void main(String[] args) {

        //Employee.java Program:

        System.out.println("\nEmployee.java Program: \n");

        int age=29;
        System.out.println("Age: " + age);

        boolean isAManager = true;
        System.out.println("Is a Manager: " + isAManager);

        double yearsOfService=2.5;
        System.out.println("Years Of Service: " + yearsOfService);

        int baseSalary=3000;
        int overtimePayment=40;
        int totalPayment=baseSalary+overtimePayment;
        System.out.println("Total Payment: " + totalPayment);

        double firstBonus, secondBonus, thirdBonus;
        firstBonus=10.00;
        secondBonus=20.00;
        thirdBonus=30.00;

        System.out.println("Total Sum: " + (firstBonus+secondBonus+thirdBonus));
        
        //Employee.java programs ends


        //MenuBuilder.java Program:
        System.out.println("\nMenuBuilder.java Program: \n");

        String menutitle = "My Dream Menu";
        System.out.println("Title: " + menutitle);

        ArrayList <String> menu = new ArrayList<>();

        String starter = "soup";
        menu.add(starter);

        String maincourse = "Chicken";
        menu.add(maincourse);

        String dessert = "Ice-cream";
        menu.add(dessert);

        System.out.println(menutitle);
        for (String a : menu) {
            System.out.println(a);
        }
    }
}