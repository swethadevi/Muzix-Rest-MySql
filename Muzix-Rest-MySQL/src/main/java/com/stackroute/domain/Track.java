package com.stackroute.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trackId;
    private String trackName;
    private String trackComment;


    public int getId() {
        return trackId;
    }

    public void setId(int id) {
        this.trackId = id;
    }

    public String getName() {
        return trackName;
    }

    public void setName(String name) {
        this.trackName = name;
    }

    public String getComment() {
        return trackComment;
    }

    public void setComment(String comment) {
        this.trackComment = comment;
    }
}
