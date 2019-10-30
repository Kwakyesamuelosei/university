package test;

import maths.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sum() {
        int sum = Numbers.sum(2,3);
        int expected = 5;
        assertEquals(expected,sum);
    }

    @Test
    void isPositive() {
        boolean isPositive = Numbers.isPositive(2);
        assertTrue(isPositive);
    }
    @Test
    void isPositive2() {
        boolean isPositive2 = Numbers.isPositive(-2);
        assertFalse(isPositive2);
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