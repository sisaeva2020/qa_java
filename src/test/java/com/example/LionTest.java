package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static com.example.Animal.foodExpected;
import static org.junit.Assert.assertEquals;



@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        int expectedResult = 3;
        Mockito.when(feline.getKittens()).thenReturn(expectedResult);
        Lion lion = new Lion("Самка", feline);
        int actualResult = lion.getKitty(feline.getKittens());
        assertEquals(expectedResult, actualResult);
        }

}