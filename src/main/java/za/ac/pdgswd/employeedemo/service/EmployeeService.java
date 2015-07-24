package za.ac.pdgswd.employeedemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import za.ac.pdgswd.employeedemo.database.DatabaseClass;
import za.ac.pdgswd.employeedemo.exception.DataNotFoundException;
import za.ac.pdgswd.employeedemo.model.Employee;

public class EmployeeService {

	private Map<String, Employee> employees = DatabaseClass.getInstance();
	
	public EmployeeService(){
		employees.put("thembi", new Employee((long)1,
											 "Thembelani Momoti",
				                             "thembi",
				                             "lonwabo.momoti@gmail.com",
				                             "071 194 6513",
				                             "Junior Java Developer/ Web Developer"));
		
		employees.put("hc", new Employee((  long)2,
				 							"Heinrich Cockrell",
                							"hc",
                							"heinrichc@digital.pepkorit.com",
                							"071 194 6513",
                							"Junior Software Test Analyst"));
		
		employees.put("lulu", new Employee((long)3,
				 							"Ludwekazi Jodwana",
											"lulu",
											"ludwekazi@digital.pepkorit.com",
											"071 194 6513",
											"Junior Software Test Analyst"));
		
		employees.put("mish", new Employee((long)4,
				 							"Michelle Hercules",
											"mish",
											"michelleh@digital.pepkorit.com",
											"071 194 6513",
											"Analyst Programmer"));
		
		employees.put("hd", new Employee((long)5,
				 							"Heinrich Davids",
											"hd",
											"heinrichd@digital.pepkorit.com",
											"071 194 6513",
											"Junior PL SQL Developer"));
		
		employees.put("ntombi", new Employee((long)6,
				 							"Ntombi Mazibuko",
											"ntombi",
											"ntombim@digital.pepkorit.com",
											"071 194 6513",
											"Junior C#/.NET Developer"));
		
	}
	
	public List<Employee> getAllEmployees(){
		return new ArrayList<Employee>(employees.values());
	}
	
	public Employee getEmployee(String shortname){
		Employee emp =  employees.get(shortname);
		if (emp == null){
			throw new DataNotFoundException("Employee with name "+ shortname +" is not found" );
		}
		return emp;
	}
	
	public Employee addEmployee(Employee employee){
		for(Employee emp : employees.values()){
			if(emp.getName().equals(employee.getName())){
				return null;
			}if(emp.getShortname().equals(employee.getShortname())){
				return null;
			}
		}
		employee.setId(employees.size()+1);
		employees.put(employee.getShortname(), employee);
		return employee;
	}
	
	public Employee updateEmployee(String shortname, Employee employee){
		for(Employee emp : employees.values()){
			if((emp.getShortname().equalsIgnoreCase(shortname))){
				return employees.put(shortname, employee);
			}
		}
		return null;
	}
	
	public void deleteEmployee(String shortname){
		employees.remove(shortname);
		
	}
}
