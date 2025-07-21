package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Taxi taxi = new Taxi();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();
        Boat boat = new Boat();
        Tanker tanker = new Tanker();
        
        truck.move();
        taxi.move();
        airplane.move();
        helicopter.move();
        boat.move();
        tanker.move();

        System.out.println();

        truck.showInfo();
        taxi.showInfo();
        airplane.showInfo();
        helicopter.showInfo();
        boat.showInfo();
        tanker.showInfo();
    }
}