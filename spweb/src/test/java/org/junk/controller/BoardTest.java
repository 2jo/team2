package org.junk.controller;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junk.domain.BoardVO;
import org.junk.persistence.BoardMapper;
import org.junk.persistence.BoardMapperImpl;
import org.junk.service.BoardServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
