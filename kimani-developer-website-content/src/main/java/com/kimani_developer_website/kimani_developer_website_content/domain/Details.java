package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Details {
    @Id
    @GeneratedValue
    private Long id;

    ArrayList<String> headers;

    String fullName;
    String role;
    String description;
    String skillsPageDescription;

    public Details(){};

    public Details(ArrayList<String>headers, String fullName,String role, String description,String skillsPageDescription){
        super();

    }

    public ArrayList<String> getHeaders() {
        return headers;
    }

    public void setHeaders(ArrayList<String> headers) {
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sellingpoint")
    List<SellingPoint> sellingPointList;

    public List<SellingPoint> getSellingPointList(){
        return sellingPointList;
    }







}
