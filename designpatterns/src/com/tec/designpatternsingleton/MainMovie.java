package com.tec.designpatternsingleton;

public class MainMovie {

	public static void main(String[] args) {
		Movies movies = Movies.bookTickets(10);
		System.out.println(movies);
		
		Movies movies1 = Movies.bookTickets(5);
		System.out.println(movies1);
		
		Movies movies2 = Movies.bookTickets(8);
		System.out.println(movies2);
		
		Movies movies3 = Movies.bookTickets(20);
		System.out.println(movies3);
		
		Movies movies4 = Movies.bookTickets(7);
		System.out.println(movies4);
		
		Movies movies5 = Movies.bookTickets(8);
		System.out.println(movies5);
	}
}
