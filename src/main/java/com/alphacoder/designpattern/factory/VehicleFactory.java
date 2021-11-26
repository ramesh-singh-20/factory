package com.alphacoder.designpattern.factory;

public class VehicleFactory {

    public static Vehicle  getVehicle(VehicleType type){
        return type.getConstructor().get();
    }
}
