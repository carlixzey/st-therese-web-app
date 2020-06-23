package com.optimal.web.tests.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
public class StudentControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;

	
}
