package org.prog.session5;

import java.util.*;

public class MapCarOwners {
    public static void main(String[] args) {
        // tax id, each tax id can have 1-5 FOPs
        Map<String, List<String>> map = new HashMap<>();
        map.put("Dmytro Ivanov", new ArrayList<>());

        map.get("Dmytro Ivanov").add(randomColor() + " BMW X5" );
        map.get("Dmytro Ivanov").add(randomColor() + " BMW X3" );
        map.get("Dmytro Ivanov").add(randomColor() + " Audi A4");


        map.put("Mykola Shevchenko", new ArrayList<>());
        map.get("Mykola Shevchenko").add(randomColor() + " Audi SQ8" );
        map.get("Mykola Shevchenko").add(randomColor() + " Skoda Karoq");

        map.put("Viktoria Kovalchuk", new ArrayList<>());
        map.get("Viktoria Kovalchuk").add(randomColor() + " Renault Arcana" );
        map.get("Viktoria Kovalchuk").add(randomColor() + " Volkswagen T-Roc");
        map.get("Viktoria Kovalchuk").add(randomColor() + " Tesla Model 3");

        List<String> stringListCarsOwners1 = map.get("Dmytro Ivanov");

        for (String someString : stringListCarsOwners1) {
            System.out.println("Citizen Dmytro Ivanov has : " + someString);
        }


        List<String> stringListCarsOwners2 = map.get("Mykola Shevchenko");

        for (String someString : stringListCarsOwners2) {
            System.out.println("Citizen Mykola Shevchenko has : " + someString);
        }
        List<String> stringListCarsOwners3 = map.get("Viktoria Kovalchuk");
        for (String someString : stringListCarsOwners3) {
            System.out.println("Citizen Viktoria Kovalchuk  has : " + someString);
        }

    }

    public static String randomColor() {
        Random random = new Random();
        return switch (random.nextInt(6)) {
            case 0 -> "red";
            case 1 -> "green";
            case 2 -> "blue";
            case 3 -> "yellow";
            case 4 -> "pink";
            default -> "black";

        };
    }
}