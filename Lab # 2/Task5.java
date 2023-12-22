import java.util.Scanner;

class MyJavaCoffeeOutlet{
    double CoffeePrice=5.50;
    double SmallBoxPrice=0.60,MediumBoxPrice=1.00,LargeBoxPrice=1.80;
    double SmallBox=5,MediumBox=10,LargeBox=20;
    int TotalBags;
    double Small=0,Medium=0,Large=0;
    double TotalCost=0;

    double CofeeCost(){
        return(TotalBags*CoffeePrice);
    }

    double LargeBoxCost(){
        return (Large*LargeBoxPrice);
    }

    double MediumBoxCost(){
        return (Medium*MediumBoxPrice);
    }

    double SmallBoxCost(){
        return (Small*SmallBoxPrice);
    }

    void Total(int Bags){
        TotalBags=Bags;
        while(Bags>=LargeBox){
            Bags-=LargeBox;
            Large++;
        }
        while(Bags>=MediumBox){
            Bags-=MediumBox;
            Medium++;
        }
        while(Bags>0){
            Bags-=SmallBox;
            Small++;
        }
        TotalCost=(CofeeCost())+(LargeBoxCost())+(MediumBoxCost())+(SmallBoxCost());
    }
}

class Task5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyJavaCoffeeOutlet C=new MyJavaCoffeeOutlet();

        System.out.print("Enter number of coffee bags: ");
        int num=s.nextInt();
        C.Total(num);

        System.out.println("Number of Bags Ordered: " + C.TotalBags);
        System.out.println("The Cost of Order: $" + C.CofeeCost());
        System.out.println("Boxes Used:");
        System.out.println(C.Large + " Large - $" + C.LargeBoxCost());
        System.out.println(C.Medium + " Medium - $" + C.MediumBoxCost());
        System.out.println(C.Small + " Small - $" + C.SmallBoxCost());
        System.out.println("Your Total Cost is: $" + C.TotalCost);
    }
}