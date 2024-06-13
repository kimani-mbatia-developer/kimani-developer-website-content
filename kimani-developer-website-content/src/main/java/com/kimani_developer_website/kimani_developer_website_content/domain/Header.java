package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.*;

@Entity
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="details")
    private Details details;

    public Header(){}

    public Header(String t, Details d){
        super();
        this.title = t;
        this.details = d;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}


