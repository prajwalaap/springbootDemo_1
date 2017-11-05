package com.example.demo.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
