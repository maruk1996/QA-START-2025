package org.prog;

import java.util.Random;
import java.util.UUID;

public class Plane2 {

    public UUID flightId;
    public int maxPassengers;
    public int currentPassengers;
    public int availableSeats;
    public String destinationCity;


    public void goTo() {


        System.out.println("The plane " + flightId +
                " is going to " + destinationCity + " with " + currentPassengers + " passengers out of " +
                maxPassengers + " possible. " + availableSeats + " available seats");
    }
}