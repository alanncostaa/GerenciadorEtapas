package br.com.mvv.Gerencia_de_Etapas.repository;

import br.com.mvv.Gerencia_de_Etapas.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    //List<Empresa> findAll();
    Optional<Empresa> findByNomeIgnoreCase(String nome);
}
