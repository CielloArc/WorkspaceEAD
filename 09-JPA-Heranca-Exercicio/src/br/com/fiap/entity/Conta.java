package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@IdClass(ContaPK.class)
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="TB_CONTA")
public class Conta {
	
	@Id
	@JoinColumn(name="NR_AGENCIA")
	@ManyToOne(cascade= CascadeType.PERSIST)
	private Agencia agencia;
	
	@Id
	@SequenceGenerator(name="seqConta", sequenceName="SQ_TB_CONTA", allocationSize=1)
	@GeneratedValue(generator="seqConta", strategy=GenerationType.SEQUENCE)
	@Column(name="NR_CONTA")
	private int conta;
	
	@Column(name="VL_SALDO", nullable=false)
	private double saldo;
	
	public Conta()
	{
		super();
	}

	public Conta(Agencia agencia, double saldo) {
		super();
		setAgencia(agencia);
		setSaldo(saldo);
	}



	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
}
