package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_controller {

	@Autowired
	Employee_service empser;

	@PostMapping(value = "/add")
	public String saveDetails(@RequestBody Employee e) {
		return empser.saveDetails(e);
	}

	@GetMapping(value = "/show/{id}")
	public Employee getDetails(@PathVariable int id ) {
		return empser.getDetails(id);
	}

	@PutMapping(value = "/update")
	public String updateInformation(@RequestBody Employee e) {
		return empser.updateInformation(e);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteInformation(@PathVariable Integer id) {
		return empser.deleteInformation(id);
	}

	@GetMapping(value = "/getViaSal/{sal1}/{sal2}")
	public List<Employee> getBySal(@PathVariable int sal1, @PathVariable int sal2) {
		return empser.getBySal(sal1, sal2);

	}
}
