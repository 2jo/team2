package org.junk.service;

import java.util.List;

import org.junk.persistence.BoardMapperImpl;
import org.junk.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapperImpl bomap;
	
	@Override
	public List<BoardVO> viewAll() throws Exception {
		
		return bomap.allList();
	}

	@Override
	public void regist(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int bno) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
