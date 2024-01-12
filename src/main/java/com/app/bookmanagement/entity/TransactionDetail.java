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

    public Integer getTransactionDetailsId() {
        return transactionDetailsId;
    }

    public void setTransactionDetailsId(Integer transactionDetailsId) {
        this.transactionDetailsId = transactionDetailsId;
    }

    public Transaction getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Transaction transactionId) {
        this.transactionId = transactionId;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
