package com.techne.mvcdprojects.services;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.techne.mvcdprojects.dao.MyEmployee;
import com.techne.mvcdprojects.dto.Employee;

public class EmployeeServiceValidation implements EmployeeService {

	static Scanner scanner = new Scanner(System.in);
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
	static MyEmployee employee = new MyEmployee();
	
	@Override
	public void insert() {
		System.out.println("Enter the Id");
		 id = scanner.nextInt();
		Employee finding = manager.find(Employee.class, id);
		if(finding==null) {
			employee.insert();
		}else {
			System.out.println("Id already present...! Please enter new Id to insert");
		}
	}

	@Override
	public void update() {
		System.out.println("Enter the Id");
		id = scanner.nextInt();
		Employee finding = manager.find(Employee.class, id);
		if(finding!=null) {
			employee.update();
		}else {
			System.out.println("Id is not present...! Please enter Id to insert");
		}
	}

	@Override
	public void delete() {
		System.out.println("Enter the Id");
		id = scanner.nextInt();
		Employee finding = manager.find(Employee.class, id);
		if(finding!=null) {
			employee.delete();
		}else {
			System.out.println("Id is not present...! Please enter Id to insert");
		}
	}
	
	public static int id;
	
	@Override
	public void fetch() {
		System.out.println("Enter the Id");
		id = scanner.nextInt();
		Employee finding = manager.find(Employee.class, id);
		if(finding!=null) {
			employee.fetch();
		}else {
			System.out.println("Id is not present...! Please enter Id to insert");
		}
	}
}
