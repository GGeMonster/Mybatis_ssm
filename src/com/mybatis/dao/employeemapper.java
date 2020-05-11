package com.mybatis.dao;



import java.util.List;

import com.mybatis.bean.Employee;



public interface employeemapper {
	
	public  Employee  getempbyId(Integer id);
	
	public  List<Employee>  getempList();
	
	
	
}
