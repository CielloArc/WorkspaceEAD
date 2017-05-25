package br.com.fiap.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Livro;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteBuscaTitulo {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		LivroDAO dao = new LivroDAOImpl(em);
		
		
		try {
			List<Livro> lista = dao.buscarPorTitulo("A");
			
			for (Livro l : lista) {
				System.out.println(l.getTitulo());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
		
	}
}
