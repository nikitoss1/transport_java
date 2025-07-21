package org.example;

public class Taxi extends LandVehicle{

    public Taxi() {
        super("Такси");
    }

    @Override
    public void move() {
        super.move();
    }

    public void showInfo() {
        System.out.println("Привет, меня зовут " + getName());
        System.out.println();
    }
}
