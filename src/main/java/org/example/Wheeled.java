package org.example;

public interface Wheeled {
     default void showWheels() {
         System.out.println("С колесами");
     }
}
