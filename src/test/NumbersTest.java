package test;

import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.NumberUp;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sum() {
        int sum = Numbers.sum(2,2);
        int expected = 4;
        assertEquals(expected,sum);
    }

    @Test
    void isPositive() {
        boolean isPositive = Numbers.isPositive(2);
        assertTrue(isPositive);
    }

    @Test
    void isNegative() {
        boolean isNegative = Numbers.isNegative(-2);
        assertTrue(isNegative);
    }

    @Test
    void isEvenNumberAndGreaterThanZero() {
        boolean result = Numbers.isEvenNumberAndGreaterThanZero(8);
        assertTrue(result);
    }

    @Test
    void isLeapYear() {
        boolean leapYear = Numbers.isLeapYear(2000);
        assertTrue(leapYear);
    }
}