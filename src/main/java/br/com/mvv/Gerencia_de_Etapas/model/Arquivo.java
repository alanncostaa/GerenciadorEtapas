package br.com.mvv.Gerencia_de_Etapas.model;

import jakarta.persistence.*;

@Entity
public class Arquivo {

    @ManyToOne
    private Etapa arquivos;
    private String local;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Arquivo(String local, Integer id) {
        this.local = local;
        this.id = id;
    }

    public Arquivo() {

    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
