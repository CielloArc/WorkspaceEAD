package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class Exercicio05 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAO dao = new PacoteDAOImpl(em);
		
		Calendar inicio = 
			new GregorianCalendar(2017, Calendar.JANUARY, 1);
		Calendar fim = 
			new GregorianCalendar(2017, Calendar.DECEMBER, 31);
		
		List<Pacote> lista = dao.buscarPorData(inicio, fim);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		for (Pacote pacote : lista) {
			System.out.println(pacote.getDescricao() + 
				" " + sdf.format(pacote.getDataSaida().getTime()));
		}
		
		em.close();
		System.exit(0);
	}
	
}
