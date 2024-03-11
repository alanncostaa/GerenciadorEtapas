package br.com.mvv.Gerencia_de_Etapas.dto;

import br.com.mvv.Gerencia_de_Etapas.model.Empresa;

public record EtapaDTO (
        String nome,
        String status,
        String area,
        Integer id,
        Empresa empresa){
}
