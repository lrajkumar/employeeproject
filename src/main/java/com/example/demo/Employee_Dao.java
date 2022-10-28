package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class Employee_Dao {
	@Autowired
	Employee_Repo emprepo;
	
	public String saveDetails(Employee e) {
		emprepo.save(e);
		return "Successfully succed";
	}
	
	public Employee getDetails(int id) {
		return emprepo.findById(id).get();
	}
	public String updateInformation(Employee e) {
		emprepo.save(e).getId();
		return "Data Updated";
	}
  public String deleteInformation(Integer id) {
	  emprepo.deleteById(id);
	  return "Data has been deleted";
  }
  
  public List<Employee> getList() {
		return emprepo.findAll();
	}
  
  
  public List<Employee> getBySal(int sal1,int sal2){
	 return emprepo.getBySal(sal1,sal2);
  }
  
  
  
}
