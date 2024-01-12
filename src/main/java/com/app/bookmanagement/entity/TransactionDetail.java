package com.app.bookmanagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;

public class TransactionDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionDetailsId;
    @ManyToOne
    @JoinColumn(name = "transactionId")
    private Transaction transactionId;

    @ManyToOne
    @JoinColumn(name = "bookId")
    private Book bookId;
    private Integer quantity;
    private double subTotal;
}
