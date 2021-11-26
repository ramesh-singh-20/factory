package com.alphacoder.designpattern.factory;

public class Ship implements Vehicle{
    private static final String DESCRIPTION= "This is a ship.";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
