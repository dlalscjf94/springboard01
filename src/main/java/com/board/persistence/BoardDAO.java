package com.board.persistence;

import java.util.List;

import com.board.domain.boardVO;

public interface BoardDAO {
	
	public void create(boardVO vo) throws Exception;
	
	public boardVO read(Integer bno) throws Exception;
	
	public void update(boardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<boardVO> ListAll() throws Exception;
	

}
