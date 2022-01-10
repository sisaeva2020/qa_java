package ru.yandex.praktikum;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static ru.yandex.praktikum.Animal.foodExpected;

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