package com.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mybatis.bean.Employee;
import com.mybatis.service.EmplyeeService;

@Controller
public class EmplyeeController {
	
	@Autowired
	EmplyeeService  emplyeeservice;
	
	@RequestMapping("/emplyeeAll")
	public  String  getemp(Map<String, Object> map) {
		
		
		List<Employee> employee = emplyeeservice.getemps();
		
		map.put("employee", employee);
		return "list";
	}

}
