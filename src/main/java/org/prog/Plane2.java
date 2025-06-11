package org.prog;

import java.util.Random;
import java.util.UUID;

public class Plane2 {

    public int flightId;
    public int maxPassengers;
    public int currentPassengers;
    public int available_seats;
    public String destinationCity;




//    public Plane2(UUID flightId, int maxPassengers, int currentPassengers, int availableSeats) {
        this.flightId = new Random().nextInt(1000, 9999);
        this.maxPassengers = maxPassengers;
        this.currentPassengers = currentPassengers;
        this.available_seats = availableSeats;
        String[] cities = {"Warsaw", "London", "Roma", "Amsterdam", "New York", "Madrid", "Paris", "Barcelona"};
        int randomIndex = new Random().nextInt(cities.length);
        this.destinationCity = cities[randomIndex];


}

    public void goTo() {
        System.out.println("The plane " + flightId +
                " is going to " + destinationCity + " with " + currentPassengers + " passengers out of " +
                maxPassengers + " possible. " + available_seats + " available seats");
    }
    }
