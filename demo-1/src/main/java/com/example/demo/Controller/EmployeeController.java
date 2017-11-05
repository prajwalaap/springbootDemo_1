package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empServ;

	@GetMapping(value = "/employees")
	public List<Employee> findAllEmployeeDetails() {
		return empServ.findall();
	}
	
}
