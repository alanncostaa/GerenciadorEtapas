package br.com.mvv.Gerencia_de_Etapas.model;

import jakarta.persistence.*;

@Entity
public class Comentario {

    @ManyToOne
    private Etapa comentarios;
    private String texto;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Comentario(String texto, Integer id, Etapa comentarios) {
        this.texto = texto;
        this.id = id;
        this.comentarios = comentarios;
    }

    public Etapa getComentarios() {
        return comentarios;
    }

    public void setComentarios(Etapa comentarios) {
        this.comentarios = comentarios;
    }

    public Comentario(String texto, Etapa comentarios) {
        this.texto = texto;
        this.comentarios = comentarios;
    }

    public Comentario(Integer id) {
        this.id = id;
    }

    public Comentario() {

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
