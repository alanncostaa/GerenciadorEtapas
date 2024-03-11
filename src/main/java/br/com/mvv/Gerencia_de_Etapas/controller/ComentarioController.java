package br.com.mvv.Gerencia_de_Etapas.controller;

import br.com.mvv.Gerencia_de_Etapas.dto.ComentarioDTO;
import br.com.mvv.Gerencia_de_Etapas.dto.EmpresaDTO;
import br.com.mvv.Gerencia_de_Etapas.model.Etapa;
import br.com.mvv.Gerencia_de_Etapas.service.ComentarioService;
import br.com.mvv.Gerencia_de_Etapas.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComentarioController {

    @Autowired
    private ComentarioService servico;

    @GetMapping("/inserirComentario/{texto}/{comentarios}")
    public void inserirComentario(@PathVariable String texto, @PathVariable Etapa comentarios){

        servico.inserirComentario(texto, comentarios);

    }

    @GetMapping("/obterComentarios")
    public List<ComentarioDTO> obterComentarios(){
        return servico.obterTodosOsComentarios();
    }
}
