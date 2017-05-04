package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_AGENCIA")
@SequenceGenerator(name="seqAgencia", sequenceName="SQ_TB_AGENCIA", allocationSize=1)
public class Agencia {
	
	@Id
	@GeneratedValue(generator="seqAgencia", strategy=GenerationType.SEQUENCE)
	@Column(name="NR_AGENCIA")
	private int numero;
	
	@Column(name="DS_ENDERECO")
	private String endereco;
	
	public Agencia()
	{
		super();
	}

	public Agencia(String endereco) {
		super();		
		setEndereco(endereco);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
