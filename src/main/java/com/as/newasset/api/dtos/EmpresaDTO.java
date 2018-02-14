package com.as.newasset.api.dtos;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

import com.as.newasset.enums.corp.TipoPessoaEnum;

public class EmpresaDTO {

	// Propriedades
	private Long empresaID;
	private String nome;
	private String apelido;
	private TipoPessoaEnum tipoPessoa;
	private String cpfcnpj;
	
	// Construtor
	public EmpresaDTO() {
		
	}

	// Getters And Setters
	public Long getEmpresaID() {
		return empresaID;
	}

	public void setEmpresaID(Long empresaID) {
		this.empresaID = empresaID;
	}

	@NotEmpty(message="Campo obrigatório")
	@Length(min=1, max=255, message = "O nome da empresa não deve possuir mais que 255 caracteres")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotEmpty(message="Campo obrigatório")
	@Length(min=1, max=255, message = "O apelido da empresa não deve possuir mais que 50 caracteres")
	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	
	public TipoPessoaEnum getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoaEnum tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	@CNPJ(message="CNPJ ou CPF inválido")
	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	@Override
	public String toString() {
		return "EmpresaDTO [empresaID=" + empresaID + ", nome=" + nome + ", apelido=" + apelido + ", tipoPessoa="
				+ tipoPessoa + ", cpfcnpj=" + cpfcnpj + "]";
	}
	
	
	
	
}
 