package br.com.td.todo.services;

import br.com.td.todo.models.Tarefa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITarefaService {

    public Tarefa criarTarefa(Tarefa tarefa);

    public Tarefa editarTarefa(Tarefa tarefa);

    public List<Tarefa> listarTarefas();

    public void removerTarefa(Integer id);
}
