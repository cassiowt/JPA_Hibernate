package apl;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Cliente;
import modelo.Telefone;

public class Fabrica {

	private static EntityManagerFactory factory;

	public static void main(String[] args) {

		try {
			factory = Persistence.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();
			System.out.println("Fabricado com Sucesso ; )");
			
			ArrayList<Telefone> telefones = new ArrayList<Telefone>();
			
			Telefone tel1 = new Telefone("66666");
			telefones.add(tel1);
			
			telefones.add(new Telefone("55555"));
			
			telefones.add(new Telefone("44444"));
			telefones.add(new Telefone("33333"));
			telefones.add(new Telefone("*A222"));
			
			Cliente cliente = new Cliente("616452156", "Cassio", "Trindade", new Date(), telefones);
			
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
