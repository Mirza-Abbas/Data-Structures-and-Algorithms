class Vehicle {

    Vehicle(int wheels) {
        if (wheels == 2) {
            System.out.println("The Vehicle is a bike");
        } 
        else if (wheels == 3) {
            System.out.println("The Vehicle is a Rikshaw");
        } 
        else {
            System.out.println("Enter correct No. of Wheels");
        }
    }

    int year;
    String manufacture;
    int speed=0;

    void accelerate(){
        speed+=5;
    }

    void brake() {
       speed-=5;
    }

 
}

class Task6{
    public static void main(String[] args) {

        Vehicle Rickshaw= new Vehicle(3);
        for(int i=0;i<5;i++){
            Rickshaw.accelerate();
            System.out.println("Rickshaw Speed: " + Rickshaw.speed);
        }

        for(int i=0;i<2;i++){
            Rickshaw.brake();
            System.out.println("Rickshaw Speed: " + Rickshaw.speed);
        }

        System.out.println("\n");
        Vehicle Bike= new Vehicle(2);
        
        for(int i=0;i<5;i++){
            Bike.accelerate();
            System.out.println("Bike Speed: " + Bike.speed);
        }

        for(int i=0;i<2;i++){
            Bike.brake();
            System.out.println("Bike Speed: " + Bike.speed);
        }
    }
}