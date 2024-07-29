package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.EmployeeServiceI;
import com.nt.validator.EmployeeValidator;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeServiceI empservice;
	
	@Autowired
	EmployeeValidator empValidator;
	
	@GetMapping("/")
	public String showHome() {
		
		return "home";
		
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String,Object> map) {
		
		System.out.println("inside get emd report");
	Iterable<Employee> emplist=	empservice.getAllEmployees();
		
	map.put("emplist", emplist);
	return "show_employee_report";
		
	}
	
//for form launching
	@GetMapping("/emp_add")
	public String showFormForSaveEmp(Map<String,Object> map) {
		
	return "register_employee";
		
	}
	
	
	@PostMapping("/emp_add")
	public String saveEmployee(Map<String,Object> map, @ModelAttribute("emp") Employee emp, RedirectAttributes attr,BindingResult error) {
		
    System.out.println("inside post emp add");
    
   if(empValidator.supports(Employee.class))
    {
    	empValidator.validate(emp, error);
    	if(error.hasErrors())
    	{
    		FieldError s=error.getFieldError();
    		System.out.println(s.toString());
    		return "register_employee";
    	}
    }
	Integer id=	empservice.registerService(emp);	
	String resultMsg="employee is saved with id" + id;
	
	//map.put("resultMsg", resultMsg);
	//map.put("emplist", emplist);
	attr.addFlashAttribute("resultMsg", resultMsg);
	
	return "redirect:emp_report";
		
	}
	
	
   @GetMapping("/emp_edit")
   public String showEditEmployeeFormPage(@RequestParam("no")int no, @ModelAttribute("emp") Employee emp,Map<String,Object> map) {
	   
	  
	  System.out.println("emp no" + no);
	  Employee emp1= empservice.getEMployeesByNo(no);
	  map.put("emp1",emp1); 
	  BeanUtils.copyProperties(emp1, emp);
	  return "update_employee";
		
	
	}
	
   @PostMapping("/emp_edit")
   public String editEmployee(@ModelAttribute("emp") Employee emp,RedirectAttributes attr) {
	   
	 System.out.println(emp.getSalary());
	 System.out.println(emp);
	 String msg=empservice.updateEmployee(emp);
	 attr.addFlashAttribute("resultMsg",msg);
	 
	 return "redirect:emp_report";
		
	
	}
	

}
