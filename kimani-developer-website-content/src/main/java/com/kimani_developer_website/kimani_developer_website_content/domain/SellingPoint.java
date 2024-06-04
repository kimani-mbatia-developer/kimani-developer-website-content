package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.*;

@Entity
public class SellingPoint {
    @Id
    @GeneratedValue
    private Long id;

    String title;
    String content;
    String imageLink;
    String colour;

    public SellingPoint(){}

    public SellingPoint(String title){
        super();
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="details")
    private Details details;


}
