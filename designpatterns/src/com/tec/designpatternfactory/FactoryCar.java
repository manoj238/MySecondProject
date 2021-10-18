package com.tec.designpatternfactory;

import java.util.Scanner;

public class FactoryCar {
	public static Car getCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any car name");
		String cars = scanner.next();
		if(cars.equalsIgnoreCase("audi")) {
			return new Audi();
		}else {
			return null;
		}
	}
}
