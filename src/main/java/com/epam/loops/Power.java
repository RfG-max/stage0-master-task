package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int value=1;
        for (int i = 1; i <= power; i++){
            value = value*numberToPrint;
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
