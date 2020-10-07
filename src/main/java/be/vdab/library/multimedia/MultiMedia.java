package be.vdab.library.multimedia;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@MappedSuperclass
public abstract class MultiMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String author;
    private LocalDate pubDate;
    private String publisher;
    private int subtitles;

    public MultiMedia(long id, String title, String author, LocalDate pubDate, String publisher, int subtitles) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.publisher = publisher;
    }

    public MultiMedia() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(int subtitles) {
        this.subtitles = subtitles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MultiMedia)) return false;
        MultiMedia that = (MultiMedia) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "MultiMedia{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubDate=" + pubDate +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
