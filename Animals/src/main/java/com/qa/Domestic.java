package com.qa;

public class Domestic extends Cat{

    @Override
    public String meow(){
        String pitch = "low";
        String terror_level = null;
        String Loudness = null;
        return pitch + terror_level + Loudness;
    }

}
