package org.junk.service;

import java.util.List;

import org.junk.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> viewAll()throws Exception;
	
	public void regist(BoardVO vo) throws Exception;

	public BoardVO view(Integer bno) throws Exception;

	public void modify(BoardVO vo) throws Exception;

	public void remove(Integer bno) throws Exception;
}
