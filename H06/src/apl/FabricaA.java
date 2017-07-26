package apl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.A.Aluno;
import modelo.A.Cliente;
import modelo.A.Pessoa;
import modelo.A.Professor;


public class FabricaA {

	private static EntityManagerFactory factory;

	public static void main(String[] args) throws ParseException {

		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();
			System.out.println("Fabricado com Sucesso ; )");
			
			Aluno aluno = new Aluno("Theo");
			Cliente cliente = new Cliente("555555");
			Professor professor = new Professor("120112200",5000);
			Pessoa pessoa = new Pessoa("91083333", "VINICIUS", "51999999", "TANCREDO CALDAS");
			em.getTransaction().begin();
			
			em.persist(aluno);
			em.persist(cliente);
			em.persist(professor);
			em.persist(pessoa);
			em.getTransaction().commit();
			
			em.close();

			
			
			
			
		} catch (RuntimeException e) {
			System.out.println("TRACE_____________________:");
			e.printStackTrace();
		}

	}

}
