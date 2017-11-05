package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests2 {

	@Autowired
	MockMvc mockmvc;

	@Test
	public void contextLoads() throws Exception {

		MvcResult mvcResult = mockmvc.perform(MockMvcRequestBuilders.get("/employees")).andReturn();
		System.out.println(mvcResult.getResponse());

	}

}