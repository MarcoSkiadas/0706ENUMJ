package org.example;
/*
Step 1: Create an enum DaysOfWeek with the weekdays (Monday to Sunday).
Step 2: Write a method that returns the passed weekday as a string if it is a weekday (Monday to Friday), otherwise return 'Weekend'.
 */
public enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String weekDay;

    DaysOfWeek(String weekDay) {
        this.weekDay = weekDay;
    }
}
