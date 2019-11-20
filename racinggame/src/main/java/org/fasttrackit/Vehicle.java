package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle {

    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double travelDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours) {

        // partea de sus se numeste semnatura metodei
        System.out.println(name + " is accelerating with" + speed + durationInHours + "h");

        double distance = speed * durationInHours;
        travelDistance = travelDistance + distance;
        System.out.println("Total travel distance "+ travelDistance);

        //same result as the statement about
//        travelDistance += distance;

        double usedfuel = distance * travelDistance / 100;
        System.out.println("usedfuel :" + usedfuel);

        fuelLevel -= usedfuel;
        System.out.println("Remaing fuel level : "+ fuelLevel);
        return distance;

    }

    }
