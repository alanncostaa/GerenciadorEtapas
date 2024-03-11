package br.com.mvv.Gerencia_de_Etapas.dto;

import br.com.mvv.Gerencia_de_Etapas.model.Etapa;

public record ComentarioDTO(
        String texto,
        Integer id,
        Etapa comentario) {
}
