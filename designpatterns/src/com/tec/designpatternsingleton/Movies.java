package com.tec.designpatternsingleton;

public class Movies {
	static int tickets = 50;
	
	private Movies() {
		
	}
	
	public static Movies movie;
	
	public static Movies bookTickets(int noOfTickets) {
		if(movie==null) {
			movie = new Movies();
		}
		if(tickets<=0) {
			System.out.println("House full...!!");
		}else {
			System.out.println("Total no of Tickets avilable are : " + tickets);
			tickets -= noOfTickets;
			System.out.println("Tickets booked succesfully...!");
			System.out.println("no of tickets booked are : " + noOfTickets);
			System.out.println(tickets + " available tickets");
		}
		
		return movie;
	}
	
}
