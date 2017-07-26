package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Sala;
import modelo.Turma;

public class Fabrica {

	private static EntityManagerFactory factory;

	public static void main(String[] args) {

		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();
			System.out.println("Fabricado com Sucesso ; )");

			
			Sala sala = new Sala("UM");
			Turma turma = new Turma("JPA", sala);
			Turma turma1 = new Turma("Java Fundamento", sala);
			Turma turma2 = new Turma("Oracle I", sala);
			
			em.getTransaction().begin();
			
			em.persist(sala);
			em.persist(turma);
			em.persist(turma1);
			em.persist(turma2);
					
			em.getTransaction().commit();
			
			em.close();

		} catch (RuntimeException e) {
			System.out.println("TRACE_____________________:");
			e.printStackTrace();
		}

	}

}
