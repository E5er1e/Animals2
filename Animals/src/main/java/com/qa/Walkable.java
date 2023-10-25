package com.qa;

public interface Walkable {

    String ShortWalk ();

    String Run ();


    default String LongWalk(){
        return "Go for a 3 hour walk";
    }
}