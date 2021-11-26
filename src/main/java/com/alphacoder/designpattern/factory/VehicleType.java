package com.alphacoder.designpattern.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@Getter
@RequiredArgsConstructor
public enum VehicleType {
    TRUCK (Truck::new),
    SHIP (Ship::new);

    private final Supplier<Vehicle> constructor;

}
