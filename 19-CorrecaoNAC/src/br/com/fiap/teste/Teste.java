package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) throws Exception {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		LivroDAO dao = new LivroDAOImpl(em);
		Editora editora = new Editora("Delicia", null);
		Autor autor = new Autor("Guina", new GregorianCalendar(24, 06, 1969),null);
		Livro livro = new Livro("y723y21731", "Aventuras de Jailson", null, editora);
		List<Autor> lista = new ArrayList<>();
		lista.add(autor);
		
		livro.setAutores(lista);
		
		
		try {
			dao.cadastrar(livro);
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}		
	}
}
