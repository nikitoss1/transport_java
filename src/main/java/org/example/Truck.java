package org.example;

public class Truck extends LandVehicle implements CargoCarrier{
    public Truck() {
        super("Грузовик");
    }

    @Override
    public void move() {
        super.move();
    }

    public void showInfo() {
        System.out.println("Привет, меня зовут " + getName());
        System.out.println("Статус: ");
        carryCargo();
        showWheels();
        System.out.println();
    }
}
