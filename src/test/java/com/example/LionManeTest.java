package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static com.example.Animal.foodExpected;
import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionManeTest {
    private String sex;
    private Boolean expectedResult;
    private Feline feline;

    public LionManeTest(String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Львенок", false},
        };
    }


    @Test
    public void doesLionHasMane() throws Exception {
        Lion lionSex = new Lion(sex, feline);
        assertEquals(expectedResult, lionSex.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Lion hungryLion = new Lion(sex, feline);
        assertEquals(foodExpected, hungryLion.getFood("Хищник"));

    }
}