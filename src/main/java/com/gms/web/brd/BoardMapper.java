package com.gms.web.brd;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gms.web.cmm.*;
import com.gms.web.page.Pagination;

@Repository
public interface BoardMapper {

  public void create(Board brd);

  public Board read(Integer bno) throws Exception;

  public void update(Board vo) throws Exception;

  public void delete(Integer bno) throws Exception;

  public List<Board> listAll(Pagination p);
  
  public List<Board> myList(Map<String,Object>o);

  public List<Board> listPage(int page) throws Exception;

  public List<Board> listCriteria(Criteria cri) throws Exception;

  public int countPaging(Criteria cri) throws Exception;
  
  //use for dynamic sql
  
  public List<Board> listSearch(SearchCriteria cri)throws Exception;
  
  public int listSearchCount(SearchCriteria cri)throws Exception;
  
  
  public void updateReplyCnt(Integer bno, int amount)throws Exception;
  
  public int countAll();
  
  public int myCount(String id);
  
  public void updateViewCnt(Integer bno)throws Exception;
  
  public void addAttach(String fullName)throws Exception;
  
  public List<String> getAttach(Integer bno)throws Exception;  
   
  public void deleteAttach(Integer bno)throws Exception;
  
  public void replaceAttach(String fullName, Integer bno)throws Exception;
  
}
