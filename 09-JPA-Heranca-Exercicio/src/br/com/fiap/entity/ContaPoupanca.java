package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ContaPoupanca extends Conta {

	@Column(name = "VL_RENDIMENTO", nullable = false)
	private double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Agencia agencia, double saldo, double rendimento) {
		super(agencia, saldo);
		setRendimento(rendimento);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

}
