package org.example;

public interface CargoCarrier {
    default void carryCargo() {
        System.out.println("Вожу грузы");
    }
}
