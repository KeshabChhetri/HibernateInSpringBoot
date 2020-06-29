package com.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringHibernate implements CommandLineRunner {
	@Autowired
	private EmployeeDao employeeDao;
	public static void main(String args[]) {
		SpringApplication.run(SpringHibernate.class,args);
	}
	
	
	public void run(String[] args) throws Exception{
		Employee employee = getEmployee();
		employeeDao.createEmployee(employee);
	}
	
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setName("Nikesh");
		employee.setSalary(40000.00);
		
		
		
		return employee;
	}
	

}
