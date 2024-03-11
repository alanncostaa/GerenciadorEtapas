package br.com.mvv.Gerencia_de_Etapas.controller;

import br.com.mvv.Gerencia_de_Etapas.dto.EtapaDTO;
import br.com.mvv.Gerencia_de_Etapas.model.Etapa;
import br.com.mvv.Gerencia_de_Etapas.service.EtapaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtapaController {

    @Autowired
    private EtapaService servico;

    @GetMapping("/etapas")
    List<EtapaDTO> obterEtapas(){
        return servico.obterTodasAsEtapas();
    }
}
