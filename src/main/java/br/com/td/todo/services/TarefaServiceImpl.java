package br.com.td.todo.services;

import br.com.td.todo.dao.ITarefaRep;
import br.com.td.todo.models.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServiceImpl implements ITarefaService{

    @Autowired
    private ITarefaRep repo;

    @Override
    public Tarefa criarTarefa(Tarefa tarefa) {
        return repo.save(tarefa);
    }

    @Override
    public Tarefa editarTarefa(Tarefa tarefa) {
        return repo.save(tarefa);
    }

    @Override
    public List<Tarefa> listarTarefas() {
        return (List<Tarefa>)repo.findAll();
    }

    @Override
    public void removerTarefa(Integer id) {
        repo.deleteById(id);
    }
}
