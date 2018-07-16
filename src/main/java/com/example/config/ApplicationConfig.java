package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.Department;
import com.example.model.DepartmentImpl;
import com.example.model.Employee;
import com.example.model.EmployeeImpl;

@Configuration
@ComponentScan(basePackages = "com.example.model")
public class ApplicationConfig {
	
	 @Bean
	   public Employee getEmployee() {
	      return new EmployeeImpl();
	   }
	 
	 @Bean
	   public Department getDepartment(){
	      return new DepartmentImpl();
	   }
	
	
	

}
