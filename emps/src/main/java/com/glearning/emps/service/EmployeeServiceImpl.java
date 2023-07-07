package com.glearning.emps.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.emps.dao.EmployeeRepo;
import com.glearning.emps.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public Employee save(Employee employee) {
		return this.employeeRepo.save(employee);
	}

	@Override
	public Set<Employee> fetchAll() {
		return Set.copyOf(this.employeeRepo.findAll());
	}

	@Override
	public Employee findById(long id) {
		return this.employeeRepo.findById(id).orElseThrow();
	}

	@Override
	public void deleteById(long id) {
		this.employeeRepo.deleteById(id);
	}

	@Override
	public Set<Employee> findByNameLike(String name) {
		
		return this.employeeRepo.findByNameLike(name);
	}

	@Override
	public Set<Employee> findByAgeGreaterThanEqual(int age) {
		
		return this.employeeRepo.findByAgeGreaterThanEqual(age);
	}

	@Override
	public Set<Employee> findByAgeBetween(int start, int end) {
		
		return this.employeeRepo.findByAgeBetween(start, end);
	}

}
