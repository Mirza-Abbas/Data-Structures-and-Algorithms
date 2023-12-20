class Employee{
    char[] firstName;
    String lastName;
    int monthlySalary;

    void setDetails(char[] Name1,String Name2,int Salary){
        firstName=Name1;
        lastName=Name2;

        if(Salary<0){
            Salary=0;
        }
        monthlySalary=Salary;
    }
    
    int YearlySalary(){
        return (monthlySalary*12);
    }
    void IncreaseSalary(){
        monthlySalary+=(10*monthlySalary)/100;
    }
}

class Task2{
    public static void main(String[] args) {
        Employee e1= new Employee();
        Employee e2= new Employee();
    
        e1.monthlySalary=1000;
        e2.monthlySalary=2000;

        System.out.println("Employee1 Yearly Salary: " + e1.YearlySalary());
        System.out.println("Employee2 Yearly Salary: " + e2.YearlySalary());

        e1.IncreaseSalary();
        e2.IncreaseSalary();

        System.out.println("Employee1 Increased Yearly Salary: " + e1.YearlySalary());
        System.out.println("Employee2 Increased Yearly Salary: " + e2.YearlySalary());



    }
}