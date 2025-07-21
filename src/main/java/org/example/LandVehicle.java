package org.example;

public abstract class LandVehicle extends Vehicle implements Wheeled{
    public LandVehicle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " едет");
    }
}
