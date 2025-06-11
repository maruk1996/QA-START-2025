package org.prog;

import java.util.UUID;
import java.util.Random;
public class Homework7 {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());

        Random rand = new Random();

        String[] cities = new String[5];
        cities[0] = "Warsaw";
        cities[1] = "Paris";
        cities[2] = "Madrid";
        cities[3] = "Amsterdam";
        cities[4] = "London";


        Plane2[] planes = new Plane2[10];
        for (int i = 0; i < planes.length; i++) {
            planes[i] = new Plane2();
            planes[i].flightId = UUID.randomUUID();
            planes[i].destinationCity = cities[rand.nextInt(cities.length)];
            planes[i].maxPassengers = rand.nextInt(100, 200);
            planes[i].currentPassengers = rand.nextInt(planes[i].maxPassengers + 1);
            planes[i].availableSeats = planes[i].maxPassengers - planes[i].currentPassengers;




            planes[i].goTo();

        }

        System.out.println("Planes with half or less seats occupied:");

        for (int b = 0; b < planes.length; b++) {
            if (planes[b].currentPassengers <= planes[b].maxPassengers / 2) {
                planes[b].goTo();
            }
        }









        }
    }
