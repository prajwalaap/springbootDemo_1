package com.example.demo;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(value = Employee.class)
public class Demo1ApplicationTests {

	@Autowired
	MockMvc mockmvc;

	@MockBean
	private EmployeeService empServ;

	@Test
	public void contextLoads() throws Exception {

		Mockito.when(empServ.findall()).thenReturn(Collections.emptyList());
		MvcResult mvcResult = mockmvc.perform(MockMvcRequestBuilders.get("/employees")).andReturn();
		System.out.println(mvcResult.getResponse());
		Mockito.verify(empServ).findall();

	}

}