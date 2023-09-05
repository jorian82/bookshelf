package com.ssde.spring6webapp.services;

import com.ssde.spring6webapp.domain.Author;
import com.ssde.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jra on 04/09/23 at 21:01
 * IDE: IntelliJ IDEA
 * Project: bookshelf
 */
@Service
public class AuthorServiceImpl implements AuthorService{

    AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
