package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	@Column(name="NR_CNPJ")
	private String cnpj;
	
	@Column(name="NM_FANTASIA")
	private String nomeFantasia;

	public PessoaJuridica(String nome, String endereco, String cnpj, String nomeFantasia) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public PessoaJuridica() {
		super();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
}
