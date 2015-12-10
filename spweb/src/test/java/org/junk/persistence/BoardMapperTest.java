package org.junk.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junk.domain.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardMapperTest {

	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void test() throws Exception {

		Criteria cri = new Criteria();
		cri.setPageNo(2);
		cri.setPerPage(20);
		
		cri.setSearchType("t");
		cri.setKeyword("영준");
		
		System.out.println(mapper.search(cri));
	}

}
