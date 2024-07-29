package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.EmployeeRepo;

@Service("empservice")
public class EmployeeServiceImpl implements EmployeeServiceI {

	@Autowired
	EmployeeRepo emprepo;
	
	@Override
	public Iterable<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}

	@Override
	public Integer registerService(Employee emp) {
      return  emprepo.save(emp).getEmpId();
		
	}

	@Override
	public Employee getEMployeesByNo(int no) {
		
	    Employee emp=emprepo.findById(no).orElseThrow(()->new IllegalArgumentException());
		
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		int empId=emprepo.save(emp).getEmpId();
		return "Employee is updated with id: " + empId;
	}

}
