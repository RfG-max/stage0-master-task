package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        int daysInMonth=0;

        switch (month) { // January
            // March
            // May
            // July
            // August
            // October
            case 1, 3, 5, 7, 8, 10, 12 -> // December
                    daysInMonth = 31;
            // April
            // June
            // September
            case 4, 6, 9, 11 -> // November
                    daysInMonth = 30;
            case 2 -> { // February
                // Leap year check
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Not a leap year
                }
            }
        }

        System.out.println(daysInMonth);
    }

}
