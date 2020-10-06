package be.vdab.library.multimedia.books;

import be.vdab.library.multimedia.MultiMedia;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Book extends MultiMedia {

    @GeneratedValue(strategy = GenerationType.TABLE, generator ="BookGenerator")
    @TableGenerator(name = "BookGenerator", table = "BookSequence")
    private int pageCount;

}
