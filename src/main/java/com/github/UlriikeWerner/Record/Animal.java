package com.github.UlriikeWerner.Record;

public record Animal(
        int ID,
        String name,
        Species species,
        int age,
        Owner owner
) {
}
