package com.kimani_developer_website.kimani_developer_website_content.controller;

import com.kimani_developer_website.kimani_developer_website_content.domain.Details;
import com.kimani_developer_website.kimani_developer_website_content.domain.DetailsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {

    public final DetailsRepository detailsRepo;

    public DetailsController(DetailsRepository d){
        this.detailsRepo = d;
    }

    @GetMapping("/")
    public Iterable<Details> returnDetails(){
        return detailsRepo.findAll();
    }
}
