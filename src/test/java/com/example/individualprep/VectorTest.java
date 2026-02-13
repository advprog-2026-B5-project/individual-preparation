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
}