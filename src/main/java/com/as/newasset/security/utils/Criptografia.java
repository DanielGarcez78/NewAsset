package com.as.newasset.security.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Criptografia {

	public static String CripotografaSenha(String senha) {
		
		if (senha == null) {
			return senha;
		};
		
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();		
		return bcryptPasswordEncoder.encode(senha);
		
	}
	
	
	public static boolean validaSenha(String senha, String senhaCriptografada) {
		
		try {
			BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
			return bcryptPasswordEncoder.matches(senha, senhaCriptografada);
		}
		catch (Exception exception) {
			return false;
		}
	}
	
}
