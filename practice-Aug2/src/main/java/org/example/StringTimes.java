package org.example;

public class StringTimes {
    /*
     * This method takes a string and an integer n, and returns a new string that is
     * the original string repeated "n" times.
     *
     * str: The original string to be repeated.
     * n: The number of times to repeat the string.
     * A new string that is the original string repeated "n" times.
     */
    public String stringTimes(String str, int n) {
        // This initializes an empty string to build the result
        String result = "";

        // This loops "n" times to append the original string to the result
        for (int i = 0; i < n; i++) {
            result = result + str;  // Alternatively, you could use result += str;
        }

        // This returns the final concatenated string
        return result;
    }
}
