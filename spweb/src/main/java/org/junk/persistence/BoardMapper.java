package org.junk.persistence;

import java.util.List;

import org.junk.domain.BoardVO;
import org.junk.domain.Criteria;

public interface BoardMapper {
	
	
	public List<BoardVO> allList() throws Exception;

	public void create(BoardVO vo) throws Exception;

	public BoardVO read(int bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(int bno) throws Exception;
	
	public List<BoardVO> search(Criteria cri) throws Exception;
	
	public int searchCount(Criteria cri) throws Exception;

}
