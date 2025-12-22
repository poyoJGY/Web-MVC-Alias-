package me.jgy.springex.service;

import me.jgy.springex.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);
    List<TodoDTO> getAll();
    TodoDTO getOne(Long tno);
}
