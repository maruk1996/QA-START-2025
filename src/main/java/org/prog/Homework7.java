package org.prog;

import java.util.UUID;
import java.util.Random;
public class Homework7 {

    public static void main(String[] args) {
        System.out.println(UUID.randomUUID());

        Random random = new Random(50);
        Plane2[] planes = new Plane2[10];
        for (int i = 0; i < planes.length; i++) {
            UUID flightId = UUID.randomUUID();
            int maxPassengers = random.nextInt(100, 200);
            int currentPassengers = random.nextInt(maxPassengers + 1);
            int available_seats = maxPassengers - currentPassengers;
            planes[i] = new Plane2(flightId, maxPassengers, currentPassengers, available_seats);
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
