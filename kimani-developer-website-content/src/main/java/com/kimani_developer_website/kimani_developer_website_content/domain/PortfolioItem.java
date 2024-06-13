package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class PortfolioItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String title;
    private String description;
    private ArrayList<String>FrameworksImages; //Link to angular image, react image flask, html5 e.t.c
    private String githubLink;
    private String color;
    private String image;



    public PortfolioItem(){}

    public PortfolioItem(String title, String description, ArrayList<String>frameworksImages, String githubLink, String color, String image){
        super();
        this.title=title;
        this.description=description;
        this.FrameworksImages =frameworksImages;
        this.githubLink = githubLink;
        this.color = color;
        this.image = image;

    }
}
