package br.com.fiap.bo;

import javax.ejb.Remote;

@Remote
public interface FiapBO {
	public double calcularPS(double nac, double am, double enade);
	public double calcularEnade(double nac, double am, double ps);
}
