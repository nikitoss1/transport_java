package org.example;

public class Tanker extends WaterVehicle implements CargoCarrier{
    public Tanker() {
        super("Танкер");
    }

    @Override
    public void move() {
        super.move();
    }

    public void showInfo() {
        System.out.println("Привет, меня зовут " + getName());
        System.out.println("Статус: ");
        carryCargo();
        System.out.println();
    }
}
