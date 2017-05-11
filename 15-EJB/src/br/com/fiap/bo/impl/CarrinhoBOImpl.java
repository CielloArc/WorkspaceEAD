package br.com.fiap.bo.impl;

import javax.ejb.Stateful;

import br.com.fiap.bo.CarrinhoBO;

@Stateful
public class CarrinhoBOImpl implements CarrinhoBO{

	private double value = 0;
	
	@Override
	public double adicionarDolar(double dolar) {
		return value += dolar;
	}
	
}
