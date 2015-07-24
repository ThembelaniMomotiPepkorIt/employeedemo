package za.ac.pdgswd.employeedemo.database;

import java.util.HashMap;
import java.util.Map;

import za.ac.pdgswd.employeedemo.model.Employee;

public class DatabaseClass {

	private static Map<String, Employee> employees = new HashMap<String, Employee>();
	
	public static Map<String, Employee> getInstance(){
		return employees;
	}
}
