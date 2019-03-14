/**
 * 
 * 
 *  Simple example to work with Vechicle
 * 
 */

 class Vechicle{
     int passengers;
     int fuelcap;
     int mpg;
 }

 //Main Class

 class VechicleDemo{
     public static void main(String[] args) {
         Vechicle minivan =  new Vechicle();
         int range;
         minivan.passengers = 7;
         minivan.fuelcap = 8;
         minivan.mpg = 21;

         range = minivan.fuelcap * minivan.mpg;
         //Printing

         System.out.println("Miniman can carry " + minivan.passengers + " passengers with a range of " + range);
     }
 }