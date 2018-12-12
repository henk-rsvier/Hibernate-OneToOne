package rsvier;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import rsvier.Baas;
import rsvier.Hond;

public class App 
{
	public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("testPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        Baas baas = new Baas("testbaas");
        Hond hond = new Hond();
//        hond.setBaas(baas);
        baas.setHond(hond); // Hibernate persisteert alleen via de owning entity!
        
        et.begin();
        em.persist(baas);
        em.persist(hond);
        et.commit();
        em.clear();
        
        baas = em.find(Baas.class, 1L);
        System.out.println(baas);
       
        
    }
}
