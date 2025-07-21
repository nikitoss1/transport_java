package org.example;

public interface Winged {
    default void showWings() {
        System.out.println("С крыльями");
    }
}
