package com.app.bookmanagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User userId;

    private Date transactionDate;
    private double totalAmount;
}
