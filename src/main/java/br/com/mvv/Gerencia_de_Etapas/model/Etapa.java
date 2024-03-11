package br.com.mvv.Gerencia_de_Etapas.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Etapa {
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    private String nome, status, area;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "comentarios")
    private List<Comentario> comentarios = new ArrayList<>();

    @OneToMany(mappedBy = "arquivos")
    private List<Arquivo> arquivos = new ArrayList<>();

    @ManyToOne
    private Empresa empresa;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Etapa(String nome, String status, Integer id) {
        this.nome = nome;
        this.status = status;
        this.id = id;
    }

    public Etapa(Integer id) {
        this.id = id;
    }

    public Etapa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
