package br.com.mvv.Gerencia_de_Etapas.repository;

import br.com.mvv.Gerencia_de_Etapas.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
}
