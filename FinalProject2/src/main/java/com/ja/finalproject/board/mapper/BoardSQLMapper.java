package com.ja.finalproject.board.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.ja.finalproject.vo.BoardImageVo;
import com.ja.finalproject.vo.BoardLikeVo;
import com.ja.finalproject.vo.BoardVo;

public interface BoardSQLMapper {
	
	
	public int createBoardPk();
	
	public void insertBoard(BoardVo vo);
	
	public ArrayList<BoardVo> getBoardList(
			@Param("searchOption") String searchOption,
			@Param("searchWord") String searchWord,
			@Param("pageNum") int pageNum
			); //1개의 행을 받을때는 단일 객체 리턴 , N개의 행을 받을때는 List로 받는다.
	
	public int getBoardCount(
			@Param("searchOption") String searchOption,
			@Param("searchWord") String searchWord
			);
	
	
	
	public BoardVo getBoardByNo(int no);
	
	public void increaseReadCount(int no);
	public void deleteBoard(int no);
	public void updateBoard(BoardVo vo);
	
	//이미지 T
	public void insertImage(BoardImageVo vo);
	public ArrayList<BoardImageVo> getImageListByBoardNo(int boardNo);
	
	
	//좋아요 T
	public void insertLike(BoardLikeVo vo);
	public void deleteLike(BoardLikeVo vo);
	public int getTotalLikeCount(int boardNo);
	public int getMyLikeCount(BoardLikeVo vo);
	
	
	
	
}












