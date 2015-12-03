package org.junk.persistence;

import java.util.List;

import org.junk.domain.BoardVO;

public interface BoardMapper {
	
	
	public List<BoardVO> allList() throws Exception;

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(Integer bno) throws Exception;

}
