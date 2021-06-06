package com.example.demo;

import javax.persistence.*;
// each object of this class is representing a row in a table(book)
@Entity   // replicates to a table in a database
@Table(name="book")
public class Book {

    @Id  // tells it is primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="title", nullable = false, unique = true)  // it will create column with these properties
    private String title;

    @Column(name="author",nullable = false)
    private String author;

    public Book(long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public Book() {

    }

}