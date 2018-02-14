package com.as.newasset.services.implementation.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.newasset.entities.security.Usuario;
import com.as.newasset.repositories.security.UsuarioRepository;
import com.as.newasset.services.security.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Optional<Usuario> findByEmail(String email) {
		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
	}
	
}
