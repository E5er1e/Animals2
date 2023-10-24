package com.qa;

public class Wild extends Cat {

    @Override
    public String meow(){
        String pitch = "high";
        String terror_level = null;
        String Loudness = null;
        return pitch + terror_level +Loudness;
    }
    public Wild(String name, String colour) {
        super(name, colour); }

    public Wild() {
        this("Lion", "Yellow");
    }
}
