package com.board.service;

import java.util.List;

import com.board.domain.boardVO;


public interface BoardService {
	
	public void regist(boardVO board) throws Exception;
	
	public boardVO read(Integer bno) throws Exception;
	
	public void modify(boardVO board) throws Exception;
	
	public void remove(Integer bno) throws Exception;
	
	public List<boardVO> ListAll() throws Exception; 

}
