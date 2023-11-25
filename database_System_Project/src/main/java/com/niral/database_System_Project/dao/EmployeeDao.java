package com.niral.database_System_Project.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niral.database_System_Project.dto.Employee;
import com.niral.database_System_Project.repo.EmployeeRepo;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepo employeeRepo;

	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Employee updateEmployee(String role, Employee employee) {
		employee.setRole(role);
		employeeRepo.save(employee);
		return employee;
	}

	public Employee fetchEmployee(int id) {
		Optional<Employee> employee = employeeRepo.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}

	public Employee updateRole(int id, String role) {
		Employee employee = fetchEmployee(id);
		employee.setRole(role);
		return saveEmployee(employee);
	}

	public Employee updateSalary(int id, double salary) {
		Employee employee = fetchEmployee(id);
		employee.setSalary(salary);
		return saveEmployee(employee);
	}

	public Employee updateTeamName(int id, String teamName) {
		Employee employee = fetchEmployee(id);
		employee.setTeamName(teamName);
		return saveEmployee(employee);
	}

	public Employee deleteEmployee(int id) {
		Employee employee = fetchEmployee(id);
		employeeRepo.delete(employee);
		return employee;
	}

	public Employee deleteByName(String name) {
		Employee employee = employeeRepo.fetchSingleName(name);
		employeeRepo.delete(employee);
		return employee;
	}

	public void deleteAllEmployee() {
		employeeRepo.deleteAll();
	}

	public List<Employee> fetchByName(String name) {
		List<Employee> employee = employeeRepo.fetchByName(name);
		return employee;
	}

	public List<String> fetchUniqueNames() {
		return employeeRepo.findUniqueTeamNames();
	}
	
	public List<Employee> salaryFetchBetweenMinAndMax(){
		return employeeRepo.salaryFetchBetweenMinAndMax();
	}

}
