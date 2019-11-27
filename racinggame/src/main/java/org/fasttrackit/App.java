package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{

//    aici se pune comentariu ( ctrl+/ )

    public static void main( String[] args )
    {

        System.out.println( "Welcome to The Racing Game" );

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        Car carReference = new Car(carEngine);
        carReference.name = "Dacia";
        carReference.color = "red";
        carReference.mileage = 9.8;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount = 2;



        System.out.println("Engine details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);


        double accelerationDistance = carReference.accelerate(200, 1);
        System.out.println(" AccelerationDistance" + accelerationDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total travel distance after repair:"+ carReference.travelDistance);



        Car car2 = new Car(carEngine);
        car2.name = "BMW";
        car2.mileage = 14;
        car2.color= null;
                               // concatenation = concatenare
        System.out.println(carReference);
        System.out.println("Fist car name: " + carReference.name);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.travelDistance);
        System.out.println(carReference.running);
        System.out.println(carReference.doorCount);


        System.out.println("Second car name: " + car2.name);
        System.out.println("Second car name: " + car2.mileage);
        System.out.println("Second car name: " + car2.fuelLevel);
        System.out.println("Second car name: " + car2.travelDistance);
        System.out.println("Second car name: " + car2.running);
        System.out.println("Second car name: " + car2.doorCount);

          car2.name = "Vw";
        System.out.println(car2.name);


        Car car3 = car2;
        car3.name = "Audi";
        System.out.println("car2 name: "+ car2.name);
        System.out.println("car3 name: " + car3.name);


//        System.out.println("Modulo example:");
//        System.out.println(4 % 2 == 0);
//        System.out.println(4 % 3);
//example for NullPointerException
//        Car car4 =  null;
//        System.out.println(car4.name);

        System.out.println(" Studyng class variables ( static variables)...");
        Vehicle vehicle1 = new Vehicle();
        vehicle1.totalCount = 10;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.totalCount = 20;

        Vehicle.totalCount = 30;

        System.out.println("Total vehicle count:" + vehicle1.totalCount);
        System.out.println("Total vehicle 2 count:" + vehicle2.totalCount);
        System.out.println("Total vehicle count:" + Vehicle.totalCount);
    }


}
