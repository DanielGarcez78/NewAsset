package com.as.newasset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.as.newasset.api.services.TesteService;
import com.as.newasset.entities.corp.Empresa;
import com.as.newasset.enums.corp.TipoPessoaEnum;
import com.as.newasset.repositories.corp.EmpresaRepository;


@SpringBootApplication
public class NewAssetApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NewAssetApplication.class, args);
	}


	/*
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			this.testeService.testarServico();
		};
	}
	*/
	
	
	/*
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
		
			Empresa empresa = new Empresa();
			empresa.setNome("Asset Solutions");
			empresa.setApelido("AS");
			empresa.setTipoPessoa(TipoPessoaEnum.PESSOA_JURIDICA);
			empresa.setCpfcnpj("12123456000185");
			
			this.empresaRepository.save(empresa);
			
			Empresa empresaDB = this.empresaRepository.findOne(1L);
			if (empresaDB != null)
			{
				System.out.println("Empresa: " + empresaDB);
			}
			else
			{
				System.out.println("Empresa não localizada");
			}
			
			
		};
	}*/
	
	
}

	
	