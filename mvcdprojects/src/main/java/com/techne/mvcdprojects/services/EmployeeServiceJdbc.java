package com.techne.mvcdprojects.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.techne.mvcdprojects.dao.MyEmpoyeeJdbc;

public class EmployeeServiceJdbc implements EmployeeService {

	static String dbUrl = "jdbc:mysql://localhost:3306/employee?user=root&password=root";
	static Scanner scanner = new Scanner(System.in);
	static Connection connection = null;
	static PreparedStatement statement = null;
	static ResultSet set = null;
	MyEmpoyeeJdbc jdbc = new MyEmpoyeeJdbc();
	
	public static int id;
	@Override
	public void insert() {
		System.out.println("Enter the id to Insert");
		id = scanner.nextInt();
		try {
			connection = DriverManager.getConnection(dbUrl);
			String query = "select * from employee.employee where id = ?";
			
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			set = statement.executeQuery();
			if(set.next()!=true) {
				jdbc.insert();
			}else {
				System.out.println("id is already present");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update() {
		System.out.println("Enter the id to Update");
		id = scanner.nextInt();
		try {
			connection = DriverManager.getConnection(dbUrl);
			String query = "select * from employee.employee where id = ?";
			
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			set = statement.executeQuery();
			if(set.next()==true) {
				jdbc.update();
			}else {
				System.out.println("id is already present");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		System.out.println("Enter the id to Delete");
		id = scanner.nextInt();
		try {
			connection = DriverManager.getConnection(dbUrl);
			String query = "select * from employee.employee where id = ?";
			
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			set = statement.executeQuery();
			if(set.next()==true) {
				jdbc.delete();
			}else {
				System.out.println("id is already present");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void fetch() {
		System.out.println("Enter the id to fetch the record");
		id = scanner.nextInt();
		try {
			connection = DriverManager.getConnection(dbUrl);
			String query = "select * from employee.employee where id = ?";
			
			statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			set = statement.executeQuery();
			if(set.next()==true) {
				jdbc.fetch();
			}else {
				System.out.println("id is already present");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
