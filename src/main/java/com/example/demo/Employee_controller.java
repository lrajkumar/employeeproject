package com.example.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Employee_controller {

	@Autowired
	Employee_service empser;

	@PostMapping(value = "/add")
	public String saveDetails(@RequestBody Employee e) {
		return empser.saveDetails(e);
	}

	@GetMapping(value = "/showbyid/{id}")
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

	
	@GetMapping(value="/display")
	public List<Employee> getList() {
		return empser.getList();
		}
	
	static Logger log =Logger.getLogger(Employee_controller.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView test() {
        ModelAndView model = new ModelAndView("Hello");
         
        log.info("This is an info log entry");
        log.error("This is an error log entry");
         
        return model;
    }

	
	
	
	@GetMapping(value = "/getViaSal/{sal1}/{sal2}")
	public List<Employee> getBySal(@PathVariable int sal1, @PathVariable int sal2) {
		return empser.getBySal(sal1, sal2);

	}
}
