package week1.day1;

public class Bike {

    public static void main(String[] args) {
        
        // Create object for Bike class
        Bike myBike = new Bike();
        System.out.println("This is my Bike");

        // Create object for Car class
        Car myCar = new Car();

        // Call methods from Car class using Car object
        myCar.applyBreak();
        myCar.soundHorn();
    }
}
