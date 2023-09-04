package com.github.UlriikeWerner.Record;

import java.util.List;

public record Zoo (
        List<Animal> animalInZoo
) {
    public int calculateTotalFeedRequirement(){
        int result = 0;
        for(Animal animal : animalInZoo){
            result += animal.species().feedRequirementInGramsPerDay();
        }
        return result;
    }
}
