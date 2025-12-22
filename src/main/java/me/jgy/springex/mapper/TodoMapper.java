package me.jgy.springex.mapper;

import me.jgy.springex.domain.TodoVO;

import java.util.List;

public interface TodoMapper {

    String getTime();
    void insert(TodoVO todoVO);
    List<TodoVO> selectAll();
    TodoVO selectOne(Long tno);
}
