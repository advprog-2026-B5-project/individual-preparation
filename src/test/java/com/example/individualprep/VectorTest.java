package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    private final VectorUtility vectorUtility = new VectorUtility();

    @Test
    void testAdd() {
        double[] v1 = {1.0, 2.0, 3.0};
        double[] v2 = {4.0, 5.0, 6.0};

        double[] result = vectorUtility.add(v1, v2);

        assertArrayEquals(new double[]{5.0, 7.0, 9.0}, result);
    }

    @Test
    void testSubtract() {
        double[] v1 = {5.0, 5.0};
        double[] v2 = {2.0, 1.0};
        double[] expected = {3.0, 4.0}; // (5-2, 5-1)

        assertArrayEquals(expected, vectorUtility.subtract(v1, v2), "Vector subtraction result is incorrect");
    }
    @Test
    void testAddDifferentLength() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {3.0};

        assertThrows(IllegalArgumentException.class, () -> vectorUtility.add(v1, v2));
    }
    @Test
    void testDotProductValidInput() {
        double[] v1 = {1.0, 3.0, -5.0};
        double[] v2 = {4.0, -2.0, -1.0};

        double expected = 3.0;
        double actual = vectorUtility.dotProduct(v1, v2);

        assertEquals(expected, actual, 0.0001, "Hasil salah");
    }

    @Test
    void testDotProductEmptyVectors() {
        double[] v1 = {};
        double[] v2 = {};

        assertEquals(0.0, vectorUtility.dotProduct(v1, v2), "Hasil harus 0.0");
    }
    
    @Test
    @DisplayName("Test multiplication of vector with positive scalar")
    void testMultiply() {
        double[] v1 = {1.0, 2.0, 3.0};
        int scalar = 3;
        double[] expected = {3.0, 6.0, 9.0};

        double[] result = vectorUtility.multiply(v1, scalar);

        assertArrayEquals(expected, result, "Setiap elemen harus dikalikan dengan 3");
    }

    @Test
    @DisplayName("Test multiplication with negative scalar")
    void testMultiplyNegative() {
        double[] v1 = {1.0, -2.0, 4.0};
        int scalar = -2;
        double[] expected = {-2.0, 4.0, -8.0};

        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar));
    }

    @Test
    @DisplayName("Test multiplication with zero scalar")
    void testMultiplyZero() {
        double[] v1 = {10.0, 20.0, 30.0};
        int scalar = 0;
        double[] expected = {0.0, 0.0, 0.0};

        assertArrayEquals(expected, vectorUtility.multiply(v1, scalar));
    }


    @Test
    void testDotProductDifferentLengths() {
        double[] v1 = {1.0, 2.0};
        double[] v2 = {1.0, 2.0, 3.0};

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            vectorUtility.dotProduct(v1, v2);
        });

        assertEquals("Vectors must be of the same length.", exception.getMessage());
    }

    @Test
    void testDotProductWithZeros() {
        double[] v1 = {0.0, 5.0};
        double[] v2 = {10.0, 0.0};

        assertEquals(0.0, vectorUtility.dotProduct(v1, v2), "Hasilnya seharusnya 0.0");
    }
}