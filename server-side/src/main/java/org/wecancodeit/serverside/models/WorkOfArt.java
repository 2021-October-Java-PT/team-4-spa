package org.wecancodeit.serverside.models;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class WorkOfArt {

    @Id
    @GeneratedValue
    private Long id;
    private String titleOfWork;
    private String classification;
    private String description;
    @OneToMany
    private Artist artist;

    public WorkOfArt() {
    }

    public Long getId() {
        return id;
    }

    public String getTitleOfWork() {
        return titleOfWork;
    }

    public String getClassification() {
        return classification;
    }

    public String getDescription() {
        return description;
    }

    public Artist getArtist() {
        return artist;
    }

    public WorkOfArt(String titleOfWork, String classification, String description, Artist artist) {
        this.titleOfWork = titleOfWork;
        this.classification = classification;
        this.description = description;
        this.artist = artist;
    }
}


