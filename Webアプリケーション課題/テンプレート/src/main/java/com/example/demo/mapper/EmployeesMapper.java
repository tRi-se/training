package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

//import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Employee;

/**
 * 従業員テーブル用のMapper
 * 
 */
@Mapper
public interface EmployeesMapper {
	
	List<Employee> selectAll();
}
