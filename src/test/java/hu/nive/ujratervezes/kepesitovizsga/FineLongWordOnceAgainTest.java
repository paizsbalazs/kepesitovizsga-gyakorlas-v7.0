package hu.nive.ujratervezes.kepesitovizsga;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FineLongWordOnceAgainTest {

    @Test
    public void testGetFineLongWordOnceAgainButNowInAReverseWay() {
        char[][] fineLongWordInAnArrayOfArrays = new FineLongWordOnceAgain().getFineLongWordOnceAgainButNowInAReverseWay("IllegalArgumentException", 6);

        Assertions.assertEquals(19, fineLongWordInAnArrayOfArrays.length);
        Assertions.assertEquals('G', fineLongWordInAnArrayOfArrays[2][2]);
        Assertions.assertEquals('X', fineLongWordInAnArrayOfArrays[12][4]);
    }
}