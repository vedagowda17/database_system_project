package com.niral.database_System_Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niral.database_System_Project.dao.EmployeeDao;
import com.niral.database_System_Project.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}

	public Employee updateEmployee(String role, Employee employee) {
		return employeeDao.updateEmployee(role, employee);
	}

	public Employee updateRole(int id, String role) {
		return employeeDao.updateRole(id, role);
	}

	public Employee updateSalary(int id, double salary) {
		return employeeDao.updateSalary(id, salary);
	}

	public Employee updateTeamName(int id, String teamName) {
		return employeeDao.updateTeamName(id, teamName);
	}

	public Employee deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

	public void deleteAllEmployee() {
		employeeDao.deleteAllEmployee();
	}

	public List<Employee> fetchByName(String name) {
		return employeeDao.fetchByName(name);
	}
	
	public Employee deleteByName(String name) {
		return employeeDao.deleteByName(name);
	}
	
	public List<String> fetchUniqueNames() {
		return employeeDao.fetchUniqueNames();
	}

	public List<Employee> salaryFetchBetweenMinAndMax(){
		return employeeDao.salaryFetchBetweenMinAndMax();
	}
}
