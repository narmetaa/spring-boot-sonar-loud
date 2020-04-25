package com.example.serviecs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Employee;
import com.example.repositorys.Employeerepository;

@Service
public class Employeeservice {

	@Autowired
	private Employeerepository repository;

	public Employee saveEmployee(Employee employee) {

		return repository.save(employee);
	}

	public List<Employee> findAll() {

		List<Employee> findAll = repository.findAll();
		return findAll;
	}

	public Optional<Employee> findByid(Long id) {
		Optional<Employee> findById = repository.findById(id);

		return findById;
	}

}
