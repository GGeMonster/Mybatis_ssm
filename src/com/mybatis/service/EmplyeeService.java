package com.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.bean.Employee;
import com.mybatis.dao.employeemapper;

@Service
public class EmplyeeService {
	
	
	@Autowired
	private employeemapper employeemapper;
	
	public List<Employee> getemps(){
		
		List<Employee> employee = employeemapper.getempList();
		
		return employee;
	}

}
