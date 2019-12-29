package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {
	
	//@Select("select * from tbl_board where bno >0")
	public List<BoardVO> getList();//리스트
	
	public List<BoardVO> getListWithPaging(Criteria cri);//페이징
	
	public void insert(BoardVO board);//등록
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);//읽기
	
	public int delete(Long bno);//삭제
	
	public int update(BoardVO board);//수정

	public int getTotalCount(Criteria cri);
}
