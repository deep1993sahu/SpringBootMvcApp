package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.model.Employee;
@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("inside support method");
		return clazz.isAssignableFrom(Employee.class);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		System.out.println("inside validate method");
		Employee emp=(Employee)target;
		
		if(emp.getFirstName()==null && emp.getFirstName().isBlank())
			errors.rejectValue("firstName","emp.firstName.required");
		
		else if(emp.getFirstName().length()>=5 || emp.getFirstName().length()<=15)
			errors.rejectValue("firstName", "The length must be 5 to 15");
		
		
		if(emp.getJobId()==null && emp.getJobId().isBlank())
			errors.rejectValue("jobId","emp.jobId.required");
		else 
		 if(emp.getJobId().length()>=5 || emp.getJobId().length()<=15)
				errors.rejectValue("jobId", "The length must be 5 to 15");
		
		if(emp.getSalary()==null)
			errors.rejectValue("salary","emp.salary.required");
		else
			if(emp.getSalary()<10000 || emp.getSalary()>20000)
				errors.rejectValue("salary", "The salary should be within 10000 to 20000");
		
		
		if(emp.getDeptId()==null)
			errors.rejectValue("deptId","emp.deptId.required");
		
		
	
		
		
		
	}

}
