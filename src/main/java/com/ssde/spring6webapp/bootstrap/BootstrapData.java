package com.ssde.spring6webapp.bootstrap;

import com.ssde.spring6webapp.domain.Author;
import com.ssde.spring6webapp.domain.Book;
import com.ssde.spring6webapp.repositories.AuthorRepository;
import com.ssde.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author jorge = new Author();
        jorge.setFirstName("Jorge");
        jorge.setLastName("Rivera");

        Book book = new Book();
        book.setTitle("Spring Framework 6 Udemy Tutorial");
        book.setIsbn("987654-3210");

        Author authorSaved = authorRepository.save(jorge);
        Book bookSaved = bookRepository.save(book);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("123456-7890");

        Author rodSaved = authorRepository.save(rod);
        Book ejbSaved = bookRepository.save(noEJB);

        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("567890-1234");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        authorSaved.getBooks().add(bookSaved);
        rodSaved.getBooks().add(ejbSaved);
        ericSaved.getBooks().add(dddSaved);

        System.out.println("In bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Books count: " + bookRepository.count());

    }
}
