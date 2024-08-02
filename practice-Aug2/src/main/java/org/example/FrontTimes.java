package org.example;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        int frontLen = 3; // Length of the front part to repeat

        // If the string is shorter than 3 characters, use its entire length
        if (frontLen > str.length()) {
            frontLen = str.length();
        }

        // This gets the substring of the first 'frontLen' characters
        String front = str.substring(0, frontLen);

        // This initializes the result string
        String result = "";

        // This appends the 'front' part 'n' times to the result string
        for (int i = 0; i < n; i++) {
            result = result + front;
        }

        // This returns the final concatenated result
        return result;
    }
}