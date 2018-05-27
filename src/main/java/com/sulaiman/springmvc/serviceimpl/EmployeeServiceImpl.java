package com.sulaiman.springmvc.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sulaiman.sprigmvc.model.Employee;
import com.sulaiman.springmvc.service.EmployeeService;

/**
 * 
 * @author msulaiman
 *
 */
@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	private static List<Employee> employees;
	
	static {
		employees = employeesList();
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employees;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	private static List<Employee> employeesList() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1L, "Muhammad Sulaiman Malik", 32, 100));
		employees.add(new Employee(2L, "Muhammad Sadaan Sulaiman", 18, 200));
		employees.add(new Employee(3L,"Muhammad Dawood Sulaiman", 17, 300));
		employees.add(new Employee(4L, "Muhammad Saim Sulaiman", 14, 400));
		return employees;
	}
}
