package apl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.CartaoCredito;
import modelo.Cliente;

public class Fabrica {

	private static EntityManagerFactory factory;

	public static void main(String[] args) {

		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();
			System.out.println("Fabricado com Sucesso ; )");
			
			CartaoCredito cartaoCredito = new CartaoCredito("99999", "MASTER");
			Cliente cliente = new Cliente(cartaoCredito, "Predro", new Date());
			
			em.getTransaction().begin();
			
			em.persist(cliente);
			
			em.getTransaction().commit();
			
			em.close();
			

		} catch (RuntimeException e) {
			System.out.println("TRACE_____________________:");
			e.printStackTrace();
		}

	}

}
