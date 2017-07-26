package apl;

import javax.persistence.EntityManager;

import modelo.c.Aluno3;
import modelo.c.Cliente3;
import modelo.c.Pessoa3;
import modelo.c.Professor3;

public class Aplicacao {
	private static EntityManager em;
	
	public static void main(String[] args) {
		insereDados();
		//buscarDados();
	}

	private static void buscarDados() {
		em = Conexao.getConexao();
		Pessoa3 p = em.find(Cliente3.class, 11);
		System.out.println(p);
		
	}

	private static void insereDados() {

	//	Pessoa3 pessoa = new Pessoa3( "Cassio", "9191", "Rua Das Camelias");
		Cliente3 cliente = new Cliente3( "Pedro", "1212", "Rua Das Camelias", "61655");
		Professor3 professor = new Professor3( "Marinho", "1222", "Rua Das Camelias", "52525", 1000);
		Aluno3 aluno = new Aluno3( "Anflor", "33433", "Rua Das Camelias", "5858", "Quaquedo");
		
		em = Conexao.getConexao();
		
		em.getTransaction().begin();
		
//		em.persist(pessoa);
		em.persist(cliente);
		em.persist(professor);
		em.persist(aluno);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
