package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        System.out.println(thousands + hundreds + tens + ones);
    }

}
