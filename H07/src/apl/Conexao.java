package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {
	private static EntityManagerFactory factory;
	private static EntityManager em;

	public static EntityManager getConexao() {

		factory = Persistence.createEntityManagerFactory("jpa");
		em = factory.createEntityManager();
		return em;
	}

}
