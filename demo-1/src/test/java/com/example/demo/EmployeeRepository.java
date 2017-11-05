package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Model.Address;
import com.example.demo.Model.Employee;
import com.example.demo.Service.AddressService;
import com.example.demo.Service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepository {

	@Autowired
	private EmployeeService empserv;

	@Test
	public void test1() {
		Employee emp = new Employee(1111,"sdf");
		empserv.save(emp);
		Employee emp2 = empserv.findOne(emp.getId());
		assertNotNull(emp2);
		assertEquals("sdf",emp2.getName());
		assertEquals(1,empserv.findall().size());
		
		
	}
	
	@Test
	public void test2() {
		Address adr1 = new Address();
		Address adr2 = new Address();
		
		Integer pin1 = 2222;
		adr1.setPin(pin1);
		String street1 = "street1";
		adr1.setStreet(street1 );
		
		Integer pin2 = 3333;
		adr2.setPin(pin2);
		String street2 = "street2";
		adr2.setStreet(street2);
		
		Employee emp = new Employee();
		emp.getAddress().add(adr1);
		emp.getAddress().add(adr2);
		
		assertNotNull(emp.getAddress());
		assertEquals(2,emp.getAddress().size());
		
		List<Address> listOfAddress = emp.getAddress();
		assertTrue(listOfAddress.contains(adr1));

	}

}
