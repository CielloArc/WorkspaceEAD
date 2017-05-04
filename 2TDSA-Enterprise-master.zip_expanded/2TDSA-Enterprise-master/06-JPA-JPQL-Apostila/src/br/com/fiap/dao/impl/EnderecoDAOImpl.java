package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EnderecoDAO;
import br.com.fiap.entity.Endereco;

public class EnderecoDAOImpl extends GenericDAOImpl<Endereco,Integer> implements EnderecoDAO{

	public EnderecoDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Endereco> buscarPorCep(String cep) {
		return em.createNativeQuery("select * from endereco "
			+ "where cep = :c",Endereco.class)
			.setParameter("c", cep)
			.getResultList();
	}

}
