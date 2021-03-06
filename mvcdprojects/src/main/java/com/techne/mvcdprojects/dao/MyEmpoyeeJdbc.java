package com.techne.mvcdprojects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.techne.mvcdprojects.services.EmployeeServiceJdbc;

public class MyEmpoyeeJdbc implements EmployeeData {

	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet set = null;
	Scanner scanner = new Scanner(System.in);
	String dbUrl = "jdbc:mysql://localhost:3306/employee?user=root&password=root";
	
	@Override
	public void insert() {
		System.out.println("Enter the Name:");
		String name = scanner.next();
		System.out.println("Enter the salary:");
		double sal = scanner.nextDouble();
		System.out.println("Enter the Address:");
		String ads = scanner.next();
		try {
			connection = DriverManager.getConnection(dbUrl);
			String query = "insert into employee.employee values(?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, EmployeeServiceJdbc.id);
			preparedStatement.setString(3, name);
			preparedStatement.setDouble(4, sal);
			preparedStatement.setString(2, ads);
			preparedStatement.executeUpdate();
			System.out.println("Inserted Succesfylly");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		System.out.println("Enter the Name to set and update the database");
		String name = scanner.next();
		String query = "update employee.employee set name = ? where id = ?";
		try {
			connection = DriverManager.getConnection(dbUrl);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(2, EmployeeServiceJdbc.id);
			preparedStatement.setString(1, name);
			preparedStatement.executeUpdate();
			System.out.println("Updated Succesfylly");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		String query = "delete from employee.employee where id = ?";
		try {
			connection = DriverManager.getConnection(dbUrl);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, EmployeeServiceJdbc.id);
			preparedStatement.executeUpdate();
			System.out.println("Deleted Succesfylly");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void fetch() {
		
		String query = "select * from employee.employee where id = ?";
		try {
			connection = DriverManager.getConnection(dbUrl);
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, EmployeeServiceJdbc.id);
			set = preparedStatement.executeQuery();
			while (set.next()) {
				System.out.println("Id: "+set.getInt(1));
				System.out.println("Address: "+set.getString(2));
				System.out.println("Name: "+set.getString(3));
				System.out.println("Salary: "+set.getDouble(4));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
