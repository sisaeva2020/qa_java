package com.example;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class LionTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline);
        assertEquals(2, lion.getKittens());
        }

}