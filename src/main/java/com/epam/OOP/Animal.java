package com.epam.OOP;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        StringBuilder resultString = new StringBuilder();
        resultString.append("This animal is mostly ").append(color).append(".");
        if (numberOfPaws==1) {
            resultString.append(" It has ").append(numberOfPaws).append(" paw ");
        } else {
            resultString.append(" It has ").append(numberOfPaws).append(" paws ");
        }
        if (hasFur){
            resultString.append("and a fur." );
        } else resultString.append("and no fur." );
        return resultString.toString();
    }
}
