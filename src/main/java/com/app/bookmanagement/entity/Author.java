package com.app.bookmanagement.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "author")
public class Author implements Serializable{
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer authorId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String bio;

    public Author(Integer authorId, String firstName, String lastName, Date birthDate, String bio) {
        this.authorId = authorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", bio='" + bio + '\'' +
                '}';
    }

    public Author(){

    }
}
