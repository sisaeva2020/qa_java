package com.example;

import org.junit.Test;


import static com.example.Animal.foodExpected;
import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void eatMeat() throws Exception {
        Feline hungryFeline = new Feline();
        assertEquals(foodExpected, hungryFeline.eatMeat());
    }

    @Test
    public void getFamily() {
        Feline familyFeline = new Feline();
        assertEquals("Кошачьи", familyFeline.getFamily());
    }

    @Test
    public void getKittens() {
        Feline felineBrood = new Feline();
        assertEquals(1, felineBrood.getKittens());
    }

}