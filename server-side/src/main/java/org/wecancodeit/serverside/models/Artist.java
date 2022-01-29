package org.wecancodeit.serverside.models;

import antlr.actions.python.CodeLexer;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String era;
    @OneToMany(mappedBy = "artists")
    private Collection<WorkOfArt> worksOfArt;


    public Collection<WorkOfArt> getWorksOfArt() {
        return worksOfArt;
    }

    public Artist(){

    }

    public Artist(String name, String era) {
        this.name = name;
        this.era = era;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEra() {
        return era;
    }
}

