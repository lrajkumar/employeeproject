package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface Employee_Repo extends JpaRepository<Employee,Integer> {

	@Query(value="select*from employee_info where salary >=:sal1 AND Salary <=:sal2", nativeQuery=true)
	public List<Employee> getBySal(@PathVariable("sal1") int sal1, @PathVariable("sal2") int sal2);

	
}
