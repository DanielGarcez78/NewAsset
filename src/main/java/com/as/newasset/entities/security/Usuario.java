package com.as.newasset.entities.security;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.as.newasset.enums.security.PerfilEnum;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -3258595989308283146L;

	private Long usuarioID;
	private String email;
	private String senha;
	private PerfilEnum perfil;
	
	public Usuario() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getUsuarioID() {
		return usuarioID;
	}	
	
	public void setUsuarioID(Long usuarioID) {
		this.usuarioID = usuarioID;
	}
	
	@Column(name = "Email", length = 255, nullable = false)
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "Senha", length = 4000, nullable = false)
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Column(name = "Perfil", length = 50, nullable = false)
	public PerfilEnum getPerfil() {
		return perfil;
	}
	
	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}

}
