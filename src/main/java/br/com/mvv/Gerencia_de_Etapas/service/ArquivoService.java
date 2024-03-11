package br.com.mvv.Gerencia_de_Etapas.service;

import br.com.mvv.Gerencia_de_Etapas.repository.ArquivoRepository;
import br.com.mvv.Gerencia_de_Etapas.repository.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArquivoService {

    @Autowired
    private ArquivoRepository repositorio;
}
