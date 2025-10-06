package br.com.vitormilam.desafio_todo_list.repository;

import br.com.vitormilam.desafio_todo_list.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
