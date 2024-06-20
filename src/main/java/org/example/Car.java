package org.example;

public class Car {

   private int mileage;


    void drive(int distance) {
        if (distance > 0) {
            mileage += distance;
        }
    }


}
