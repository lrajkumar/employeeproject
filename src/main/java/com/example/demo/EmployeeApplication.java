package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class EmployeeApplication extends SpringBootServletInitializer {
	static Logger log =Logger.getLogger(EmployeeApplication.class.getName());

	public static void main(String[] args) {
		
		SpringApplication.run(EmployeeApplication.class, args);
		
		}

	}
		
		/* ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		  //ApplicationContext ctx = SpringApplication.run( EmployeeApplication.class, args);
		//SpringApplication.run(EmployeeApplication.class, args);
		log.info("Going to create HelloWord Obj");
		EmployeeApplication obj = (EmployeeApplication) context.getBean("helloWorld");
	      obj.getMessage();
		log.info("code started to run");
		log.warn("Warning Issued");
		log.fatal("fatal error");
		log.debug("debbug");
		log.error("error");
		
	}

	private void getMessage() {
		// TODO Auto-generated method stub */
	
