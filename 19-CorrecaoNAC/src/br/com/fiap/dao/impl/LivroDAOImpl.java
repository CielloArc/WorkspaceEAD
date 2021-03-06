package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.entity.Livro;

public class LivroDAOImpl extends GenericDAOImpl<Livro, String> implements LivroDAO{

	public LivroDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Livro> buscarPorTitulo(String titulo) {		
		return em.createQuery("from Livro l where l.titulo like :titulo", Livro.class)
				.setParameter("titulo", "%"+titulo+"%")
				.setMaxResults(50)
				.getResultList();		
	}

	@Override
	public long contarQuantidade(int codigoEditora) {
		return em.createQuery("select count(l) from Livro l where l.editora.codigo = :codigo", Long.class)
				.setParameter("codigo", codigoEditora)
				.getSingleResult();
	}

	@Override
	public List<Livro> buscarPorEditora(String nome) {
		return em.createQuery("from Livro l where l.editora.nome like :nome", Livro.class)
				.setParameter("nome", "%"+nome+"%")
				.getResultList();
	}

}
