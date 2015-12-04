package org.junk.service;

import java.util.List;

import org.junk.domain.BoardVO;
import org.junk.domain.Criteria;

public interface BoardService {

	public List<BoardVO> viewPart(Criteria cri) throws Exception;
	
	public List<BoardVO> viewAll()throws Exception;
	
	public void regist(BoardVO vo) throws Exception;

	public BoardVO view(int bno) throws Exception;

	public void modify(BoardVO vo) throws Exception;

	public void remove(int bno) throws Exception;
}
