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

        Game game = new Game();
        game.start();

        Game game1 = new Game();
        game1.start();

        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 1.5;

        Car carReference = new Car(carEngine);

        carReference.setName("Dacia");
        carReference.setColor("red");
        carReference.setMileage(9.8);
        carReference.setFuelLevel(60);
        carReference.setMaxSpeed(200);
        carReference.setRunning(false);




        System.out.println("Engine details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);


        double accelerationDistance = carReference.accelerate(200, 1);
        System.out.println(" AccelerationDistance" + accelerationDistance);

        Mechanic mechanic = new Mechanic();
        mechanic.repairVehicle(carReference);

        System.out.println("Total travel distance after repair:"+ carReference.getTravelDistance());



        Car car2 = new Car(carEngine);
        car2.setName("BMW");
        car2.setMileage(14);
        car2.setColor(null);
                               // concatenation = concatenare
        System.out.println(carReference);
        System.out.println("Fist car name: " + carReference.getName());
        System.out.println(carReference.getMileage());
        System.out.println(carReference.getFuelLevel());
        System.out.println(carReference.getTravelDistance());
        System.out.println(carReference.isRunning());
        System.out.println(carReference.doorCount);


        System.out.println("Second car name: " + car2.getName());
        System.out.println("Second car name: " + car2.getMileage());
        System.out.println("Second car name: " + car2.getFuelLevel());
        System.out.println("Second car name: " + car2.getTravelDistance());
        System.out.println("Second car name: " + car2.isRunning());
        System.out.println("Second car name: " + car2.doorCount);

          car2.setName("Vw");
        System.out.println(car2.getName());


        Car car3 = car2;
        car3.setName("Audi");
        System.out.println("car2 name: "+ car2.getName());
        System.out.println("car3 name: " + car3.getName());


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
