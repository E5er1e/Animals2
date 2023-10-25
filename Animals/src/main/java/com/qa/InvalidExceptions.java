package com.qa;

public class InvalidExceptions extends Exception{

    public InvalidExceptions() {
        super("Your object is in an invalid state");
    }

    public InvalidExceptions(String Message) {
        super(Message);
    }
}
