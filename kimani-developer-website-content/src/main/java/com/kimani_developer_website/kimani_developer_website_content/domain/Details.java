package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private @Getter @Setter String fullName;
    private @Getter @Setter String role;
    private @Getter @Setter String description;
    private @Getter @Setter String skillsPageDescription;

    private @Getter @Setter ArrayList<SellingPoint> sellingPoint;
    private @Getter @Setter ArrayList<Skills>skills;

    private @Getter @Setter String portfolioDesc;

    private @Getter @Setter ArrayList<PortfolioItem> portfolio;

    String cvText;

    ArrayList<SocialMediaLink> links;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="details", cascade=CascadeType.ALL)
    private List<Header> headers;


    public Details(){};

    public Details(String fullName,String role, String description,
                   String skillsPageDescription,String portfolioDesc
                   ,String cv){
        super();
        this.fullName=fullName;
        this.role=role;
        this.description=description;
        this.skillsPageDescription=skillsPageDescription;
        this.portfolioDesc=portfolioDesc;
        this.cvText = cv;

    }



    public List<Header> getHeaders() {
        return this.headers;
    }

    public void setHeaders(List<Header> headers) {
        this.headers = headers;
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "details")
    List<SellingPoint> sellingPointList;





}
