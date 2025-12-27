package me.jgy.springex.service;

import me.jgy.springex.dto.PageRequestDTO;
import me.jgy.springex.dto.PageResponseDTO;
import me.jgy.springex.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);
//    List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);
    TodoDTO getOne(Long tno);
    void remove(Long tno);
    void modify(TodoDTO todoDTO);
}
