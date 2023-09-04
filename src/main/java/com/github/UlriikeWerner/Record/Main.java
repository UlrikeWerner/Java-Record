package com.github.UlriikeWerner.Record;

public class Main {
    public static void main(String[] args) {
        Species felidae = new Species("Felidae", 100);
        Animal muffin = new Animal(12, "Muffin", felidae, 12, new Owner("Sabine Klein", 35, "Lange Str. 12"));
        Animal arya = new Animal(11, "Arya", felidae, 12, new Owner("Dieter Paulsen", 12, "Test Str.42"));
        Animal flash = new Animal(1, "Flash", new Species("Rattus", 20), 2, new Owner("Hannah Schmidt", 7, "Auf der Koppel 2"));

        System.out.println(muffin);
        System.out.println(flash.ID() + ", " + flash.age() + ", " + flash.owner().fullName() + ", " + flash.species().species());
        System.out.println(muffin.equals(arya));

        System.out.println("-------------------");
        Animal copyFlash = flash.withName("Fluffy");
        System.out.println(copyFlash);

    }
}
