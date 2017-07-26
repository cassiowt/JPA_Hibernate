package apl;

import javax.persistence.EntityManager;

import modelo.b.Aluno2;
import modelo.b.Cliente2;
import modelo.b.Pessoa2;
import modelo.b.Professor2;

public class AplicaoTebelaJoined {
	private static EntityManager em;
	
	public static void main(String[] args) {
		insereDados();
		//buscarDados();
	}

	private static void buscarDados() {
		em = Conexao.getConexao();
		Pessoa2 p = em.find(Cliente2.class, 11);
		System.out.println(p);
		
	}

	private static void insereDados() {

		Pessoa2 pessoa = new Pessoa2( "Cassio", "9191", "Rua Das Camelias");
		Cliente2 cliente = new Cliente2( "Pedro", "1212", "Rua Das Camelias", "61655");
		Professor2 professor = new Professor2( "Marinho", "1222", "Rua Das Camelias", "52525", 1000);
		Aluno2 aluno = new Aluno2( "Anflor", "33433", "Rua Das Camelias", "5858", "Quaquedo");
		
		em = Conexao.getConexao();
		
		em.getTransaction().begin();
		
		em.persist(pessoa);
		em.persist(cliente);
		em.persist(professor);
		em.persist(aluno);
		
		em.getTransaction().commit();
		
		em.close();
	}
}
