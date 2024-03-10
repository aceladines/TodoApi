package com.devace.todoapi.Todo;

import com.devace.todoapi.exception.TodoNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImp implements TodoService {

    private final TodoRepository todoRepository;
    @Override
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getTodo(Integer id) {
        return todoRepository.findById(id).orElseThrow(() -> new TodoNotFoundException("TODO", "id", String.valueOf(id)));
    }

    @Override
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void deleteTodo(Integer id) {
        todoRepository.deleteById(id);
    }
}
