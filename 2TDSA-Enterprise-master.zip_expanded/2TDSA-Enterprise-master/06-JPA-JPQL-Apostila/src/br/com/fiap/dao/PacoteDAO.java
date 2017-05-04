package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{

	List<Pacote> buscarPorPrecoMaximo();
	
	long buscarQuantidadePorData(Calendar inicio, Calendar fim);
	
	double buscarPrecoMedio();
	
	List<Pacote> buscarPorData(Calendar inicio, Calendar fim);
	
	List<Pacote> listar();
	
	List<Pacote> buscarPorQuantidadeDiasMinimo(int dias);
	
	List<Pacote> buscarPorTransporte(Transporte transporte);
	
}