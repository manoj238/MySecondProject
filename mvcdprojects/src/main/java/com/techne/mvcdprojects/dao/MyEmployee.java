package com.techne.mvcdprojects.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.techne.mvcdprojects.dto.Employee;
import com.techne.mvcdprojects.services.EmployeeServiceValidation;

public class MyEmployee implements EmployeeData {
	
	static Employee employee = new Employee();
	static Scanner scanner = new Scanner(System.in);
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();
	
	@Override
	public void insert() {
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double sal = scanner.nextDouble();
		System.out.println("Enter the Adress");
		String ads = scanner.next();
		
		employee.setId(EmployeeServiceValidation.id);
		employee.setName(name);
		employee.setSal(sal);
		employee.setAddress(ads);
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}

	@Override
	public void update() {
			System.out.println("Do You want to update the name Yes / No");
			String string = scanner.next();
			if(string.equalsIgnoreCase("yes")) {
				transaction.begin();
				System.out.println("Enter the Name");
				String name = scanner.next();
				String update = "update Employee set name = :name where id = :id";
				Query query = manager.createQuery(update);
				query.setParameter("name", name);
				query.setParameter("id", EmployeeServiceValidation.id);
				query.executeUpdate();
				transaction.commit();
			}
			System.out.println("Do You want to update the salary Yes / No");
			String string2 = scanner.next();
			if(string2.equalsIgnoreCase("yes")) {
				transaction.begin();
				System.out.println("Enter the salary");
				double sal = scanner.nextDouble();
				String update = "update Employee set sal = :sal where id = :id";
				Query query = manager.createQuery(update);
				query.setParameter("sal", sal);
				query.setParameter("id", EmployeeServiceValidation.id);
				query.executeUpdate();
				transaction.commit();
			}
			System.out.println("Do You want to update the Address Yes / No");
			String string3 = scanner.next();
			if(string3.equalsIgnoreCase("yes")) {
				transaction.begin();
				System.out.println("Enter the Address");
				String ads = scanner.next();
				String update = "update Employee set address = :ads where id = :id";
				Query query = manager.createQuery(update);
				query.setParameter("ads", ads);
				query.setParameter("id", EmployeeServiceValidation.id);
				query.executeUpdate();
				transaction.commit();
			}
	}

	@Override
	public void delete() {
			transaction.begin();
			String delete = "delete from Employee where id = :id";
			Query query = manager.createQuery(delete);
			query.setParameter("id", EmployeeServiceValidation.id);
			query.executeUpdate();
			transaction.commit();
	}

	@Override
	public void fetch() {
			String query = "from Employee where id = :id";
			Query query2 = manager.createQuery(query);
			query2.setParameter("id", EmployeeServiceValidation.id);
			System.out.println(query2.getSingleResult());
		}
}
