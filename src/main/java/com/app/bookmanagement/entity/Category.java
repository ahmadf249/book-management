package com.app.bookmanagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;

public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryId;

    private String categoryName;
}
