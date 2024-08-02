package org.example;

public class MonkeyTrouble {
    /*
     * Determines if we are in trouble based on the smiling status of two monkeys.
     *
     * aSmile is a boolean indicating whether monkey A is smiling
     * bSmile is a boolean indicating whether monkey B is smiling
     * We are in trouble if both are smiling or both not smiling), otherwise false (not int trouble0
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // If both monkeys are smiling, we are in trouble
        if (aSmile && bSmile) {
            return true;
        }
        // If neither monkey is smiling, we are also in trouble
        if (!aSmile && !bSmile) {
            return true;
        }
        // If one monkey is smiling and the other is not, we are not in trouble
        return false;
    }
}