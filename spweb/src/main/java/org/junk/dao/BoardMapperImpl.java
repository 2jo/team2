package org.junk.dao;

import org.junk.domain.BoardVO;
import org.springframework.stereotype.Repository;

@Repository
public class BoardMapperImpl extends AbstractCRUDMapper<BoardVO, Integer> implements BoardMapper {

}
