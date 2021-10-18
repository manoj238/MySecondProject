package com.tec.designpatternfactory;

public class DriverCar {
	public void getDrive(Car car) {
		car.start();
		car.accelerate();
		car.breakCar();
	}
}
