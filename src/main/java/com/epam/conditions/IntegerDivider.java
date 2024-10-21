package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        double value;
        try {
            value = dividend/divider;
            if (value*divider==dividend){
                System.out.println("can be divided completely");
            } else{
                System.out.println("cannot be divided completely");
            }
        } catch (ArithmeticException e){
            System.out.println("division by zero");
        }



    }

}
