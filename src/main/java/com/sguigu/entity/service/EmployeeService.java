package com.sguigu.entity.service;

import java.util.List;

import com.sguigu.entity.Employee;
import com.sguigu.entity.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

	@Autowired
	protected EmployeeMapper employeeMapper;
	public List<Employee> getEmps(){
		return employeeMapper.getEmps();
	}

}
