package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionFoodTest {


    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        List lionFoodExpected = Arrays.asList("Животные", "Птички", "Рыбки");
        Mockito.when(feline.getFood("Хищник")).thenReturn(lionFoodExpected);
        Lion hungryLion = new Lion(feline);
        assertEquals(lionFoodExpected, hungryLion.getFood("Травоядное"));

    }

}