package com.tec.designpatternfactory;

public class MainDriveCar {

	public static void main(String[] args) {
		DriverCar car = new DriverCar();
		Car car2 = FactoryCar.getCar();
		car.getDrive(car2);
	}
}
