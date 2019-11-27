package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

public class Vehicle {
// proprietate de clasa ( class variable)

   static int totalCount;

    // instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double travelDistance;
    boolean running;

    public Vehicle() {
        totalCount ++;
    }

    public double accelerate(double speed, double durationInHours) {

        double mileagemultiplier = 1;


        // partea de sus se numeste semnatura metodei
        System.out.println(name + " is accelerating with" + speed + durationInHours + "h");

        if (speed > maxSpeed) {
            System.out.println("Sorry. Maximum speed exceeded.");
            return 0;
        }
             else if (speed == maxSpeed) ; {
                System.out.println("Carefu! Max Speed reached");
                }


                if (fuelLevel <= 0) {
                    System.out.println("You don`t have enough fuel.");
                    return  0;
                }

                if(speed > 120) {
                    System.out.println("Going fast ... you`ll use more fuel.");

                 // incrasing mileage multiplier with percentege of acceleration`s speed

                    mileagemultiplier = speed / 100;

                }

//local variable ( declared inside a method )
        double distance = speed * durationInHours;
        travelDistance = travelDistance + distance;
        System.out.println("Total travel distance "+ travelDistance);

        //same result as the statement about
//        travelDistance += distance;

        double usedfuelwithStandardMileage = distance * travelDistance / 100;
        System.out.println("usedfuel :" + usedfuelwithStandardMileage);


        double usedfuelwithCurrentMileage = usedfuelwithStandardMileage * mileagemultiplier;
        System.out.println("Used fuel with current mileage : "+ usedfuelwithCurrentMileage);

        fuelLevel -= usedfuelwithCurrentMileage;

        System.out.println("Remaing fuel level : "+ fuelLevel);
        return distance;

    }

    }
