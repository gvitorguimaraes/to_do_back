package br.com.td.todo.dao;

import br.com.td.todo.models.Tarefa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarefaRep extends CrudRepository<Tarefa, Integer> {

}
