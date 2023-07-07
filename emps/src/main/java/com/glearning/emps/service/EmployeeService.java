package com.glearning.emps.service;

import java.util.Set;

import com.glearning.emps.model.Employee;

public interface EmployeeService {

	Employee save(Employee employee);

	Set<Employee> fetchAll();

	Employee findById(long id);

	void deleteById(long id);
	
	Set<Employee> findByNameLike(String name);

	Set<Employee> findByAgeGreaterThanEqual(int age);

	Set<Employee> findByAgeBetween(int start, int end);

}
