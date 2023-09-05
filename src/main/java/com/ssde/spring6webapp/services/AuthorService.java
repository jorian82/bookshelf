package com.ssde.spring6webapp.services;

import com.ssde.spring6webapp.domain.Author;

/**
 * Created by jra on 04/09/23 at 20:52
 * IDE: IntelliJ IDEA
 * Project: bookshelf
 */
public interface AuthorService {

    Iterable<Author> findAll();
}
