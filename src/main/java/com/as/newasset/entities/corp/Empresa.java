package com.as.newasset.entities.corp;

import java.io.Serializable;

import javax.persistence.*;

import com.as.newasset.enums.corp.TipoPessoaEnum;


@Entity
@Table(name="Empresa")
public class Empresa implements Serializable {
	
	public Empresa() {
		
	}
	
	private static final long serialVersionUID = 8802809237560767693L;
	
	private Long empresaID;
	private String nome;
	private String apelido;
	private TipoPessoaEnum tipoPessoa;
	private String cpfcnpj;
	
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEmpresaID() {
		return empresaID;
	}
	
	public void setEmpresaID(Long empresaID) {
		this.empresaID = empresaID;
	}
	
	@Column(name = "Nome", length = 255, nullable = false)
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name = "Apelido", length = 50, nullable = false)
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TipoPessoa", length = 50, nullable = false)
	public TipoPessoaEnum getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@Column(name = "CPF_CNPF", length = 18, nullable = true)
	public String getCpfcnpj() {
		return cpfcnpj;
	}
	
	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	@Override
	public String toString() {
		return "Empresa [empresaID=" + empresaID + ", nome=" + nome + ", apelido=" + apelido + ", tipoPessoa="
				+ tipoPessoa + ", cpfcnpj=" + cpfcnpj + "]";
	}
		
}
