package br.com.td.todo.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarefa")
    private Integer id;

    @Column(name = "data_tarefa", nullable = false)
    private LocalDate data;

    @Column(name = "titulo_tarefa", length = 60)
    private String titulo;

    @Column(name = "descricao_tarefa", length = 500)
    private String descricao;

    @Column(name = "status_tarefa")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
