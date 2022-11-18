package br.com.td.todo.controllers;

import br.com.td.todo.models.Tarefa;
import br.com.td.todo.services.ITarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin("*")
public class TarefaController {

    @Autowired
    private ITarefaService service;

    @PostMapping("/tarefas")
    public ResponseEntity<Tarefa> criarTarefa(@RequestBody Tarefa novaTarefa){
        novaTarefa.setData(LocalDate.now());
        Tarefa res = service.criarTarefa(novaTarefa);
        if(res != null)
            return ResponseEntity.ok(novaTarefa);
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/tarefas/{id}")
    public ResponseEntity<Tarefa> editarTarefa(@RequestBody Tarefa tarefaAtt, @PathVariable Integer id){
        tarefaAtt.setData(LocalDate.now());
        tarefaAtt.setId(id);
        Tarefa res = service.editarTarefa(tarefaAtt);
        if(res != null)
            return ResponseEntity.ok(res);
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/tarefas")
    public ResponseEntity<List<Tarefa>> listarTarefas(){
        return ResponseEntity.ok(service.listarTarefas());
    }

    @DeleteMapping("/tarefas/{id}")
    public ResponseEntity<?> removerTarefa(@PathVariable Integer id){
        service.removerTarefa(id);
        return ResponseEntity.ok("OK");
    }
}
