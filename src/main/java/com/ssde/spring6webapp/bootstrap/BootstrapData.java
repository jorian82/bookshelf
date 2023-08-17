package com.ssde.spring6webapp.bootstrap;

import com.ssde.spring6webapp.domain.Author;
import com.ssde.spring6webapp.domain.Book;
import com.ssde.spring6webapp.domain.Publisher;
import com.ssde.spring6webapp.repositories.AuthorRepository;
import com.ssde.spring6webapp.repositories.BookRepository;
import com.ssde.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
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

        Publisher oriley = new Publisher();
        oriley.setPublisherName("O'Riley");
        oriley.setAddress("1234 O'Riley street");
        oriley.setCity("O'Riley city");
//        oriley.setState("TX");
//        oriley.setZip("12345");

        Publisher mcgraw = new Publisher();
        mcgraw.setPublisherName("McGraw Hill");
        mcgraw.setAddress("5678 McGraw street");
        mcgraw.setCity("McGraw city");
//        mcgraw.setState("IL");
//        mcgraw.setZip("67890");

        Publisher ted = new Publisher();
        ted.setPublisherName("TED Editorial");
        ted.setAddress("9012 TED street");
        ted.setCity("TED city");

        Publisher orileySaved = publisherRepository.save(oriley);
        Publisher mcgrawSaved = publisherRepository.save(mcgraw);
        Publisher tedSaved = publisherRepository.save(ted);

        bookSaved.setPublisher(orileySaved);
        dddSaved.setPublisher(tedSaved);
        ejbSaved.setPublisher(mcgrawSaved);

        bookRepository.save(bookSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(ejbSaved);

        System.out.println("In bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Books count: " + bookRepository.count());
        System.out.println("Publisher count: "+ publisherRepository.count());

    }
}
