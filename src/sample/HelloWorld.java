package sample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Hello;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("HelloJPA");
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("SELECT h FROM Hello h ORDER BY h.id");

        List results = query.getResultList();

        for (Object o: results) {
            Hello h = (Hello)o;
            System.out.println(h.getId() + ":" + h.getName());
        }

        manager.close();
        factory.close();
	}

}
