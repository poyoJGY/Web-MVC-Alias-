package me.jgy.springex.mapper;

import me.jgy.springex.domain.TodoVO;
import me.jgy.springex.dto.PageRequestDTO;
import me.jgy.springex.dto.TodoDTO;

import java.util.List;

public interface TodoMapper {

    String getTime();
    void insert(TodoVO todoVO);
    List<TodoVO> selectAll();
    TodoVO selectOne(Long tno);
    void delete(Long tno);
    void update(TodoVO todoVO);
    List<TodoVO> selectList(PageRequestDTO requestDTO);
    int getCount(PageRequestDTO pageRequestDTO);
}
