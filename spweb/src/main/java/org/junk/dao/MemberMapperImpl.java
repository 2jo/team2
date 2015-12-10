package org.junk.dao;

import org.apache.ibatis.session.SqlSession;
import org.junk.domain.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberMapperImpl extends AbstractCRUDMapper<MemberVO, String> implements MemberMapper{


}
