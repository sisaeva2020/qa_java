package ru.yandex.praktikum;

import com.example.Feline;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static ru.yandex.praktikum.Animal.foodExpected;

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