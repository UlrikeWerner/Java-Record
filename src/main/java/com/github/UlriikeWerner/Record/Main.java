package com.github.UlriikeWerner.Record;

public class Main {
    public static void main(String[] args) {
        Animal muffin = new Animal(12, "Muffin", "Felidae", 12);
        Animal arya = new Animal(11, "Arya", "Felidae", 12);
        Animal flash = new Animal(1, "Flash", "Rattus", 2);

        System.out.println(muffin);
        System.out.println(flash.ID() + ", " + flash.age());
        System.out.println(muffin.equals(arya));

    }
}
