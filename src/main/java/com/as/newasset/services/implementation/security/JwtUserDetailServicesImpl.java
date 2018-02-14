package com.as.newasset.services.implementation.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.as.newasset.entities.security.Usuario;
import com.as.newasset.services.security.UsuarioService;

import com.as.newasset.security.utils.jwt.JwtUserFactory;

@Service
public class JwtUserDetailServicesImpl implements UserDetailsService{

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Usuario> usuario = usuarioService.findByEmail(username);
		
		if (usuario.isPresent()) {
			return JwtUserFactory.create(usuario.get());
		}
		
		throw new UsernameNotFoundException("E-mail não cadastrado");
		
	}
	
	
}
