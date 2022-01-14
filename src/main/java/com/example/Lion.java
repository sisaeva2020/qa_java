package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;

        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }

    }

    public int getKitty(int kittensCount) {

        return kittensCount;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood(String animalKind) throws Exception {
        return feline.getFood("Хищник");
    }

}


