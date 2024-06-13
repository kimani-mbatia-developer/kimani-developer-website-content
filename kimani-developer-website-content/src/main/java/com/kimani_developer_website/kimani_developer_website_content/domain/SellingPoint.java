package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.*;

@Entity
public class SellingPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String title;
    String content;
    String imageLink;
    String colour;

    public SellingPoint(){}

    public SellingPoint(String title, String content, String imagelink,String colour, Details mn){
        super();
        this.title = title;
        this.content = content;
        this.imageLink = imagelink;
        this.colour = colour;
        this.details = mn;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="details")
    private Details details;


}
