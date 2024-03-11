package br.com.mvv.Gerencia_de_Etapas.service;

import br.com.mvv.Gerencia_de_Etapas.dto.EmpresaDTO;
import br.com.mvv.Gerencia_de_Etapas.model.Empresa;
import br.com.mvv.Gerencia_de_Etapas.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository repositorio;

    public List<EmpresaDTO> obterTodasAsEmpresas(){
        return repositorio.findAll()
                .stream()
                .map(e -> new EmpresaDTO(e.getNome(), e.getContrato(), e.getStatus(), e.getId()))
                .collect(Collectors.toList());
    }

    public void atualizarStatus(Integer id, String status){

        Optional<Empresa> optionalEmpresa = this.repositorio.findById(id);

        if(optionalEmpresa.isPresent()){

            Empresa mudar = optionalEmpresa.get();

            mudar.setStatus(status);

            repositorio.save(mudar);

        }else{

            System.out.println("Id invalido!");

        }

    }


}
