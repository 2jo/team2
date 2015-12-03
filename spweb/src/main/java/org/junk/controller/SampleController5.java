package org.junk.controller;

import org.junk.domain.BoardVO;
import org.junk.domain.MemberVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController5 {

	private final static Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("/doJSON")
	public @ResponseBody MemberVO doJSON(){
		MemberVO vo = new MemberVO();
		
		vo.setUserid("tt");
		vo.setUpw("ttt");
		vo.setUname("tsts");
		vo.setPhone("tt-tt-ttt");
		vo.setEmail("tsttqq");
		
		return vo;
	}
	
}
