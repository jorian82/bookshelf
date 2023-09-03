package com.ssde.spring6webapp.services;

import com.ssde.spring6webapp.domain.Publisher;
import com.ssde.spring6webapp.repositories.PublisherRepository;
import org.springframework.stereotype.Service;

/**
 * Created by jra on 9/3/23-12:38 AM
 * IDE: IntelliJ IDEA,
 * Project: bookshelf
 */
@Service
public class PublisherServiceImpl implements PublisherService {

    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Iterable<Publisher> findAll() {
        return publisherRepository.findAll();
    }
}
