package org.example;

public class Airplane extends AirVehicle implements Winged, Wheeled{

    public Airplane() {
        super("Самолет");
    }

    @Override
    public void move() {
        super.move();
    }

    public void showInfo() {
        System.out.println("Привет, меня зовут " + getName());
        System.out.println("Статус: ");
        showWheels();
        carryCargo();
        System.out.println();
    }
}
