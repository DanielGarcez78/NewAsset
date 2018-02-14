package com.as.newasset.services.security;

import java.util.Optional;

import com.as.newasset.entities.security.Usuario;

public interface UsuarioService {

	Optional<Usuario> findByEmail(String email);
	
}
