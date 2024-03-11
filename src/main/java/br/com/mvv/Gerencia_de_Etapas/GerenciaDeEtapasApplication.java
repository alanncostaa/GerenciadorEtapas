package br.com.mvv.Gerencia_de_Etapas;

import br.com.mvv.Gerencia_de_Etapas.principal.Principal;
import br.com.mvv.Gerencia_de_Etapas.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciaDeEtapasApplication{

	public static void main(String[] args) {
		SpringApplication.run(GerenciaDeEtapasApplication.class, args);
	}

}
