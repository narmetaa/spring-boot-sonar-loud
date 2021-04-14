package com.example.controllers;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Employee;
import com.example.serviecs.Employeeservice;

@RestController
public class Employeecontroller {

	@Autowired
	private Employeeservice service;

	@PostConstruct
	public Employee saveEmployee() {
		System.out.println("user detail will be saved");
		Employee emp = new Employee();
		emp.setEmpid(120);
		emp.setDept("it");
		Timestamp timestamp = new Timestamp(new Date().getTime());
		emp.setDoj(timestamp);
		emp.setEmpname("ashok");
		emp.setSalary(50000.00);
		System.out.println(emp.getDoj());
		return service.saveEmployee(emp);
	}

	@GetMapping("/findall")
	public List<Employee> findAll() {

		return service.findAll();

	}

	public String m1() {
		
		return null;
	}
	
	@GetMapping("/findbyid/{id}")
	public Optional<Employee> findById(@PathVariable Long id) {

		return service.findByid(id);
	}

}
