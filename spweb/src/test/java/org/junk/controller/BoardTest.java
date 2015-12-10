package org.junk.controller;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junk.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardTest {

	@Autowired
	private BoardServiceImpl service;
	
	//testing for db
	@Autowired
	private DataSource ds;
	
	@Test
	public void test() throws Exception{
		
		System.out.println(service.view(23));
	}

}
