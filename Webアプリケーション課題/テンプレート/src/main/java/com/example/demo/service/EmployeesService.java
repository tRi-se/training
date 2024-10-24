package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeesMapper;

@Service
public class EmployeesService {
	
	
	@Autowired
	private EmployeesMapper emp;
	
	
	public List<Employee> selectAll(){
		List<Employee> list = emp.selectAll();
		return list;
	}
	
}
