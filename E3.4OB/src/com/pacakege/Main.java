package com.pacakege;

public class Main {
    public static void main(String[] args) {
        coche micoche = new coche();
        micoche.addPuertas();
        micoche.addPuertas();
        System.out.println("Mi coche tiene " + micoche.puertas + " puertas");
    }
}

