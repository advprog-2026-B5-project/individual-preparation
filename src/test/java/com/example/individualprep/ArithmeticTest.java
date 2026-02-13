package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {

    private final ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

    @Test
    void testExponent() {
        double result = arithmeticUtility.exponent(5.0, 2);
        assertEquals(25.0, result);
    }

    @Test
    void testExponentNegative() {
        double result = arithmeticUtility.exponent(-2.0, 3);
        assertEquals(-8.0, result);
    }

    @Test
    void testExponentZero() {
        double result = arithmeticUtility.exponent(67.0, 0);
        assertEquals(1.0, result);
    }

    void testSubtract() {
        double result1 = arithmeticUtility.subtract(5, 2);
        assertEquals(3, result1);

        double result2 = arithmeticUtility.subtract(0, 2);
        assertEquals(-2, result2);

        double result3 = arithmeticUtility.subtract(2, 2);
        assertEquals(0, result3);
    }
}