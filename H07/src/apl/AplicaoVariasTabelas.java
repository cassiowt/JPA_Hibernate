package apl;

import javax.persistence.EntityManager;

import modelo.Aluno;
import modelo.Cliente;
import modelo.Pessoa;
import modelo.Professor;
import modelo.a.Aluno1;
import modelo.a.Cliente1;
import modelo.a.Pessoa1;
import modelo.a.Professor1;

public class AplicaoVariasTabelas {
	private static EntityManager em;
	
	public static void main(String[] args) {
		//insereDados();
		
		Pessoa1 pessoaRetornada = buscarDados();
		
		deletaDados(pessoaRetornada);
		
	}

	private static void deletaDados(Pessoa1 pessoaDeletada) {
		//em = Conexao.getConexao();
		
		em.getTransaction().begin();
		
		em.remove(pessoaDeletada);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	private static Pessoa1 buscarDados() {
		em = Conexao.getConexao();
		Pessoa1 p = em.find(Cliente1.class, 11);
		System.out.println(p);
		
		return p;
	}

	private static void insereDados() {

		Pessoa1 pessoa = new Pessoa1(14, "Cassio", "9191", "Rua Das Camelias");
		Cliente1 cliente = new Cliente1(15, "Pedro", "1212", "Rua Das Camelias", "61655");
		Professor1 professor = new Professor1(16, "Marinho", "1222", "Rua Das Camelias", "52525", 1000);
		Aluno1 aluno = new Aluno1(17, "Anflor", "33433", "Rua Das Camelias", "5858", "Quaquedo");
		
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
