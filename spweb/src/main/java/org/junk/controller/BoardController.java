package org.junk.controller;

import org.junk.domain.BoardVO;
import org.junk.domain.Criteria;
import org.junk.service.BoardServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardServiceImpl service;

	private final static Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping(value="/list", method = RequestMethod.GET)
	public void listSearch(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		
		logger.info("slist page~~~~~~~~~~~~~~~~~~~");		
		
		model.addAttribute("list", service.viewPart(cri));
		
	}
	
	@RequestMapping("/list2")
	public void listAll(Model model) throws Exception {

		logger.info("list page~~~~~~~~~~~~~~~~~~~");		
		
		model.addAttribute("list", service.viewAll());
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public void getCreate(Model model) throws Exception {
		logger.info("create page~~~~~~~~~~~~~~~~~~~");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String postCreate(BoardVO vo, Model model) throws Exception {

		logger.info("create post!!");
		service.regist(vo);
		return "/board/result";
	}

	@RequestMapping("/view")
	public void view(int bno, Model model) throws Exception {
		logger.info(service.view(bno).toString());
		model.addAttribute("VO", service.view(bno));
		System.out.println(service.view(bno));
		System.out.println("hhhh");
	}
	

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public void getUpdate(int bno, Model model) throws Exception {
		
		BoardVO vo = service.view(bno);

		model.addAttribute("VO", vo);

		logger.info("update page~~~~~~~~~~~~~~~~~~~");

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String postUpdate(BoardVO vo, Model model) throws Exception {
		logger.info("update page~~~~~~~~~~~~~~~~~~~");
		logger.info(vo.toString());
		service.modify(vo);
		return "/board/result";
	}

	@RequestMapping("/delete")
	public String delete(int bno, Model model) throws Exception {
		logger.info("delete page~~~~~~~~~~~~~~~~~~~");
		// 서비스에서 삭제 처리 되야됨.
		service.remove(bno);
		return "/board/result";
	}

	@RequestMapping("/result")
	public void result(Model model) throws Exception {
		logger.info("result page~~~~~~~~~~~~~~~~~~~");
	}

}
