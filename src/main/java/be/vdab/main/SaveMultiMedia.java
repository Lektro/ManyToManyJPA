package be.vdab.main;

import be.vdab.library.multimedia.MultiMedia;
import be.vdab.library.multimedia.books.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SaveMultiMedia {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("create");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            MultiMedia m = new Book();
            m.setAuthor("J.K Rollin'");


            em.persist(m);
            tx.commit();
            System.out.println("Album Saved Saved");

        } finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
