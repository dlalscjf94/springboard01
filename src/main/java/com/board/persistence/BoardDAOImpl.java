package com.board.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.boardVO;

@Repository 
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.board.mapper.BoardMapper";

	@Override
	public void create(boardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace + ".create", vo);

	}

	@Override
	public boardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace + ".read", bno);
	}

	@Override
	public void update(boardVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+ ".update", vo);

	}

	@Override
	public void delete(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		session.delete(namespace+ ".delete", bno);

	}

	@Override
	public List<boardVO> ListAll() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace + ".ListAll");
	}

}
