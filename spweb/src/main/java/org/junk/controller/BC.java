package org.junk.controller;

import org.junk.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BC {
	
	//컨트롤러 담당자는 서비스의 메소드들이 다있다고가정하고 오토와이어드시킨후 가짜데이터로 테스트해본다.
	@Autowired
	private BoardService service;
	
	private final static Logger logger = LoggerFactory.getLogger(BC.class);
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public void listAll(Model model)throws Exception{
		                        
		model.addAttribute("list",service.viewAll());
	}
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public void view(int bno, Model model)throws Exception{
		
		model.addAttribute("view",service.view(bno));
		model.addAttribute("bno",bno);
	}
	
}
