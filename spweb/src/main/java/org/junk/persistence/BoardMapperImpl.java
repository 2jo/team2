package org.junk.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junk.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class BoardMapperImpl implements BoardMapper {

	@Autowired
	private SqlSession session;
	
	@Override
	public List<BoardVO> allList() throws Exception {
		List<BoardVO> list = new ArrayList();
		
		list = session.selectList("org.junk.persistence.BoardMapper.allList");
		
		return list;
	}

	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert("org.junk.persistence.BoardMapper.create", vo);

	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		BoardVO vo = session.selectOne("org.junk.persistence.BoardMapper.read",bno);
		return vo;
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update("org.junk.persistence.BoardMapper.update",vo);

	}

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete("org.junk.persistence.BoardMapper.delete",bno);

	}

}
