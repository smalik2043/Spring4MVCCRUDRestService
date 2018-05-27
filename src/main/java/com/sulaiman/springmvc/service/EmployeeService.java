package com.sulaiman.springmvc.service;

import java.util.List;

import com.sulaiman.sprigmvc.model.Employee;

/**
 * 
 * @author msulaiman
 *
 */
public interface EmployeeService {

	void saveEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployeeById(Long id);
	Employee findById(Long id);
	Employee findByName(String name);
	List<Employee> findAllEmployees();
	void deleteAllEmployees();
}
