package com.app.bookmanagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Author implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer authorId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String bio;
}
