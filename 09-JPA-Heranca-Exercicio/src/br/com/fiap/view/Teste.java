package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ContaDAO;
import br.com.fiap.dao.impl.ContaDAOImpl;
import br.com.fiap.entity.Agencia;
import br.com.fiap.entity.ContaCorrente;
import br.com.fiap.entity.ContaPoupanca;
import br.com.fiap.factory.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();		
		ContaDAO dao = new ContaDAOImpl(em);
		
		Agencia agencia = new Agencia("R. das Bananas, 70.");		
		ContaCorrente cc = new ContaCorrente(agencia, 100, 100, 1000);
		ContaPoupanca cp= new ContaPoupanca(agencia, 1000, 1000);
		
		try {
			dao.cadastrar(cp);
			dao.cadastrar(cc);
			dao.salvar();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
	}
}
