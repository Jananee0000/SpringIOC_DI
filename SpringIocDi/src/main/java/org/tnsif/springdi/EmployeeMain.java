package org.tnsif.springdi;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("dept.xml");
		Department dept=ac.getBean("dep",Department.class);
		
		//print the list of employees
		ArrayList<Employee> list=dept.getEmployeeList();
		System.out.println(list);
		
		Double secondHighestSalary = dept.getSecondHighestSalary();

	        if (secondHighestSalary != null) {
	            System.out.println("The second highest salary is: " + secondHighestSalary);
	        } else {
	            System.out.println("The second highest salary is not found.");
	        }
	    }
		
		
	}


	


