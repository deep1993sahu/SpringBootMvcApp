package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface EmployeeServiceI {
	
	public Iterable<Employee> getAllEmployees();

	public Integer registerService(Employee emp);

	public Employee getEMployeesByNo(int no);

	public String updateEmployee(Employee emp);

}
