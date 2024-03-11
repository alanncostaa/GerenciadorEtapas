package br.com.mvv.Gerencia_de_Etapas.controller;

import br.com.mvv.Gerencia_de_Etapas.dto.EmpresaDTO;
import br.com.mvv.Gerencia_de_Etapas.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaService servico;

    @GetMapping("/empresas")
    public List<EmpresaDTO> obterEmpresa(){
        return servico.obterTodasAsEmpresas();
    }

    @GetMapping("/mudarStatus/{id}/{status}")
    public void mudarStatus(@PathVariable String id, @PathVariable String status){
        servico.atualizarStatus(Integer.valueOf(id), status);
    }

}


