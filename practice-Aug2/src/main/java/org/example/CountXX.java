package org.example;

public class CountXX {
    public class Example {

        public int countXX(String str) {
            // This initializes a counter to keep track of the number of "xx" substrings
            int count = 0;

            // This loops through the string, stopping one character before the end
            // because we are checking pairs of characters (i and i+1)
            for (int i = 0; i < str.length() - 1; i++) {
                // This checks if the substring from index i to i+2 equals "xx"
                if (str.substring(i, i + 2).equals("xx")) {
                    // If it does, increment the counter
                    count++;
                }
            }

            // This returns the total count of "xx" substrings
            return count;
        }
    }
}