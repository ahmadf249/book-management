package com.app.bookmanagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
    public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    private String title;
    private String isbn;
    private String description;
    private Double price;
    private Integer quantity;
    private Date publishedDate;
    @OneToOne
    @JoinColumn (name = "categoryId")
    private Category categoryId;
    @ManyToOne
    @JoinColumn (name = "authorId")
    private Author authorId;
    }

