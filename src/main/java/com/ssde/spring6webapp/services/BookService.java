package com.ssde.spring6webapp.services;

import com.ssde.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
