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