package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class Employee_service {
	@Autowired
	Employee_Dao empdao;
	
	public String saveDetails(Employee e) {
		//log.info("e.name=",e);
		return empdao.saveDetails(e);
		
	}
 
	public Employee getDetails(int id) {
		return empdao.getDetails(id);
	}
	
	public String updateInformation(Employee e) {
		return empdao.updateInformation(e);
	}
	
	public String deleteInformation(Integer id) {
		return empdao.deleteInformation(id);
	
	}
	

	public List<Employee> getList() {
		return empdao.getList();
		}
	
	
	public List<Employee> getBySal(int sal1,int sal2){
		return empdao.getBySal(sal1,sal2);
	}
	
}
