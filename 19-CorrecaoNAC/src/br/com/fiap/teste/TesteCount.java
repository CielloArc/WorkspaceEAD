package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteCount {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		LivroDAO dao = new LivroDAOImpl(em);
		
		
		try{
			long qnt = dao.contarQuantidade(1);
			System.out.println("Total: " + qnt);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}		
	}
}
