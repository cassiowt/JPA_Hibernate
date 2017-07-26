package apl;

import javax.persistence.EntityManager;

import modelo.Aluno;
import modelo.Cliente;
import modelo.Pessoa;
import modelo.Professor;

public class AplicaoTebelaUnica {
	private static EntityManager em;
	
	public static void main(String[] args) {
		//insereDados();
		buscarDados();
	}

	private static void buscarDados() {
		em = Conexao.getConexao();
		Pessoa p = em.find(Cliente.class, 11);
		System.out.println(p);
		
	}

	private static void insereDados() {

		Pessoa pessoa = new Pessoa(10, "Cassio", "9191", "Rua Das Camelias");
		Cliente cliente = new Cliente(11, "Pedro", "1212", "Rua Das Camelias", "61655");
		Professor professor = new Professor(12, "Marinho", "1222", "Rua Das Camelias", "52525", 1000);
		Aluno aluno = new Aluno(13, "Anflor", "33433", "Rua Das Camelias", "5858", "Quaquedo");
		
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
