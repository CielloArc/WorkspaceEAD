package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	List<Cliente> buscarAniversariantes(int mes);
	
	Cliente buscarPorCpf(String cpf);
	
	long buscarQuantidade();
	
	List<Cliente> buscarPorEstados(List<String> estados);
	
	List<Cliente> buscar(String nome, String cidade);
	
	List<Cliente> buscarPorEstado(String estado);
	
	List<Cliente> buscarPorDiasReserva(int dias);
	
}
