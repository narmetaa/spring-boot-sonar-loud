package com.example.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Long> {

}
