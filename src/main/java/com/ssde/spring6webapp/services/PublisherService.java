package com.ssde.spring6webapp.services;

import com.ssde.spring6webapp.domain.Publisher;

/**
 * Created by jra on 9/3/23-12:37 AM
 * IDE: IntelliJ IDEA,
 * Project: bookshelf
 */
public interface PublisherService {

    Iterable<Publisher> findAll();
}
