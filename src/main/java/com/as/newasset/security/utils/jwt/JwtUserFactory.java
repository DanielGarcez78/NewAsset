package com.as.newasset.security.utils.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.as.newasset.entities.security.Usuario;
import com.as.newasset.enums.security.PerfilEnum;

public class JwtUserFactory {

	public static JwtUser create(Usuario usuario) {
	
		return new JwtUser(usuario.getUsuarioID(), usuario.getEmail(), usuario.getSenha(),
				mapToGrantedAuthorities(usuario.getPerfil()));
	}
	
	
	private static List<GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfilEnum) {
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(); 
		authorities.add(new SimpleGrantedAuthority(perfilEnum.toString()));
		return authorities;
		
	}
	
}
