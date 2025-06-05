package org.prog;

public class Plane {

    public String flight_ID;
    public String maxPassengers;
    public String currentPassengers;
    public String destination;


    public void goTo() {
        System.out.println("The plane" + flight_ID + " is going to " + destination + ", " + "with " + currentPassengers + " passengers out of " + maxPassengers + " possible");
    }
}
