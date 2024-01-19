package org.example;


// Vehicle is the parent class of Bike, Car, Bus. It is sealed classes so, other classes cannot inherit.

// Car, Bike, Bus are the child classes of the Vehicle class. Child classes of a sealed class must be sealed, non-sealed, or final.

// Any other class tries to inherit from vehicle class, will cause a compiler error.

   sealed class Vehicle permits Car, Bike, Bus{
       public void print() {
           System.out.println("Vehicle Class");
       }
   }

   non-sealed class Car extends Vehicle {
       public void print() {
           System.out.println("Car Class");
       }
   }

   sealed class Bike extends Vehicle {
       public void print() {
           System.out.println("Bike Class");
       }
   }

   final class Bus extends Vehicle {
       public void print() {
           System.out.println("Bus Class");
       }
   }

   non-sealed class TvsBike extends Bike {
       public void print() {
           System.out.println("Child class of Bike");
       }
   }

public class SealedClassExample {

    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bus();

        v1.print();
        v2.print();
        v3.print();

        Bike b1 = new TvsBike();
        b1.print();

    }
}
