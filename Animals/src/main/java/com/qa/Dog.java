package com.qa;

public class Dog extends Animals implements Walkable
{
    @Override
    public void AnimalSpeech(
    ) {System.out.println("WUFF WUFF WOOF I'M A BLIMING DOGO");
    }

    @Override
    public String ShortWalk() {
        return "Dog is going on a Short Walk";
    }

    @Override
    public String Run() {
        return " Cat is going on a Run";
    }

    @Override
    public String LongWalk() {
        return " Cat is going on a Long Walk";
    }
}
