package com.devace.todoapi.Todo;


import java.util.List;

public interface TodoService {
    List<Todo> getAllTodo();
    Todo getTodo(Integer id);
    Todo createTodo(Todo todo);
    void deleteTodo(Integer id);
}
