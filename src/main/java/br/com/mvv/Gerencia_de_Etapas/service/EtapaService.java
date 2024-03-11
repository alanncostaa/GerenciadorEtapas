package br.com.mvv.Gerencia_de_Etapas.service;

import br.com.mvv.Gerencia_de_Etapas.dto.EmpresaDTO;
import br.com.mvv.Gerencia_de_Etapas.dto.EtapaDTO;
import br.com.mvv.Gerencia_de_Etapas.model.Etapa;
import br.com.mvv.Gerencia_de_Etapas.repository.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtapaService {

    @Autowired
    private EtapaRepository repositorio;

    public List<EtapaDTO> obterTodasAsEtapas(){
        return repositorio.findAll()
                .stream()
                .map(e -> new EtapaDTO(e.getNome(), e.getStatus(), e.getArea(), e.getId(), e.getEmpresa()))
                .collect(Collectors.toList());
    }
}
