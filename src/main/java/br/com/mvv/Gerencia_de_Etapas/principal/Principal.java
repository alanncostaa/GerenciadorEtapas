package br.com.mvv.Gerencia_de_Etapas.principal;

import br.com.mvv.Gerencia_de_Etapas.model.Empresa;
import br.com.mvv.Gerencia_de_Etapas.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class Principal {
    private Scanner scan = new Scanner(System.in);
    private Integer id;
    private String nome;
    private String contrato;
    private String status;
    private Integer esc = -1;

    private EmpresaRepository repositorio;

    public Principal(EmpresaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu(){

        while(esc != 0){

            esc = scan.nextInt();
            scan.nextLine();

            if(esc == 1){

                System.out.println("Digite o nome da empresa: ");
                nome = scan.nextLine();

                System.out.println("Digite o ID: ");
                id = scan.nextInt();
                scan.nextLine();

                System.out.println("Digite o contrato: ");
                contrato = scan.nextLine();

                System.out.println("Digite o status: ");
                status = scan.nextLine();

                Empresa empresa = new Empresa(nome, contrato, status, id);
                repositorio.save(empresa);

            }else if(esc == 2){


                List<Empresa> empresas = repositorio.findAll();
                empresas.stream()
                        .forEach(System.out::println);

                Optional<Empresa> empresaBuscada = repositorio.findByNomeIgnoreCase("MVV");

//                if(empresaBuscada.isPresent()){
//                    System.out.println(empresaBuscada.get());
//                }

            }else if(esc == 0){

                System.out.println("Saindo...");

            }else{
                System.out.println("Opção Invalida!");
            }

        }

    }

}
