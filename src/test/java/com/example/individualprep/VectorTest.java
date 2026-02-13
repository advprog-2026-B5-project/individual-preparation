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


}