package com.example.demo.model;

import java.util.Date;

public class Post {
    private final String text;
    private Integer likes;

    private Date creationDate;

    public Post(String text, Date creationDate) {
            this.text = text;
            this.likes = 6;
            this.creationDate = creationDate;
    }
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }
}
