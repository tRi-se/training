package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

/**
 * 従業員情報のEntity
 * 
 */
@Data
public class Employee {
	
	private int employee_id;
	
	private String first_name;
	
	private String last_name; 
	
	private String email; 
	
	private Date hire_date;
	
	private int salary;
	
	private int department_id;

}
