package org.example;

public class Helicopter extends AirVehicle implements Propelled {
    public Helicopter() {
        super("Хэликоптер");
    }

    @Override
    public void move() {
        super.move();
    }

    public void showInfo() {
        System.out.println("Привет, меня зовут " + getName());
        System.out.println("Статус: ");
        showPropeller();
        carryCargo();
        System.out.println();
    }
}
