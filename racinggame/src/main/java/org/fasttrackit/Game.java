package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start() {
        System.out.println("Starting game...");

        String vehicleName = getVehicleNameFromUser();
        

        System.out.println("Name from user :"+ vehicleName);

    }

            private String getVehicleNameFromUser() {
                System.out.println("Please enter vehicle name.");

                Scanner scanner = new Scanner(System.in);
               return scanner.nextLine();
            }

            private int getNumberofUser() {
                System.out.println(" Please enter the number of players.");
                Scanner scanner1 = new Scanner(System.in);
                return scanner1.nextInt();
            }
}
