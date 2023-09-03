package com.ssde.spring6webapp.controller;

import com.ssde.spring6webapp.services.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jra on 9/3/23-12:35 AM
 * IDE: IntelliJ IDEA,
 * Project: bookshelf
 */
@Controller
public class PublisherController {

    private final PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping("/publishers")
    public String getPublishers(Model model) {
        model.addAttribute("publishers", publisherService.findAll());
        return "publishers";
    }
}
