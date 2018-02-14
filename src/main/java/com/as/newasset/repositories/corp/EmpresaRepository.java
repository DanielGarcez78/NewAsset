package com.as.newasset.repositories.corp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.newasset.entities.corp.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	Empresa findBycpfcnpj (String cpfcnpj);
}
