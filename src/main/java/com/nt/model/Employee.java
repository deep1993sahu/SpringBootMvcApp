package com.nt.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id",nullable = false)
	private Integer empId;
	
	@Column(name ="first_name",length = 20)
	private String firstName;
	
	@Column(name="job_id",length = 20)
	private String jobId;
	
	@Column(name="salary")
	private Integer	 salary;
	
	@Column(name="department_id")
	private Integer deptId;

}
