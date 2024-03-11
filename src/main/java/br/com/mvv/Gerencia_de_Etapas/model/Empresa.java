package br.com.mvv.Gerencia_de_Etapas.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Empresa {

    @OneToMany(mappedBy = "empresa")
    private List<Etapa> etapa = new ArrayList<>();
    private String nome;
    private String contrato;
    private String status;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Empresa(String nome, String contrato, String status, Integer id) {
        this.nome = nome;
        this.contrato = contrato;
        this.status = status;
        this.id = id;
    }

    public Empresa(String status, Integer id) {
        this.status = status;
        this.id = id;
    }

    public Empresa(Integer id) {
        this.id = id;
    }

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
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
