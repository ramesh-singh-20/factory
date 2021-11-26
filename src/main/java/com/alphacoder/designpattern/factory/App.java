package com.alphacoder.designpattern.factory;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		log.info("Logistic company starts transporting.");
		var vehicle1= VehicleFactory.getVehicle(VehicleType.TRUCK);
		var vehicle2= VehicleFactory.getVehicle(VehicleType.SHIP);

		log.info(vehicle1.getDescription());
		log.info(vehicle2.getDescription());
	}

}
