package br.com.mvv.Gerencia_de_Etapas.repository;

import br.com.mvv.Gerencia_de_Etapas.model.Arquivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquivoRepository extends JpaRepository<Arquivo, Integer> {
}
