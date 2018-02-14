package com.as.newasset.repositories.security;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import com.as.newasset.entities.security.Usuario;

@Transactional(readOnly=true)
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Usuario findByEmail(String email);
	
}
