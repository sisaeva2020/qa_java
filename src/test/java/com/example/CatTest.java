package com.example;

import org.junit.Test;


import static com.example.Animal.foodExpected;
import static org.junit.Assert.assertEquals;


public class CatTest {

    @Test
    public void getSound() {
        Feline feline = new Feline();
        Cat meoCat = new Cat(feline);
        assertEquals("Мяу", meoCat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Cat hungryCat = new Cat(feline);
        assertEquals(foodExpected, hungryCat.getFood());
    }
}