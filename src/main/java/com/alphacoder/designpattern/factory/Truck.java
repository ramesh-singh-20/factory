package com.alphacoder.designpattern.factory;

public class  Truck implements Vehicle {
    private static final String DESCRIPTION="This is a truck.";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
