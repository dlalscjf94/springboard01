package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.domain.boardVO;
import com.board.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;

	@Override
	public void regist(boardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.create(board);

	}

	@Override
	public boardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	@Override
	public void modify(boardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.update(board);

	}

	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);

	}

	@Override
	public List<boardVO> ListAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.ListAll();
	}

}
