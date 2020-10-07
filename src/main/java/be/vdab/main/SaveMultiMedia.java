package be.vdab.main;

import be.vdab.library.multimedia.MultiMedia;
import be.vdab.library.multimedia.audiovisual.AudioVisual;
import be.vdab.library.multimedia.audiovisual.DVD;
import be.vdab.library.multimedia.books.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;


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

            m.setTitle("The Prisoner Of Azkaban");
            m.setPubDate(LocalDate.of(1989,7,26));
            m.setPublisher("Voldemort LLC");

            AudioVisual d = new AudioVisual();
            d.setTitle("Jumpen doe je zo!");
            d.setAuthor("Patrick J");
            d.setDuration(120);
            d.setPublisher("Start Stop Records");
            d.setSubtitles(1);
            em.persist(m);
            em.persist(d);
            tx.commit();
            System.out.println("Multimedia Saved");

        } finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
