package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Model.Address;
import com.example.demo.Model.Employee;
import com.example.demo.Service.AddressService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressRepositoryTest {

	@Autowired
	private AddressService addrserv;

	@Test
	public void test() {
		Employee emp = new Employee();
		emp.setId(2222);
		emp.setName("riya");
		

		Address addr = new Address("xyz", 1111);
		addrserv.save(addr);
		Address ad1 = addrserv.findOne(addr.getPin());
		assertNotNull(ad1);
		assertEquals("xyz", ad1.getStreet());
		assertEquals(1, addrserv.findall().size());
		
		addr.setEmployee(emp);
		assertNotNull(emp);
	}

}
