package org.example;

public class SleepIn {


    public boolean sleepIn(boolean weekday, boolean vacation) {
        // If it is not a weekday or if we are on vacation, we can sleep in.
        // The `!weekday` condition checks if it is not a weekday.
        // The `vacation` condition checks if we are on vacation.
        // If either condition is true, the result is true.
        if (!weekday || vacation) {
            return true;
        }

        // If it is a weekday and we are not on vacation, we cannot sleep in.
        return false;
    }
}