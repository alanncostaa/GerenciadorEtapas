package br.com.mvv.Gerencia_de_Etapas.service;

import br.com.mvv.Gerencia_de_Etapas.dto.ComentarioDTO;
import br.com.mvv.Gerencia_de_Etapas.dto.EmpresaDTO;
import br.com.mvv.Gerencia_de_Etapas.model.Comentario;
import br.com.mvv.Gerencia_de_Etapas.model.Empresa;
import br.com.mvv.Gerencia_de_Etapas.model.Etapa;
import br.com.mvv.Gerencia_de_Etapas.repository.ArquivoRepository;
import br.com.mvv.Gerencia_de_Etapas.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository repositorio;

    public void inserirComentario(String texto, Etapa comentarios){

        Comentario comentario= new Comentario(texto, comentarios);
        repositorio.save(comentario);

    }

    public List<ComentarioDTO> obterTodosOsComentarios(){
        return repositorio.findAll()
                .stream()
                .map(e -> new ComentarioDTO(e.getTexto(), e.getId(), e.getComentarios()))
                .collect(Collectors.toList());
    }
}
