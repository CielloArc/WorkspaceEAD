package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.TimeDAO;
import br.com.fiap.dao.impl.TimeDAOImpl;
import br.com.fiap.entity.Campeonato;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Tecnico;
import br.com.fiap.entity.Time;
import br.com.fiap.exception.DBException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastraTudoTeste {

	public static void main(String[] args) {
		//Obter o EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar um TimeDAOImpl
		TimeDAO dao = new TimeDAOImpl(em);
		
		//Instanciar a galera (entidades!)
		Tecnico tecnico = new Tecnico("Rita");
		Time time = new Time("2TDSA",Calendar.getInstance(),0,tecnico);
		
		time.addJogador(new Jogador("Attos"));
		time.addJogador(new Jogador("Wallace"));
		time.addJogador(new Jogador("Rafael"));
		
		List<Campeonato> lista = new ArrayList<Campeonato>();
		lista.add(new Campeonato("Smart World"));
		lista.add(new Campeonato("Startup One"));
		
		time.setCampeonatos(lista);
		
		try {
			//Cadastrar o time e commit (o resto vai por cascata)
			dao.cadastrar(time);
			//Sucesso!
			dao.salvar();
		} catch (DBException e) {
			e.printStackTrace();
		}finally {
			em.close();
			System.exit(0);
		}
		
	}
	
}