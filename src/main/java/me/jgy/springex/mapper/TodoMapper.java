package me.jgy.springex.mapper;

import me.jgy.springex.domain.TodoVO;

public interface TodoMapper {

    String getTime();
    void insert(TodoVO todoVO);
}
