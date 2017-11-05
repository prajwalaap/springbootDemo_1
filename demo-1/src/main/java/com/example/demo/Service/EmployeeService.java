package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> findall() {
		 return empRepo.findAll();
	}

	public void save(Employee emp) {
		empRepo.save(emp);
	}

	public Employee findOne(Integer id) {
		return empRepo.findOne(id);
	}

}
