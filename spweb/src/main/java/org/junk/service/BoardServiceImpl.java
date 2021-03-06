package org.junk.service;

import java.util.List;

import org.junk.domain.BoardVO;
import org.junk.domain.Criteria;
import org.junk.persistence.BoardMapperImpl;
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
		bomap.create(vo);
		
	}

	@Override
	public BoardVO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return bomap.read(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		bomap.update(vo);
		
	}

	@Override
	public void remove(int bno) throws Exception {
		// TODO Auto-generated method stub
		bomap.delete(bno);
	}

	@Override
	public List<BoardVO> viewPart(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return bomap.search(cri);
	}

	
}
