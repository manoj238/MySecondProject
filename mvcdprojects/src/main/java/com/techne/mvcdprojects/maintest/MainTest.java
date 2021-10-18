package com.techne.mvcdprojects.maintest;

import com.techne.mvcdprojects.services.EmployeeServiceJdbc;
import com.techne.mvcdprojects.services.EmployeeServiceValidation;

public class MainTest {

	public static void main(String[] args) {
//		EmployeeServiceValidation validation = new EmployeeServiceValidation();
//		validation.insert();
//		validation.delete();
//		validation.fetch();
//		validation.update();
		
		EmployeeServiceJdbc serviceJdbc = new EmployeeServiceJdbc();
		serviceJdbc.update();
	}
}
