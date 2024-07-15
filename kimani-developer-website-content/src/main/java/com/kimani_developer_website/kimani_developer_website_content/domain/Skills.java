package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Entity
@Data public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String desc;
    private ArrayList<String>imageLinks;
    private String sectionColour;

    public Skills(){}

    public Skills(Details d){
        super();
        this.details =d;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="details")
    private Details details;


}
