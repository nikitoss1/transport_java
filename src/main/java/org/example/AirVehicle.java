package org.example;

public abstract class AirVehicle extends Vehicle implements CargoCarrier {
    public AirVehicle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(getName() + " летит");
    }
}
