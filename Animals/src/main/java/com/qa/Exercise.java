package com.qa;
public class Exercise implements Walkable {

    @Override
    public String ShortWalk() {
        return null;
    }

    @Override
    public String Run() {
        return null;
    }

    @Override
    public String LongWalk() {
        return Walkable.super.LongWalk();
    }
}
