package br.com.vitormilam.desafio_todo_list.service;


import br.com.vitormilam.desafio_todo_list.entity.Todo;
import br.com.vitormilam.desafio_todo_list.repository.TodoRepository;
import lombok.Data;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // Métodos CRUD
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list(){
        Sort.by("prioridade").ascending().and(
                Sort.by("nome").ascending()
        );

        return todoRepository.findAll();
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }


}
