package com.app.bookmanagement.services;

import com.app.bookmanagement.entity.Author;
import com.app.bookmanagement.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }
    public List<Author> createAuthorList(List<Author> list) {
        return authorRepository.saveAll(list);
    }
    public List<Author> getAuthorList() {
        return authorRepository.findAll();
    }
    public Optional<Author> getAuthorById(int authorId) {
        return authorRepository.findById(authorId);
    }
    public Author updateAuthorById(Author author) {
        Optional<Author> authorFound = authorRepository.findById(author.getAuthorId());

        if (authorFound.isPresent()) {
            Author authorUpdate = authorFound.get();
            authorUpdate.setBio(author.getBio());
            authorUpdate.setFirstName(author.getFirstName());
            authorUpdate.setLastName(author.getLastName());

            return authorRepository.save(author);
        } else {
            return null;
        }
    }
    public String deleteAuthorByID(int authorId){
        authorRepository.deleteById(authorId);
        return "Author "+ authorId +" is deleted";
    }
}
