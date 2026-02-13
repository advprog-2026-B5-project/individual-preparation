package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }

    public double[] subtract(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vector lengths must be equal for subtraction.");
        }

        double[] result = new double[v1.length];

        // Pengurangan per nilai di arrray
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] - v2[i];
        }

        return result;
    }

    public double[] multiply(double[] v1, int x) {
        // Multiplication of vector with scalar (v1 * x)
        int size = v1.length;
        double[] result = new double[size];

        for(int column = 0; column<size; column++){
            result[column] = v1[column] * x;
        } return result;

    }
    
    public double dotProduct(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            throw new IllegalArgumentException("Vectors must be of the same length.");
        }

        double sum = 0.0;
        for (int i = 0; i < v1.length; i++) {
            sum += v1[i] * v2[i];
        }

        return sum;
    }
    
    public double norm(double[] v1) {
        // TODO: Implement me properly!
        return 0.0;
    }
}