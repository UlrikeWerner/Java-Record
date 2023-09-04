package com.github.UlriikeWerner.Record;

public record Animal(
        int ID,
        String name,
        Species species,
        int age,
        Owner owner
) {
    public Animal withID(int id){
        return new Animal (id, name, species, age, owner);
    }
    public Animal withName(String name){
        return new Animal (ID, name, species, age, owner);
    }
    public Animal withSpecies(Species species){
        return new Animal (ID, name, species, age, owner);
    }
    public Animal withAge(int age){
        return new Animal (ID, name, species, age, owner);
    }
    public Animal withOwner(Owner owner){
        return new Animal (ID, name, species, age, owner);
    }
}
