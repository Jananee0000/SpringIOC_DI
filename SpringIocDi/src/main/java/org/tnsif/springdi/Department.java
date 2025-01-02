package org.tnsif.springdi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;


public class Department {
	private ArrayList<Employee> employeeList;

	//setter based injection
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	//To get the second highest salary of the employee
	public Double getSecondHighestSalary() {
		
		// Step 1: Extract and sort salaries
	    Stream<Double> salaryStrm = employeeList.stream()
	            .map(Employee::getSalary)   // Extract salaries
	            .distinct() ;                // Remove duplicates
	    
	    	// Sort in descending order
	    Stream<Double> sortedSalaries = salaryStrm.sorted(Comparator.reverseOrder()); 
	    
	    // Step 2: Skip the highest salary and get the second highest
	    Optional<Double> secondHighestSalary = sortedSalaries.skip(1).findFirst(); // Get the second highest if it exists
	    return secondHighestSalary.orElse(null); // Return null if not found
	    
	   
	    
        
    }
}
