package org.prog;

public class Homework6 {
    public static void main(String[] args){
         Plane AirBalticPlane = new Plane();
         Plane LotPlane = new Plane();
         Plane FlyEmiratesPlane = new Plane();

         AirBalticPlane.flight_ID = "AA1001";
         LotPlane.flight_ID = "PL4066";
         FlyEmiratesPlane.flight_ID = "EA5200";

         AirBalticPlane.maxPassengers = "180";
         LotPlane.maxPassengers = "150";
         FlyEmiratesPlane.maxPassengers = "320";

         AirBalticPlane.currentPassengers = "178";
         LotPlane.currentPassengers = "150";
         FlyEmiratesPlane.currentPassengers = "315";

         AirBalticPlane.destination = "Madrid";
         LotPlane.destination = "Roma";
         FlyEmiratesPlane.destination = "Dubai";

         AirBalticPlane.goTo();
         LotPlane.goTo();
         FlyEmiratesPlane.goTo();







    }

}
