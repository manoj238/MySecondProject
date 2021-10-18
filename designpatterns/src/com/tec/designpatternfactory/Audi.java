package com.tec.designpatternfactory;

public class Audi implements Car {

	@Override
	public void start() {
		System.out.println("Audi car stated..!");
	}

	@Override
	public void accelerate() {
		System.out.println("Audi car running..!");
	}

	@Override
	public void breakCar() {
		System.out.println("Audi car parked..!");
	}

}
