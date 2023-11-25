package com.niral.database_System_Project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.niral.database_System_Project.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query("select e from Employee e where e.empName=empName")
	List<Employee> fetchByName(String name);
	
	@Query("select e from Employee e where e.empName=empName")
	Employee fetchSingleName(String name);
	
	@Query("select distinct t.teamName from Employee t")
    List<String> findUniqueTeamNames();
	
	@Query("select e from Employee e where e.salary between 70000 and 76000")
	List<Employee> salaryFetchBetweenMinAndMax();
	
}
