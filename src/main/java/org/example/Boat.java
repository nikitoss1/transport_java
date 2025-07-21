package org.example;

public class Boat extends WaterVehicle {

    public Boat() {
        super("Катер");
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
