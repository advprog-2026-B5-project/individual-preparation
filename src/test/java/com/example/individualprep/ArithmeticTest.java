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
    void testDivide() {
        // Test basic division: 10 / 2 = 5
        assertEquals(5.0, arithmeticUtility.divide(10.0, 2.0), "10 / 2 should equal 5");
    }

    @Test
    @DisplayName("Should return correct product when multiplying two positive numbers")
    void testMultiplyPositiveNumbers() {
        // Menguji perkalian standar
        double result = arithmeticUtility.multiply(4.0, 2.5);
        assertEquals(10.0, result, "4.0 multiplied by 2.5 should be 10.0");
    }

    @Test
    @DisplayName("Should handle multiplication by zero correctly")
    void testMultiplyByZero() {
        // Skenario nol sangat penting untuk coverage
        assertEquals(0.0, arithmeticUtility.multiply(0.0, 100.0), "Multiplying by zero should result in zero");
        assertEquals(0.0, arithmeticUtility.multiply(55.5, 0.0), "Multiplying anything by zero should be zero");
    }

    @Test
    @DisplayName("Should return correct result when multiplying with negative numbers")
    void testMultiplyWithNegativeNumbers() {
        // Mencakup aturan tanda matematika
        assertEquals(-15.0, arithmeticUtility.multiply(3.0, -5.0), "Positive times negative should be negative");
        assertEquals(20.0, arithmeticUtility.multiply(-4.0, -5.0), "Negative times negative should be positive");
    }





}