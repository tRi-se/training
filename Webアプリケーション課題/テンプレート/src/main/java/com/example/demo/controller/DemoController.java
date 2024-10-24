package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeesService;

/**
 * コントローラー
 * 
 */
@Controller
public class DemoController {
	
	@Autowired
	private EmployeesService emp;
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	
	@RequestMapping(path = "allEmp", method =RequestMethod.POST)
	public Model listAll(@RequestParam("name") String name, Model model) {
		
		
		//従業員情報の検索
		List<Employee> emps = emp.selectAll();
		
		//画面側へ結果を格納
		model.addAttribute("emps", emps);
		model.addAttribute("name" , name);
		
		return model;
	}

}
