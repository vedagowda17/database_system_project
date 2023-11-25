package com.niral.database_System_Project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.niral.database_System_Project.dto.Employee;
import com.niral.database_System_Project.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@PutMapping("updateByRole")
	public Employee updateEmployee(@RequestParam String role, @RequestBody Employee employee) {
		return employeeService.updateEmployee(role, employee);
	}

	@PatchMapping("updateRole")
	public Employee updateRole(@RequestParam int id, @RequestParam String role) {
		return employeeService.updateRole(id, role);
	}

	@PatchMapping("updateSalary")
	public Employee updateSalary(@RequestParam int id, @RequestParam double salary) {
		return employeeService.updateSalary(id, salary);
	}

	@PatchMapping("updateTeamName")
	public Employee updateTeamName(@RequestParam int id, @RequestParam String teamName) {
		return employeeService.updateTeamName(id, teamName);
	}

	@DeleteMapping("deleteEmployee")
	public Employee deleteEmployee(@RequestParam int id) {
		return employeeService.deleteEmployee(id);
	}

	@DeleteMapping("deleteAll")
	public void deleteAllEmployee() {
		employeeService.deleteAllEmployee();
	}

	@GetMapping("fetchByName")
	public List<Employee> fetchByName(@RequestParam String name) {
		return employeeService.fetchByName(name);
	}

	@DeleteMapping("deleteByName")
	public Employee deleteByName(String name) {
		return employeeService.deleteByName(name);
	}
	
	@GetMapping("fetchUniqueNames")
	public List<String> fetchUniqueNames() {
		return employeeService.fetchUniqueNames();
	}

	@GetMapping("salaryFetchBetweenMinAndMax")
	public List<Employee> salaryFetchBetweenMinAndMax(){
		return employeeService.salaryFetchBetweenMinAndMax();
	}
}
