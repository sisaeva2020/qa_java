package ru.yandex.praktikum;

import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class LionManeTest {
    private String sex;
    private Boolean expectedResult;

    public LionManeTest (String sex, boolean expectedResult) {
        this.sex = sex;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"Львенок", false},
        };
    }


    @Test
    public void doesLionHasMane() throws Exception {
        Lion lionSex = new Lion(sex);
        assertEquals(expectedResult, lionSex.doesHaveMane());
    }

}