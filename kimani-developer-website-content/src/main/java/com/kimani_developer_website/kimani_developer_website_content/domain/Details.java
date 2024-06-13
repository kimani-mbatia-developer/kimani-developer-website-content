package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String fullName;
    private String role;
    private String description;
    private String skillsPageDescription;

    ArrayList<SellingPoint> sellingPoint;

    String portfolioDesc;

    ArrayList<PortfolioItem> portfolio;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkillsPageDescription() {
        return skillsPageDescription;
    }

    public void setSkillsPageDescription(String skillsPageDescription) {
        this.skillsPageDescription = skillsPageDescription;
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "details")
    List<SellingPoint> sellingPointList;

    public List<SellingPoint> getSellingPointList(){
        return sellingPointList;
    }

    public void setSellingPoint(ArrayList<SellingPoint> s){
        this.sellingPoint = s;
    }







}
