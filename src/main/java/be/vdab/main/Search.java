package be.vdab.main;

import be.vdab.library.multimedia.MultiMedia;
import be.vdab.library.multimedia.audiovisual.DVD;
import be.vdab.library.multimedia.books.Book;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("read");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            TypedQuery<Book> query = em.createQuery("select b from Book as b",Book.class);
            List<Book> books = query.getResultList();
            for (Book b : books) {
                System.out.println(b);
            }
            tx.commit();
            System.out.println("Books Retrieved");

        } finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
