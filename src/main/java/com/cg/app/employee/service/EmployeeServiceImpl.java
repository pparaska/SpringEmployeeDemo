package com.cg.app.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.employee.dao.EmployeeDAO;
import com.cg.app.employee.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	/* (non-Javadoc)
	 * @see com.cg.app.employee.service.EmployeeService#addNewEmployee(com.cg.app.employee.pojo.Employee)
	 */
	@Override
	public void addNewEmployee(Employee employee) {
		dao.addNewEmployee(employee);
	}
}
