package controladores;

import daos.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class inicio {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		// TEST
		

		    	Usuario usuario = new Usuario();
		        
		        EntityTransaction tx = em.getTransaction();

		        tx.begin();
		        em.persist(usuario);
		        tx.commit();
		    
	
		if(em.isOpen()) {
			em.close();
		}
	}
}