package ru.yandex.praktikum;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;



import static org.junit.Assert.assertEquals;
import static ru.yandex.praktikum.Animal.foodExpected;


public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(2);
        assertEquals(2, feline.getKittens());

    }

    @Test
    public void getFood() throws Exception {
        Animal hungryLion = new Animal();
        assertEquals(foodExpected, hungryLion.getFood("Хищник"));
    }
}