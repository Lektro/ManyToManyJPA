package be.vdab.main;

import be.vdab.library.multimedia.audiovisual.DVD;
import be.vdab.library.multimedia.books.Book;
import javax.persistence.*;
import java.util.List;

public class SearchBooks {
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

/*            TypedQuery<DVD> queryDVD = em.createQuery("select d from DVD as d",DVD.class);
            List<DVD> dvds = queryDVD.getResultList();


            for (DVD d : dvds) {
                System.out.println(d);
            }

            System.out.println("DVD Retrieved");*/

        } finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
