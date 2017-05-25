package br.com.fiap.dao;

import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitErrorException;

public interface GenericDAO<T,K> {

	void cadastrar(T entidade);
	void atualizar (T entidade);
	void excluir(K codigo) throws CodigoInvalidoException;
	void commit() throws CommitErrorException;
	T buscar(K codigo);
	//...
	
}
