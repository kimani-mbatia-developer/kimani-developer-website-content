package com.kimani_developer_website.kimani_developer_website_content.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SocialMediaLink {
    @Id
    @GeneratedValue
    private long Id;

    String img; //Directory of image for link e.g linkedin logo should be ../assets/CV/linkedin.png
    String pointer;
    String color;
    String buttonName;
    String buttonColour;
    String link;

    public SocialMediaLink(){}

    public SocialMediaLink(String img, String pointer, String color, String buttonName, String buttonColour, String link){
        super();
        this.img=img;
        this.pointer=pointer;
        this.color=color;
        this.buttonName = buttonName;
        this.buttonColour= buttonColour;
        this.link = link;
    }

}
