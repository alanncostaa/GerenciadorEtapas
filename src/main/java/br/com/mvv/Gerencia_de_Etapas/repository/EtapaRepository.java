package br.com.mvv.Gerencia_de_Etapas.repository;

import br.com.mvv.Gerencia_de_Etapas.model.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapaRepository extends JpaRepository<Etapa, Integer> {
}
