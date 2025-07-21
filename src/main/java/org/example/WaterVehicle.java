package org.example;

public abstract class WaterVehicle extends Vehicle {

    public WaterVehicle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " плывет");
    }
}
