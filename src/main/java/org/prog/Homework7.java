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


        Plane2[] planes = new Plane2[50];
        for (int i = 0; i < planes.length; i++) {
            planes[i] = new Plane2();
            planes[i].flightId = UUID.randomUUID();
            planes[i].destinationCity = cities[rand.nextInt(cities.length)];
            planes[i].maxPassengers = rand.nextInt(100, 200);
            planes[i].currentPassengers = rand.nextInt(planes[i].maxPassengers + 1);
            planes[i].availableSeats = planes[i].maxPassengers - planes[i].currentPassengers;
            planes[i].percentageOfSeatsTakes = planes[i].currentPassengers * 100 / planes[i].maxPassengers;


            planes[i].goTo();

 //           for (int b = 0; b < planes.length; b++) {
 //               if (planes[b].currentPassengers <= planes[b].maxPassengers / 2) {
 //                   planes[b].goTo();
 //               }

//                System.out.println("Planes with half or less seats occupied:");
            }

            planes = new Plane2[50];
            for (int j = 0; j < planes.length; j++) {
                planes[j] = new Plane2();
            }
            boolean unsorted = true;

            while (unsorted) {
                boolean elementsSwitched = false;
                for (int j = 0; j < planes.length - 1; j++) {
                    if (planes[j].percentageOfSeatsTakes > planes[j + 1].percentageOfSeatsTakes) {

                        int currentElement = planes[j].percentageOfSeatsTakes;
                        int previousElement = planes[j + 1].percentageOfSeatsTakes;
                        if (previousElement > currentElement) {
                            elementsSwitched = true;
                            unsorted = true;
                            planes[j].percentageOfSeatsTakes = previousElement;
                            planes[j + 1].percentageOfSeatsTakes = currentElement;
                        }

                        if (!elementsSwitched) {
                            unsorted = false;
                        }





                        }


                    }
                }
            }
        }
