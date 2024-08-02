package org.example;

public class SumDouble {
    public int sumDouble(int a, int b) {
        // Calculate the sum of the two integers a and b
        int sum = a + b;

        // Check if the two integers are equal
        if (a == b) {
            // If they are equal, double the sum
            sum = sum * 2;
        }

        // Return the final sum (doubled if a and b are equal)
        return sum;
    }
}